package com.alpaca.mission3.Thread;

public class Multi {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            TrA myThing = new TrA();
            TrB myThing2 = new TrB();
        myThing.start();
        myThing2.start();




        }
    }



}
