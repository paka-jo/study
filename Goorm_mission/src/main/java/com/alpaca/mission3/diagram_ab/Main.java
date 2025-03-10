package com.alpaca.mission3.diagram_ab;

public class Main {
    public static void main(String[] args) {
        Diagram[] diagrams = new Diagram[3];

        diagrams[0] = new Circle(12);
        diagrams[1] = new Rectangle(4, 12);
        diagrams[2] = new Triangle(6, 12);

        for (Diagram diagram : diagrams) {
            System.out.println("도형의 면적: " + diagram.area());
        }
    }
}
