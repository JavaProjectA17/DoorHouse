package com.doorshouse;

public class Finance {
    public Finance(Sales[] sales, Purchase[] purchase, Balance[] income, Balance[] charges) {
        this.sales = sales;
        this.purchase = purchase;
        this.income = income;
        this.charges = charges;
    }

    private Sales[] sales;
    private Purchase[] purchase;
    private Balance[] income;
    private Balance[] charges;
}
