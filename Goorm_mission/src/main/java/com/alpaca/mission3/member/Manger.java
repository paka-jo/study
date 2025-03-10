package com.alpaca.mission3.member;

public class Manger extends Employee {
    private String position;

    public Manger(String name, double salary ,String position ) {
        super(name, salary);
        this.position = position;

    }

    @Override
    public void display() {
        super.display();
        System.out.println("직책:"+position);
    }





    }


