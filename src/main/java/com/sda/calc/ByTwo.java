package com.sda.calc;

import java.lang.reflect.Array;

public class ByTwo implements Series {

int startValue;
int acctualValue;


    public int getNext(){
        this.acctualValue+=2;
        return this.acctualValue;
    };
    public int reset(){
        this.acctualValue=this.startValue;
        return this.acctualValue;
    };
   public void setStart(int x){
       this.startValue=x;
       this.acctualValue=x;
       System.out.println(x);

   };

    public ByTwo(int startValue,int acctualValue){
       setStart(startValue);
        this.startValue=startValue;
        this.acctualValue=acctualValue;
    }


}
