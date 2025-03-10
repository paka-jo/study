package com.alpaca.mission2;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
//        Java 프로그램을 작성하여 사용자 입력을 받고, 다양한 조건과 배열을 처리하는 과정을 학습합니다.
//        입력된 데이터를 정렬, 산술 연산, 평균 계산 등 다양한 연산을 수행하여 결과를 출력하는 프로그램을 작성합니다.

        int[] num = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i< num.length; i++) {
            System.out.println((i+1) +" 번쨰 숫자를 입력하세요");
            num[i] = sc.nextInt();
        }
        int sum = 0;
        int avg = 0;

        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }

        avg = sum/num.length;

        System.out.println("sum: " + sum );
        System.out.println("avg: " + avg);

        }



    }
