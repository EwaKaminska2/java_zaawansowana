package com.sda.generic;

public class BoxApp {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.setT(1234);
        System.out.println(intBox.getT());

        Box<String > stringBox = new Box<>();
        stringBox.setT("Hello World!");
        System.out.println(stringBox.getT());

        //Raw type UNIKAJ!!
        Box rawbox = new Box();
        rawbox.setT("Text");
        Object object = rawbox.getT();
        String Text = (String)object;//rzutowanie
        System.out.println(object);

       // stringBox.exampleGenericMethod(new Box<>());

        //public static <U> void genericMethod(U argument){
         //   System.out.println("Got argument of class:"+a);
       // }

    }
}
