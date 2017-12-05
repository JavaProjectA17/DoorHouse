package com.doorshouse;

import java.util.Date;

public class Sale {

    public Sale(EntryNote[] entryNote, Date saleDate, Customer customer) {
        this.entryNote = entryNote;
        this.saleDate = saleDate;
        this.customer = customer;
    }

    private EntryNote[] entryNote;
    private Date saleDate;
    private Customer customer;
}
