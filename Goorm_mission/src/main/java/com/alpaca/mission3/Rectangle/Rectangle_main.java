package com.alpaca.mission3.Rectangle;

public class Rectangle_main {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(5,6);

        System.out.println("직사각형의 넓이:" + rec.area());
        System.out.println("직사각형의 너비:" + rec.perimeter());
    }
}
