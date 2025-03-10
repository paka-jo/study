package com.alpaca.mission3;

import java.util.Scanner;

public class string {
//    사용자로부터 문자열을 입력받습니다. 입력받은 문자열을 뒤집어 출력합니다.
//    입력받은 문자열의 대소문자를 변환하여 출력합니다. 결과물로 사용자가 입력한 문자열을 뒤집고 대소문자를 변환하여 출력하는 스크린샷을 제출합니다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("영어로 단어를 입력해주세요");
       String str = sc.nextLine();
        System.out.println(str.toUpperCase());
        String cl = str.toUpperCase();


        StringBuilder sbr = new StringBuilder(cl);
        System.out.println(sbr.reverse());
        String sl = sbr.toString();
        System.out.println(sl.toLowerCase());








    }
}
