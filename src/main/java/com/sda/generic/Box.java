package com.sda.generic;

import java.util.PropertyResourceBundle;

public class Box <T>{
    private T t;

    public void setT(T t){this.t=t;}

    public T getT() {
        return t;
    }

   // public <U> void exampleGenericMethod (U argument){
      //  System.out.println(" Argument: "+argument.toString());
      //  System.out.println("Class: "+argument.getClass().getName());
   // }
}
