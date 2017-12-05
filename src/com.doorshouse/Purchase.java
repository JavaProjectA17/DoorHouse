package com.doorshouse;

import java.util.Date;

public class Purchase {

    public Purchase(EntryNote[] entryNote, Date date, Supplier supplier, Stock stock) {
        this.entryNote = entryNote;
        this.date = date;
        this.supplier = supplier;
        this.stock = stock;
    }

    private EntryNote[] entryNote;
    private Date date;
    private Supplier supplier;
    private Stock stock;
}
