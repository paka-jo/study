package com.alpaca.mission1;

import java.util.Scanner;

public class Scanner_second {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력해주세요 :");
        int first = sc.nextInt();
        System.out.println("first : " + first);

        System.out.println("두번째 숫자를 입력해주세요 :");
        int second = sc.nextInt();
        System.out.println("second : " + second);

        System.out.println("두 수의 합은" + total(first,second) + "입니다");


    }
    public static int total(int first, int second) {

        return first + second;
    };

}