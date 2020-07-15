package com.sda.calc;

public class CalcApp {
    public static void main(String[] args) {

        OperationsCalculator calc= new OperationsCalculator();

        calc.setOperation( new Addition());
        System.out.println(calc.applayOperation(3.0,4.0));

        calc.setOperation(new Multiplication());
        System.out.println(calc.applayOperation(3.0,4.0));

        calc.setOperation(new Expotentiation());
        System.out.println(calc.applayOperation(3.0,2.0));
    }
}
