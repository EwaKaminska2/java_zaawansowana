package com.sda.calc4;

public class MathUtils<T extends Number> {


    public static <T extends Number> double getSum(T number){
        double suma = 0;
        for (int i = 0; i <= number.doubleValue(); i++) {
            suma +=i;
        }
          return suma;
    };

    public static <T extends Number> double getFraction(T number) {
        return number.doubleValue() - number.intValue();
    };
}
