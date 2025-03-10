package com.alpaca.mission3.diagram_interface;

public class Circle implements Diagram {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;



    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }
}
