package com.alpaca.mission3.diagram_interface;

public class Triangle implements Diagram {
    private int height;
    private int width;
    public Triangle(int height, int width) {
        this.height = height;
        this.width = width;
    }
    @Override
    public double area(){
        return (height * width)/2;
    }
}

