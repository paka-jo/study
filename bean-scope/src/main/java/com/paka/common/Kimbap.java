package com.paka.common;

public class Kimbap extends Product{

    private int gram;

    public Kimbap() {super();}

    public Kimbap(String name, int price, int gram) {
        super(name, price);
        this.gram = gram;
    }

    public int getGram() {
        return gram;
    }

    public void setGram(int gram) {
        this.gram = gram;
    }

    @Override
    public String toString() {
        return super.toString()+ " "+gram;
    }
}
