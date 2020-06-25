package com.sda.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ExceptionsApp {
    public static void main(String[] args) throws IllegalArgumentException {

try{
        ExceptionsApp div= new ExceptionsApp();
        System.out.println(div.divide(0.0,0.0));}
catch (IllegalArgumentException exception){
    System.out.println("Error message: "+exception.getMessage());
}

        private static void divided(String number) throws IllegalArgumentException {
            if (y = 0) {
                throw new InvalidArgumentException(y);
            }

            System.out.println("Hello " + y);

            //ArrayIndexOutOfBoundsException
            //  try{
            // String []textArray = new String[]{"ala","ma","kota"};
            // String text = textArray[3];
            //     System.out.println("Koniec Try");}
            // catch (ArrayIndexOutOfBoundsException exception){
            //     System.out.println("Wyleciałeś poza zakres!");
            // } finally {
            //     System.out.println("Zamykam aplikację!");
            //  }


            //IndexOutOfBoundsException
            //List<String > textList = new ArrayList<>();
            //textList.add("ala");
            // textList.add("ma");
            // String text2 = textList.get(2);


            //NullPointerException
            //try {
            //   System.out.println("I am here");
            //   String exceptions = null;
            //  exceptions.length();
            //   System.out.println("I am now here");
            // }catch (NullPointerException exception){
            //     System.out.println("Zmienna jest null!");
            // }finally {
            //     System.out.println("Zamykam aplikację!");
            // }
            // ;
        }

    }
    double divide( double x, double y){
        return x/y;
    }
}
