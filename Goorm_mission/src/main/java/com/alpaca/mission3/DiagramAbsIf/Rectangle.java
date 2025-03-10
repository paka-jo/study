package com.alpaca.mission3.DiagramAbsIf;

public class Rectangle extends AbstractShape {
    @Override
    public void area() {
        int width = 4;
        int height = 8;
        System.out.println("사각형의 넓이:" +(width*height));
    }
}
