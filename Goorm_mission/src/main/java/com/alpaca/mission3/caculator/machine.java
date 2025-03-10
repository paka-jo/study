package com.alpaca.mission3.caculator;

import java.util.Scanner;

public class machine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("첫번째 숫자를 입력하세요:");
            double num1 = sc.nextDouble();

            System.out.println("+.-./,*를 입력하세요");
            char ch = sc.next().charAt(0);

            System.out.println("두번째 숫자를 입력하세요");
            double num2 = sc.nextDouble();

            double result = 0;

            switch (ch) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        throw new ArithmeticException("0으로 나눌 수 없습니다");
                    }
                    result = num1 / num2;
                    break;
                default:
                    throw new IllegalAccessException("잘못된 연산자입니다");
            }
            System.out.println("결과: " + result);
        }catch (ArithmeticException e) {
            System.out.println("오류:" + e.getMessage());
        }catch (IllegalAccessException e) {
            System.out.println("오류:" + e.getMessage());
        }catch (Exception e) {
            System.out.println("숫자를 정확히 입력해주세요");
        }
        finally {
            sc.close();
            System.out.println("계산기를 종료합니다");


        }

    }
}
