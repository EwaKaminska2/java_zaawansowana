package com.sda.calc3;

public class NumberWithTextRepresentation <T,String> extends java.lang.Number {

    private T number;
    private String name;

    @Override
    public int intValue() {
        return (int) number;
    }

    @Override
    public long longValue() {
        return (long) number;
    }

    @Override
    public float floatValue() {
        return (float) number;
    }

    @Override
    public double doubleValue() {
        return (double) number;
    }

    public NumberWithTextRepresentation (T number,String name){
        this.number = number;
        this.name = name;
    }

    public T getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}
