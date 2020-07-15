package com.sda.calc2;

import java.util.Scanner;

public class MathUtils {


    public Integer parseNumber(){
        System.out.println("Write some text:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        if (text==null){
            throw new NumberFormatException();
        }else{
        int number = Integer.parseInt(text);
        return number;}

    }
}
