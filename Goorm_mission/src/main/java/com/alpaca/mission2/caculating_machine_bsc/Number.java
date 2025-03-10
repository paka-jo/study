package com.alpaca.mission2.caculating_machine_bsc;

import java.util.Scanner;

public class Number {
    //        프로그램 개요
//        시스템 요구 사항
//        1.양의 정수 입력 받기
//        2.사칙연산 수행 (+,-,*,/)
//        3.사칙연산에 맞는 연산 진행
//        4.진행된 연산 결과값 출력
//    클래스 설계하기
//            1.사칙연산 클래스
//            2.숫자 클래스

    private int num1;
    private int num2;
    private char cal;


    //첫번째 숫자
    public void frist() {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력해주세요");
        int num1 = sc.nextInt();
        if (num1 > 0) {
            System.out.println("num1 : " + num1);
            this.num1 = num1;
        } else {
            System.out.println("입력할 수 없습니다.");
        }
    }

    //    부호
    public void cal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("+,-부호를 입력해주세요");
        char cal = sc.next().charAt(0);
        if (cal == '+' || cal == '-') {
            System.out.println("부호:" + cal);
            this.cal = sc.next().charAt(0);

        } else {
            System.out.println("다시 입력해주세요");
        }

    }

    //    두번째 숫자
    public void second() {
        Scanner sc = new Scanner(System.in);
        System.out.println("두번째 숫자를 입력해주세요");
        int num2 = sc.nextInt();
        if (num2 > 0) {
            System.out.println("num2 : " + num2);
            this.num2 = num2;
        } else {
            System.out.println("입력할 수 없습니다");
        }

    }
//    합계
    public void total() {

        int result=0;
        switch (cal) {
            case '+':
                result= num1 + num2;
                break;
            case '-':
                result= num1 - num2;
                break;
                default:
                    System.out.println("잘못 입력하셨습니다");
                    return;
        }
        System.out.println("total : " + result);
    }
}


