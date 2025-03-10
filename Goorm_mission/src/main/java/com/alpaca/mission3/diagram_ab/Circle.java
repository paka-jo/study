package com.alpaca.mission3.diagram_ab;

public class Circle extends Diagram {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
