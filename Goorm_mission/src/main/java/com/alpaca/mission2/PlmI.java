package com.alpaca.mission2;

import java.util.Scanner;

public class PlmI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력해주세요");
        int first = sc.nextInt();
        System.out.println("두번째 숫자를 입력해주세요");
        int second = sc.nextInt();
        System.out.println("두수의 합은:" +(first+second) + "입니다");
        System.out.println("두수의 차는:" +(first-second) + "입니다");
    }
}
