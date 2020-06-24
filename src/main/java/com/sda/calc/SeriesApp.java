package com.sda.calc;

public class SeriesApp {
    public static void main(String[] args) {
        ByTwo byTwo=new ByTwo(2,4);

        System.out.println(byTwo.getNext());
       //byTwo.setStart(0);
       // System.out.println();
        System.out.println(byTwo.reset());
    }
}
