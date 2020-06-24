package com.sda.geometry;

public class Point2D {

    //public static void main(String[] args) {
        //Point2D punkt=new Point2D();


   // }
    double x;
    double y;

    public Point2D(){
        System.out.println("Empty Point2d konstructor");
        x=0;
        y=0;
    };

    public Point2D( double x,double y){
        //System.out.println("Parametry Point2d konstructor");
        String massage = String.format("Point2d [%f,%f]",x,y);
        System.out.println(massage);
        this.x=x;
        this.y=y;
    }

}
