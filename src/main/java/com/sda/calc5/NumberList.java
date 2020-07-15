package com.sda.calc5;

import java.util.ArrayList;
import java.util.List;

public class NumberList<T extends Number> {

    private List<T> numberList;

    public NumberList() {
        numberList = new ArrayList<>();
    }

    public void addNumber(T number) {
        numberList.add(number);

    }

    public T showNumber(T number){
       return numberList.get((Integer) number);
    }

    public double getAverage() {
        if (numberList.isEmpty()) {
            return 0;
        } else {
            double sum = 0.0;
            for (T number : numberList) {
                sum += sum + number.doubleValue();
            }
            return sum / numberList.size();
        }
    }

    public Integer getIntSum() {
        int sum = 0;
        for (T number : numberList) {
            sum += sum + number.intValue();
        }
        return sum;
    }

    public boolean hasSameIntSum(NumberList<? extends Number> numberList) {
        return this.getIntSum() == numberList.getIntSum();
    }
}
