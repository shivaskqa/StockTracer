package com.aitracker.model;

public class AiTool {
    private String name;
    private String parentCompany;
    private String stockTicker;
    private String stockPrice;
    private String subscriberCount;
    private String description;
    private String imageUrl; // For the frontend to display a logo/icon

    public AiTool() {
    }

    public AiTool(String name, String parentCompany, String stockTicker, String stockPrice, String subscriberCount,
            String description, String imageUrl) {
        this.name = name;
        this.parentCompany = parentCompany;
        this.stockTicker = stockTicker;
        this.stockPrice = stockPrice;
        this.subscriberCount = subscriberCount;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentCompany() {
        return parentCompany;
    }

    public void setParentCompany(String parentCompany) {
        this.parentCompany = parentCompany;
    }

    public String getStockTicker() {
        return stockTicker;
    }

    public void setStockTicker(String stockTicker) {
        this.stockTicker = stockTicker;
    }

    public String getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(String stockPrice) {
        this.stockPrice = stockPrice;
    }

    public String getSubscriberCount() {
        return subscriberCount;
    }

    public void setSubscriberCount(String subscriberCount) {
        this.subscriberCount = subscriberCount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
