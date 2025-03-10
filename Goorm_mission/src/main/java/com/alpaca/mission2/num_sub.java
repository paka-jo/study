package com.alpaca.mission2;

import java.util.Scanner;

public class num_sub {

    public void Ascending(){
        for(int i=1;i<=5;i++) {
            System.out.println("i = "+i);

        }

    }


    public void array(){
      int[] num = new int[10];
      num[0] = 1;
      num[1] = 2;
      num[2] = 3;
      num[3] = 4;
      num[4] = 5;
      num[5] = 6;
      num[6] = 7;
      num[7] = 8;
      num[8] = 9;
      num[9] = 10;

      for(int i=0;i<num.length;i++) {
          System.out.println("num"+i+":"+num[i]);
      }

    }


    public void EvenOdd(){
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요");
        int num = sc.nextInt();

        if (num%2==0) {
            System.out.println("짝수");
        }
        else {
            System.out.println("홀수");
        }



    }



}
