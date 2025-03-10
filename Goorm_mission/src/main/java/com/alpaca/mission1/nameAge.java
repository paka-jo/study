package com.alpaca.mission1;

import java.util.Scanner;

public class nameAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("당신의 이름이 무엇입니까?");
        System.out.println("이름: ");
        String name = sc.nextLine();

        System.out.println("당신의 나이는 몇살입니까?");
        System.out.println("나이: ");
        int age = sc.nextInt();

        System.out.println("이름:" + name + " 나이:" + age );

    }
}
