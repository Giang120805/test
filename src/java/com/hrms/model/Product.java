package com.hrms.model;

import java.io.Serializable;

public class Product implements Serializable {
    private static final long serialVersionUID = 1L;

    private String productId;
    private String productName;
    private String category;
    private String brand;
    private double importPrice;
    private double salePrice;
    private int stockQuantity;
    private String description;
    private String status;

    private Product() {
    }

    public Product(String productId, String productName, String category, String brand,
                   double importPrice, double salePrice, int stockQuantity, String description,
                   String status) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.brand = brand;
        this.importPrice = importPrice;
        this.salePrice = salePrice;
        this.stockQuantity = stockQuantity;
        this.description = description;
        this.status = status;
    }

    public String getProductId() { return productId; }
    public void setProductId(String productId) { this.productId = productId; }
    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }
    public double getImportPrice() { return importPrice; }
    public void setImportPrice(double importPrice) { this.importPrice = importPrice; }
    public double getSalePrice() { return salePrice; }
    public void setSalePrice(double salePrice) { this.salePrice = salePrice; }
    public int getStockQuantity() { return stockQuantity; }
    public void setStockQuantity(int stockQuantity) { this.stockQuantity = stockQuantity; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return "Product [" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", Category='" + category + '\'' +
                ", Brand='" + brand + '\'' +
                ", ImportPrice=" + importPrice +
                ", SalePrice=" + salePrice +
                ", StockQuantity=" + stockQuantity +
                ", Description='" + description + '\'' +
                ", Status='" + status + '\'' +
                ']';
    }
}
