package com.paka.common;

import java.util.Date;

public class Chicken extends Product{

    private java.util.Date expirationDate;

    public Chicken() {super();}

    public Chicken(String name, int price, Date expirationDate) {
        super(name, price);
        this.expirationDate = expirationDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return super.toString() + " " + expirationDate;
    }
}

