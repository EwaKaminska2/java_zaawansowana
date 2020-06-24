package com.sda.calc;

public class Calculator<i> {


    public int multiplyNumbers(int start, int end, int step) {
        int multiply = 1;
        for (int i = start; i < end; i+=step) {
            multiply = multiply * i;
        }
        return  multiply;
    }


    public int multiplyNumbers(int start, int end){
        int a = multiplyNumbers(start,end,1);
return a;
    }
    public int multiplyNumbers(int end){
        int i = multiplyNumbers(1, end, 1);
return i;
    }

}
