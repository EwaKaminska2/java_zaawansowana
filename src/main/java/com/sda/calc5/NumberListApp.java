package com.sda.calc5;

import java.util.List;

public class NumberListApp {


    public static void main(String[] args) {
        NumberList<Double> doubleNumberList = new NumberList<>();
        NumberList<Integer> integerNumberList = new NumberList<>();

        doubleNumberList.addNumber(3.3);
        doubleNumberList.addNumber(7.1);
        doubleNumberList.addNumber(1.24);


        System.out.println(doubleNumberList.getAverage());
        System.out.println(doubleNumberList.getIntSum());

        integerNumberList.addNumber(3);
        integerNumberList.addNumber(7);
        integerNumberList.addNumber(2);


        System.out.println(integerNumberList.getAverage());
        System.out.println(integerNumberList.getIntSum());

        System.out.println(doubleNumberList.hasSameIntSum(integerNumberList));
    }
}
