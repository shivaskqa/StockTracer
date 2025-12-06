package com.aitracker.service;

import com.aitracker.model.AiTool;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class AiToolService {

    private final List<AiTool> allTools = new ArrayList<>();
    private final Random random = new Random();

    public AiToolService() {
        initializeMockData();
    }

    private void initializeMockData() {
        allTools.add(new AiTool("ChatGPT", "Microsoft (Partner)", "MSFT", "$374.23", "180.5M",
                "Advanced conversational AI by OpenAI.",
                "https://upload.wikimedia.org/wikipedia/commons/0/04/ChatGPT_logo.svg"));
        allTools.add(new AiTool("Gemini", "Google (Alphabet)", "GOOGL", "$138.45", "100.2M",
                "Google's most capable AI model.",
                "https://upload.wikimedia.org/wikipedia/commons/8/8a/Google_Gemini_logo.svg"));
        allTools.add(new AiTool("Claude", "Amazon (Investor)", "AMZN", "$146.32", "45.8M",
                "Helpful and harmless AI assistant by Anthropic.",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/7/78/Anthropic_logo.svg/2560px-Anthropic_logo.svg.png"));
        allTools.add(new AiTool("Copilot", "Microsoft", "MSFT", "$374.23", "75.0M",
                "Your everyday AI companion from Microsoft.",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2a/Microsoft_365_Copilot_Icon.svg/1024px-Microsoft_365_Copilot_Icon.svg.png"));
        allTools.add(new AiTool("Jasper", "Privately Held", "N/A", "N/A", "2.1M", "AI copywriter for marketing teams.",
                "https://assets-global.website-files.com/60e5f2de6392cf57d590e9d7/6335aa948e9c323f49ca307c_jasper-logo-black.svg"));
        allTools.add(
                new AiTool("Midjourney", "Privately Held", "N/A", "N/A", "16.5M", "Generative AI program for images.",
                        "https://upload.wikimedia.org/wikipedia/commons/e/ed/Midjourney_Emblem.png"));
        allTools.add(new AiTool("Stable Diffusion", "Stability AI", "N/A", "N/A", "10.0M",
                "Deep learning text-to-image model.",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/8/8d/Stability.ai_Logo_2024.svg/200px-Stability.ai_Logo_2024.svg.png"));
        allTools.add(new AiTool("Grok", "Twitter (X)", "N/A", "N/A", "5.4M", "AI chatbot by xAI.",
                "https://upload.wikimedia.org/wikipedia/commons/f/f0/Grok_logo.svg"));
        allTools.add(new AiTool("Perplexity", "Privately Held", "N/A", "N/A", "8.9M", "Conversational search engine.",
                "https://upload.wikimedia.org/wikipedia/commons/1/14/Perplexity_AI_logo.svg"));
        allTools.add(new AiTool("Hugging Face", "Privately Held", "N/A", "N/A", "4.2M",
                "The AI community building the future.",
                "https://huggingface.co/front/assets/huggingface_logo-noborder.svg"));
        allTools.add(
                new AiTool("Notion AI", "Privately Held", "N/A", "N/A", "30.0M", "Connected workspace AI assistant.",
                        "https://upload.wikimedia.org/wikipedia/commons/4/45/Notion_app_logo.png"));
        allTools.add(
                new AiTool("Runway", "Privately Held", "N/A", "N/A", "1.5M", "AI research shaping the next era of art.",
                        "https://upload.wikimedia.org/wikipedia/commons/1/18/Runway_AI_Logo.png"));
    }

    public List<AiTool> getTop10Tools() {
        // In a real app, we would sort by subscribers or trending score.
        // For now, return the first 10.
        // Update prices slightly to make it look 'live'
        updateMockPrices();
        return allTools.subList(0, Math.min(allTools.size(), 10));
    }

    public List<AiTool> searchTools(String query) {
        if (query == null || query.trim().isEmpty()) {
            return getTop10Tools();
        }
        String lowerQuery = query.toLowerCase();
        return allTools.stream()
                .filter(t -> t.getName().toLowerCase().contains(lowerQuery) ||
                        t.getDescription().toLowerCase().contains(lowerQuery) ||
                        t.getParentCompany().toLowerCase().contains(lowerQuery))
                .collect(Collectors.toList());
    }

    private void updateMockPrices() {
        for (AiTool tool : allTools) {
            if (!"N/A".equals(tool.getStockPrice())) {
                // Fluctuate price slightly
                double currentPrice = Double.parseDouble(tool.getStockPrice().replace("$", ""));
                double change = (random.nextDouble() - 0.5) * 0.5; // +/- 0.25
                tool.setStockPrice(String.format("$%.2f", currentPrice + change));
            }
        }
    }
}
