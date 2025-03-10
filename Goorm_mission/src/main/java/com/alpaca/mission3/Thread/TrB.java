package com.alpaca.mission3.Thread;

public class TrB extends Thread {
   @Override
    public void run() {
       for (int i = 5; i <=9; i++) {
           System.out.println("thread2:" +i);
           try {
               Thread.sleep(1000);

           }
           catch (InterruptedException e){


           }

       }
   }
}
