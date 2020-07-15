package com.sda.calc;

public class ByFive implements Series {
    int startValue;
    int acctualValue;


    public int getNext(){
        this.acctualValue+=5;
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

    public ByFive(int startValue,int acctualValue){
        setStart(startValue);
        this.startValue=startValue;
        this.acctualValue=acctualValue;
    }


}
