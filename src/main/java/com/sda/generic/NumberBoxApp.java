package com.sda.generic;

public class NumberBoxApp {
    public static void main(String[] args) {
        NumberBox<Integer> integerBox = new NumberBox<>();
        integerBox.setT(1234);

        NumberBox<Double> doubleBox = new NumberBox<>();
        doubleBox.setT(1234.0);

        System.out.println( integerBox.hasSameValue(doubleBox));

    }
}
