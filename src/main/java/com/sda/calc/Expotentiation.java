package com.sda.calc;

public class Expotentiation implements MathematicalOperation{

    @Override
    public double calculate(double x, double y){
        double expotentation = Math.pow(x,y);
        return expotentation;
    }
}
