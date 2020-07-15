package com.sda.exceptions;

public class IllegalArgumentException extends Exception {
    private final double invalidNumber;

    IllegalArgumentException(double invalidNumber) {
        super(String.format("Y [%s] is invalid", invalidNumber));
        this.invalidNumber = invalidNumber;
    }

    public double getInvalidNumber() {
        return invalidNumber;
    }
}


