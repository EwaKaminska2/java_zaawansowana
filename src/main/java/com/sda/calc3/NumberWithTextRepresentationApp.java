package com.sda.calc3;

public class NumberWithTextRepresentationApp {
    public static void main(String[] args) {

        NumberWithTextRepresentation<Integer,String> intNumber =
                new NumberWithTextRepresentation<>(1,"one");
        System.out.println(intNumber.getNumber());
        System.out.println(intNumber.getName());

        NumberWithTextRepresentation<Double,String> doubleNumber =
                new NumberWithTextRepresentation<>(2.0,"two");
        System.out.println(doubleNumber.getNumber());
        System.out.println(doubleNumber.getName());

        NumberWithTextRepresentation<Long,String> longNumber =
                new NumberWithTextRepresentation<>(3L,"three");
        System.out.println(longNumber.getNumber());
        System.out.println(longNumber.getName());

        NumberWithTextRepresentation<Float,String> floatNumber =
                new NumberWithTextRepresentation<>(4f,"four");
        System.out.println(floatNumber.getNumber());
        System.out.println(floatNumber.getName());
    }
}
