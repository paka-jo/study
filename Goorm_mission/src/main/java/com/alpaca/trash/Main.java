package com.alpaca.trash;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("원하는 숫자들을 차례로 입력하세요");
        String input = sc.nextLine();
        String[] arr = input.split(" ");

        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = Integer.parseInt(arr[i]);
        }

        System.out.println("입력한 배열:" + Arrays.toString(arr2));
    }
}
