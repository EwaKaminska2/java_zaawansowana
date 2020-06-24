package com.sda.geometry;

public abstract class FlatShape {

   // FlatShape shape= new FlatShape();
    double width;
    double height;


    public FlatShape( double width, double height){
        this.width=width;
        this.height=height;
    }
    public void printDimension(){
        System.out.println( toString());

        System.out.println(String.format("Flatshape [x,y]=[%f,%f]",width,height));


    }
    //abstract double getArea(){};
}
