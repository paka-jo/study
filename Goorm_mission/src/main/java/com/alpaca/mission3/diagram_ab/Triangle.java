package com.alpaca.mission3.diagram_ab;

public class Triangle extends Diagram {
    private double width;
    private double height;

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    double area() {
        return (width * height)/2;
    }
}
