package com.alpaca.mission3.member;

public class Employee  {
 protected String name;
 protected double salary;


    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;

    }
    public void display() {

        System.out.println("이름:"+name);
        System.out.println("급여:"+salary);
    }
}
