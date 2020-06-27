package com.sda.geometry;

public abstract class FlatShape {

   // FlatShape shape= new FlatShape();
    double x;
    double y;


    public FlatShape( double x, double y){
        this.x=x;
        this.y=y;
    }
    public void printDimension(){
        System.out.println( toString());

        System.out.println(String.format("Flatshape [x,y]=[%f,%f]",x,y));


    }
    //abstract double getArea(){};
}
