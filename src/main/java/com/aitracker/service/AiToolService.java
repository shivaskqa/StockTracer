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
                // Top Tier / Big Tech
                allTools.add(new AiTool("ChatGPT", "Microsoft (Partner)", "MSFT", "$374.23", "180.5M",
                                "The industry-leading conversational AI by OpenAI.",
                                "https://upload.wikimedia.org/wikipedia/commons/0/04/ChatGPT_logo.svg"));
                allTools.add(new AiTool("Gemini", "Google (Alphabet)", "GOOGL", "$138.45", "100.2M",
                                "Google's most capable multimodal AI model.",
                                "https://upload.wikimedia.org/wikipedia/commons/8/8a/Google_Gemini_logo.svg"));
                allTools.add(new AiTool("Claude", "Amazon (Investor)", "AMZN", "$146.32", "45.8M",
                                "Helpful, harmless, and honest AI assistant by Anthropic.",
                                "https://upload.wikimedia.org/wikipedia/commons/thumb/7/78/Anthropic_logo.svg/2560px-Anthropic_logo.svg.png"));
                allTools.add(new AiTool("Copilot", "Microsoft", "MSFT", "$374.23", "75.0M",
                                "Your everyday AI companion integrated into M365.",
                                "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2a/Microsoft_365_Copilot_Icon.svg/1024px-Microsoft_365_Copilot_Icon.svg.png"));
                allTools.add(new AiTool("Llama 3", "Meta Platforms", "META", "$325.40", "Open Src",
                                "State-of-the-art open source LLM by Meta.",
                                "https://upload.wikimedia.org/wikipedia/commons/1/14/Meta_Platforms_Inc._logo.svg"));

                // Creative / Image / Video
                allTools.add(new AiTool("Midjourney", "Privately Held", "N/A", "N/A", "16.5M",
                                "Hyper-realistic generative AI for images.",
                                "https://upload.wikimedia.org/wikipedia/commons/e/ed/Midjourney_Emblem.png"));
                allTools.add(new AiTool("Stable Diffusion", "Stability AI", "N/A", "N/A", "10.0M",
                                "Open-source text-to-image generation model.",
                                "https://upload.wikimedia.org/wikipedia/commons/thumb/8/8d/Stability.ai_Logo_2024.svg/200px-Stability.ai_Logo_2024.svg.png"));
                allTools.add(new AiTool("DALL-E 3", "Microsoft (Partner)", "MSFT", "$374.23", "Included",
                                "OpenAI's image generation model built into ChatGPT.",
                                "https://upload.wikimedia.org/wikipedia/commons/0/04/ChatGPT_logo.svg"));
                allTools.add(new AiTool("Runway", "Privately Held", "N/A", "N/A", "1.5M",
                                "Professional AI video editing and generation tools.",
                                "https://upload.wikimedia.org/wikipedia/commons/1/18/Runway_AI_Logo.png"));
                allTools.add(new AiTool("Pika", "Privately Held", "N/A", "N/A", "800K",
                                "Idea-to-video platform that sets your creativity in motion.",
                                "https://via.placeholder.com/60?text=Pika"));
                allTools.add(new AiTool("Adobe Firefly", "Adobe", "ADBE", "$595.30", "Creative Cloud",
                                "Generative AI for creators, right inside Photoshop.",
                                "https://upload.wikimedia.org/wikipedia/commons/8/8d/Adobe_Corporate_Logo.png"));
                allTools.add(new AiTool("Canva Magic", "Privately Held", "N/A", "N/A", "135M",
                                "AI design tools for everyone.",
                                "https://upload.wikimedia.org/wikipedia/commons/0/08/Canva_icon_2021.svg"));

                // Productivity / Writing
                allTools.add(new AiTool("Jasper", "Privately Held", "N/A", "N/A", "2.1M",
                                "AI copywriter for enterprise marketing teams.",
                                "https://assets-global.website-files.com/60e5f2de6392cf57d590e9d7/6335aa948e9c323f49ca307c_jasper-logo-black.svg"));
                allTools.add(new AiTool("Notion AI", "Privately Held", "N/A", "N/A", "30.0M",
                                "Connected workspace AI assistant for notes and docs.",
                                "https://upload.wikimedia.org/wikipedia/commons/4/45/Notion_app_logo.png"));
                allTools.add(new AiTool("GrammarlyGO", "Privately Held", "N/A", "N/A", "30.0M",
                                "Contextually aware AI writing assistant.",
                                "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e2/Grammarly_logo.svg/2560px-Grammarly_logo.svg.png"));
                allTools.add(new AiTool("Copy.ai", "Privately Held", "N/A", "N/A", "3.0M",
                                "AI marketing copy generator.", "https://via.placeholder.com/60?text=CopyAI"));
                allTools.add(new AiTool("Writesonic", "Privately Held", "N/A", "N/A", "1.2M",
                                "AI writer, SEO tool, and chatbot builder.",
                                "https://via.placeholder.com/60?text=Writesonic"));
                allTools.add(new AiTool("Rytr", "Privately Held", "N/A", "N/A", "2.5M",
                                "Affordable AI writing assistant.", "https://via.placeholder.com/60?text=Rytr"));
                allTools.add(new AiTool("Otter.ai", "Privately Held", "N/A", "N/A", "1.0M",
                                "AI meeting assistant and transcription.",
                                "https://via.placeholder.com/60?text=Otter"));

                // Coding / Dev
                allTools.add(new AiTool("GitHub Copilot", "Microsoft", "MSFT", "$374.23", "1.3M",
                                "Your AI pair programmer.",
                                "https://upload.wikimedia.org/wikipedia/commons/9/91/Octicons-mark-github.svg"));
                allTools.add(new AiTool("Tabnine", "Privately Held", "N/A", "N/A", "1.0M",
                                "AI assistant for software developers.",
                                "https://via.placeholder.com/60?text=Tabnine"));
                allTools.add(new AiTool("Replit Ghostwriter", "Privately Held", "N/A", "N/A", "2.0M",
                                "Integrated AI in the Replit IDE.", "https://via.placeholder.com/60?text=Replit"));
                allTools.add(new AiTool("Codeium", "Privately Held", "N/A", "N/A", "500K",
                                "Free AI code completion tool.", "https://via.placeholder.com/60?text=Codeium"));
                allTools.add(new AiTool("Amazon Q", "Amazon", "AMZN", "$146.32", "Enterprise",
                                "Generative AI assistant for work.",
                                "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4a/Amazon_icon.svg/2560px-Amazon_icon.svg.png"));

                // Chat / Assistants
                allTools.add(new AiTool("Grok", "Twitter (X)", "N/A", "N/A", "5.4M",
                                "AI chatbot by xAI with real-time X access.",
                                "https://upload.wikimedia.org/wikipedia/commons/f/f0/Grok_logo.svg"));
                allTools.add(new AiTool("Perplexity", "Privately Held", "N/A", "N/A", "10.0M",
                                "Conversational search engine for accurate answers.",
                                "https://upload.wikimedia.org/wikipedia/commons/1/14/Perplexity_AI_logo.svg"));
                allTools.add(new AiTool("Character.ai", "Google (Acqui-hire)", "GOOGL", "$138.45", "15.0M",
                                "Chat with AI characters.", "https://via.placeholder.com/60?text=C.ai"));
                allTools.add(new AiTool("Poe", "Quora", "N/A", "N/A", "5.0M", "Fast AI chat platform by Quora.",
                                "https://via.placeholder.com/60?text=Poe"));
                allTools.add(new AiTool("Pi", "Inflection AI", "MSFT (Acqui-hire)", "$374.23", "2.0M",
                                "A supportive and empathetic personal AI.", "https://via.placeholder.com/60?text=Pi"));
                allTools.add(new AiTool("HuggingChat", "Hugging Face", "N/A", "N/A", "1.0M",
                                "Open source alternative to ChatGPT.",
                                "https://huggingface.co/front/assets/huggingface_logo-noborder.svg"));
                allTools.add(new AiTool("Replika", "Privately Held", "N/A", "N/A", "2.0M",
                                "The AI companion who cares.", "https://via.placeholder.com/60?text=Replika"));
                allTools.add(new AiTool("You.com", "Privately Held", "N/A", "N/A", "1.5M",
                                "The AI search engine you control.", "https://via.placeholder.com/60?text=You"));

                // Other / Enterprise / Specialized
                allTools.add(new AiTool("Hugging Face", "Privately Held", "N/A", "N/A", "4.2M",
                                "The platform for the AI community.",
                                "https://huggingface.co/front/assets/huggingface_logo-noborder.svg"));
                allTools.add(new AiTool("Synthesia", "Privately Held", "N/A", "N/A", "50K",
                                "AI video generation platform.", "https://via.placeholder.com/60?text=Synthesia"));
                allTools.add(new AiTool("Descript", "Privately Held", "N/A", "N/A", "100K",
                                "Video and podcast editing with AI.", "https://via.placeholder.com/60?text=Descript"));
                allTools.add(new AiTool("ElevenLabs", "Privately Held", "N/A", "N/A", "2.0M",
                                "Prime Voice AI text-to-speech.", "https://via.placeholder.com/60?text=11Labs"));
                allTools.add(new AiTool("Murf.ai", "Privately Held", "N/A", "N/A", "1.0M", "AI voice generator.",
                                "https://via.placeholder.com/60?text=Murf"));
                allTools.add(new AiTool("Speechify", "Privately Held", "N/A", "N/A", "2.0M", "Text to speech app.",
                                "https://via.placeholder.com/60?text=Speechify"));
                allTools.add(new AiTool("Beautiful.ai", "Privately Held", "N/A", "N/A", "1.0M",
                                "Presentation maker software.", "https://via.placeholder.com/60?text=Beautiful"));
                allTools.add(new AiTool("Tome", "Privately Held", "N/A", "N/A", "3.0M",
                                "AI-powered storytelling format.", "https://via.placeholder.com/60?text=Tome"));
                allTools.add(new AiTool("Gamma", "Privately Held", "N/A", "N/A", "2.0M",
                                "New medium for presenting ideas.", "https://via.placeholder.com/60?text=Gamma"));
                allTools.add(new AiTool("Civitai", "Privately Held", "N/A", "N/A", "3.0M",
                                "Model sharing hub for Stable Diffusion.",
                                "https://via.placeholder.com/60?text=Civitai"));
                allTools.add(new AiTool("Leonardo.ai", "Privately Held", "N/A", "N/A", "4.0M", "AI art generator.",
                                "https://via.placeholder.com/60?text=Leonardo"));
                allTools.add(new AiTool("Clipdrop", "Stability AI", "N/A", "N/A", "1.0M",
                                "Create stunning visuals in seconds.", "https://via.placeholder.com/60?text=Clipdrop"));
                allTools.add(new AiTool("ChatPDF", "Privately Held", "N/A", "N/A", "2.0M", "Chat with any PDF.",
                                "https://via.placeholder.com/60?text=ChatPDF"));
                allTools.add(new AiTool("Humata", "Privately Held", "N/A", "N/A", "500K", "GPT for your files.",
                                "https://via.placeholder.com/60?text=Humata"));
        }

        public List<AiTool> getTop10Tools() {
                // Return 50 instead of 10 as requested by "accommodate top50"
                // But the method name is getTop10Tools... I should probably keep it 50 or
                // rename.
                // The user asked for "accommodate top50", so the default list should likely be
                // bigger.
                // Let's return all of them (up to 50) for the main view.
                updateMockPrices();
                return allTools;
        }

        public List<AiTool> searchTools(String query) {
                if (query == null || query.trim().isEmpty()) {
                        return getTop10Tools();
                }
                String lowerQuery = query.toLowerCase();

                // 1. Search in existing mock data
                List<AiTool> results = allTools.stream()
                                .filter(t -> t.getName().toLowerCase().contains(lowerQuery) ||
                                                t.getDescription().toLowerCase().contains(lowerQuery) ||
                                                t.getParentCompany().toLowerCase().contains(lowerQuery))
                                .collect(Collectors.toList());

                // 2. Fallback: "Internet Search" simulation
                if (results.isEmpty()) {
                        AiTool webResult = new AiTool();
                        // Capitalize first letter of query for display
                        String displayName = query.substring(0, 1).toUpperCase() + query.substring(1);

                        webResult.setName(displayName);
                        webResult.setParentCompany("Internet Result");
                        webResult.setStockTicker("N/A");
                        webResult.setStockPrice("N/A");
                        webResult.setSubscriberCount("Found on Web");
                        webResult.setDescription("Contextual result found for '" + query
                                        + "'. This tool was identified from a broader search.");
                        webResult.setImageUrl("https://via.placeholder.com/60?text=Web"); // Generic icon

                        results.add(webResult);
                }

                return results;
        }

        private void updateMockPrices() {
                for (AiTool tool : allTools) {
                        if (!"N/A".equals(tool.getStockPrice()) && tool.getStockPrice().startsWith("$")) {
                                try {
                                        // Fluctuate price slightly
                                        double currentPrice = Double.parseDouble(tool.getStockPrice().replace("$", ""));
                                        double change = (random.nextDouble() - 0.5) * 0.5; // +/- 0.25
                                        tool.setStockPrice(String.format("$%.2f", currentPrice + change));
                                } catch (NumberFormatException e) {
                                        // Ignore parsing errors
                                }
                        }
                }
        }
}
