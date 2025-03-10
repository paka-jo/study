package com.alpaca.mission1;

public class num_first {
    public static void main(String[] args) {


    int A= 300;
    int B= 295;

    Compare cp = new Compare();
    int min = cp.minNum(A, B);

    System.out.println("두수의 최소값 :" + min);

    int max = cp.maxNum(A, B);
        System.out.println("두수의 최대값 :" + max);


    }


}
