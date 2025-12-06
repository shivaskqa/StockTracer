const API_BASE = '/api/tools';
const searchInput = document.getElementById('searchInput');
const toolsGrid = document.getElementById('toolsGrid');

// Debounce function to limit API calls during typing
function debounce(func, wait) {
    let timeout;
    return function executedFunction(...args) {
        const later = () => {
            clearTimeout(timeout);
            func(...args);
        };
        clearTimeout(timeout);
        timeout = setTimeout(later, wait);
    };
}

async function fetchTools(query = '') {
    toolsGrid.innerHTML = '<div class="loading">Loading...</div>';

    try {
        let url = query
            ? `${API_BASE}/search?q=${encodeURIComponent(query)}`
            : `${API_BASE}/top10`;

        const response = await fetch(url);
        const tools = await response.json();

        renderTools(tools);
    } catch (error) {
        console.error('Error fetching tools:', error);
        toolsGrid.innerHTML = '<div class="loading">Error loading tools. Please try again.</div>';
    }
}

function renderTools(tools) {
    if (tools.length === 0) {
        toolsGrid.innerHTML = '<div class="loading">No tools found matching your search.</div>';
        return;
    }

    toolsGrid.innerHTML = tools.map(tool => {
        // Determine stock color/status (simple logic for demo)
        const isPublic = tool.stockPrice !== 'N/A';
        const priceClass = isPublic ? 'stock-up' : 'stock-neutral';

        return `
            <div class="tool-card">
                <div class="card-header">
                    <img src="${tool.imageUrl}" alt="${tool.name}" class="tool-icon" onerror="this.src='https://via.placeholder.com/60?text=AI'">
                    <div class="tool-info">
                        <h2>${tool.name}</h2>
                        <div class="company-name">${tool.parentCompany} ${tool.stockTicker !== 'N/A' ? `(${tool.stockTicker})` : ''}</div>
                    </div>
                </div>
                <div class="tool-desc">${tool.description}</div>
                <div class="stats-grid">
                    <div class="stat-item">
                        <span class="stat-label">Subscribers</span>
                        <span class="stat-value">${tool.subscriberCount}</span>
                    </div>
                    <div class="stat-item">
                        <span class="stat-label">Stock Price</span>
                        <span class="stat-value ${priceClass}">${tool.stockPrice}</span>
                    </div>
                </div>
            </div>
        `;
    }).join('');
}

// Event Listeners
document.addEventListener('DOMContentLoaded', () => {
    fetchTools(); // Initial fetch
});

searchInput.addEventListener('input', debounce((e) => {
    fetchTools(e.target.value);
}, 300));
