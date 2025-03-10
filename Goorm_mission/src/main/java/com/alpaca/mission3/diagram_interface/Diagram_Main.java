package com.alpaca.mission3.diagram_interface;

public class Diagram_Main {
    public static void main(String[] args) {
        Diagram Circle = new Circle(5);
        Diagram Rectangle = new Rectangle(5, 5);
        Diagram Triangle = new Triangle(5, 5);

        System.out.println("원의 면적: " + Circle.area());
        System.out.println("사각형의 면적: " + Rectangle.area());
        System.out.println("삼각형의 면적: " + Triangle.area());
    }
}
