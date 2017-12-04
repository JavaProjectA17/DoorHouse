package com.doorshouse;

public class Product {
    public Product(String name, String type, int id, int purchasePrice, int sellingPrice) {
        this.name = name;
        this.type = type;
        this.id = id;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
    }

    private String name;
    private String type;
    private int id;
    private int purchasePrice;
    private int sellingPrice;
}
