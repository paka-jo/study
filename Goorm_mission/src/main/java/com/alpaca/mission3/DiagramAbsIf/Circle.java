package com.alpaca.mission3.DiagramAbsIf;

public class Circle extends AbstractShape {
    @Override
    public void area() {
        int r= 3;
        System.out.println("원의 넓이:" + (Math.PI*(r*r) ));

    }
}
