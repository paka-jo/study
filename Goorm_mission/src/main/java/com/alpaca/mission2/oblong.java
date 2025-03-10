package com.alpaca.mission2;

import java.util.Scanner;

public class oblong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("가로의 길이를 입력해주세요:");
        int  width = sc.nextInt();

        System.out.println("세로의 길이를 입력해주세요:");
        int  height = sc.nextInt();

        System.out.println("직사각형의 넓이:" +(width*height));



    }
}
