package com.alpaca.mission3.DiagramAbsIf;

public class Main {
    public static void main(String[] args) {
        AbstractShape circle = new Circle();
        AbstractShape rectangle = new Rectangle();
        AbstractShape triangle = new Triangle();

        System.out.println("도형의 면적");
        circle.area();
        rectangle.area();
        triangle.area();


    }
}
