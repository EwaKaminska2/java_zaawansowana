package com.sda.calc;

public class OperationsCalculator {

    MathematicalOperation operation;

    public OperationsCalculator(){
        operation = new Addition();
    };

    void setOperation (MathematicalOperation operation){
        this.operation = operation;

    }
    public double applayOperation(double x, double y){

        return operation.calculate(x,y);
    }
}
