package com.doorshouse;

public class Shop {
    public Shop(Product[] products, Staff[] staff, Stock[] stocks, Customer[] customers, Finance finance, Transport[] transports, Supplier[] suppliers){
        this.products = products;
        this.staff = staff;
        this.stocks = stocks;
        this.customers = customers;
        this.finance = finance;
        this.transports = transports;
        this.suppliers = suppliers;
    }
    private Product[] products;
    private Staff[] staff;
    private Stock[] stocks;
    private Customer[] customers;
    private Finance finance;
    private Transport[] transports;
    private Supplier[] suppliers;
}
