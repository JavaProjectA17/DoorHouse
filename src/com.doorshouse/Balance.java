package com.doorshouse;

import java.util.Date;

public class Balance {
    public Balance(String name, int sum, Date date){
        this.name = name;
        this.sum = sum;
        this.date = date;
    }
    private String name;
    private int sum;
    private Date date;
}
