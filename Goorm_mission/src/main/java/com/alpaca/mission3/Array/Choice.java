package com.alpaca.mission3.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Choice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("입력하실 정수의 개수를 입력해주세요");
        int N = Integer.parseInt(br.readLine()); // 정수 개수 입력
        int[] array = new int[N];

        System.out.println(N + "개의 정수를 입력하세요:");
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }

        System.out.print("정렬된 결과: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
    }

