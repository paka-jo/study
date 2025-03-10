package com.alpaca.mission3.member;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("들리",4000000));
        employees.add(new Manger("홍길동",6000000,"팀장"));

        for (Employee employee : employees) {
            System.out.println("========직원정보========");
            employee.display();
        }

    }
}
