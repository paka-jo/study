package com.alpaca.mission3.Thread;

public class TrA extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("thread1: "+ i);
            try {Thread.sleep(1000);

            }catch (InterruptedException e){


            }

        }

    }
}
