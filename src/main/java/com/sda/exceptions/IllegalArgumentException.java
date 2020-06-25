package com.sda.exceptions;

public class IllegalArgumentException extends Exception {
    private final String illegalArg;
    IllegalArgumentException( String  illegalArg){
        super(String.format("Number[%s] is invalid",illegalArg));
        this.illegalArg = illegalArg;
    }

    public String  getIllegalArg(){
        return illegalArg;

    }


    }


