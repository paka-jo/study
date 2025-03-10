package com.alpaca.mission3.DiagramAbsIf;

public class Triangle extends AbstractShape {
    @Override
    public void area() {
        int width = 5;
        int height = 12;
        System.out.println("삼각형의 넓이:" + ((width * height)/2));
    }
}
