package com.alpaca.mission2.caculating_machine_bsc;

import java.util.Scanner;

public class PlusMinus {

    public static void main(String[] args) {

        User user = new User();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("=====계산기=====");
            System.out.println("계산기가 작동됐습니다");
            System.out.println("숫자는 양수만 가능합니다");
            System.out.println("1. 첫번째 숫자 입력");
            System.out.println("2. 연산 입력");
            System.out.println("3. 두번째 숫자 입력");
            System.out.println("4. 합계");
            System.out.println("0. 계산기 종료");
            System.out.print("메뉴선택:");
            int error = sc.nextInt();

            switch (error) {
                case 1:
                    user.first();
                    break;
                case 2:
                    user.cal();
                    break;
                case 3:
                    user.second();
                    break;
                case 4:
                    user.total();
                    break;
                case 0:
                    System.out.println("계산기를 종료합니다");
                    break;
                default:
                    System.out.println("잘못된 번호입니다");
                    break;
            }
            if (error == 0) {
                break;
            }
        }
    }
}





