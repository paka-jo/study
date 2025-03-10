package com.alpaca.mission3.Lamda;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요 ");
        double num1 = sc.nextInt();
        System.out.println("두번째 숫자를 입력해주세요");
        double num2 = sc.nextInt();

        Calculator cala = (x, y) -> x + y;
        System.out.println("두수의 합은:" + cala.sum(num1,num2));
        Calculator calb = (x, y) -> x - y;
        System.out.println("두수의 차은:" + calb.sum(num1,num2));
        Calculator calc = (x, y) -> x * y;
        System.out.println("두수의 곱은:" + calc.sum(num1,num2));
        Calculator cald = (x, y) -> x / y;
        System.out.println("두개의 몫은:" + cald.sum(num1,num2));





    }
}
