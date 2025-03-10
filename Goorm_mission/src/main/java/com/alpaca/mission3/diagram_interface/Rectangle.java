package com.alpaca.mission3.diagram_interface;

public class Rectangle implements Diagram {
    private double height;
    private double width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }
    @Override
    public double area() {
        return height *width ;
    }

}
