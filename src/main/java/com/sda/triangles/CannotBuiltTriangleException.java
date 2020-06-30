package com.sda.triangles;

public class CannotBuiltTriangleException extends RuntimeException{



    public CannotBuiltTriangleException(){

        super("Cannot built a triangle with this lenght of sides");
    }
}
