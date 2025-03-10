package com.alpaca.mission3.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Types_of_Array {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("입력할 정수 배열 개수를 입력하세요: ");
        int T = Integer.parseInt(br.readLine()); // 여러 개의 배열을 입력받음

        for (int t = 0; t < T; t++) {
            System.out.print("정수 개수를 입력해주세요: ");
            int N = Integer.parseInt(br.readLine()); // 현재 배열의 크기

            int[] array = new int[N];

            System.out.println("정수 " + N + "개를 입력하세요:");
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                array[i] = Integer.parseInt(st.nextToken());
            }

            // 간단한 버블 정렬 (오름차순 정렬)
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length - 1 - i; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }

            System.out.print("정렬된 결과: ");
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
