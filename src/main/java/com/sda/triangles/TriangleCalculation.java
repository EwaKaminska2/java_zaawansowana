package com.sda.triangles;


public class TriangleCalculation {

    private double a;
    private double b;
    private double c;

    public double calculateTriangleCircuit(double a, double b, double c) {
        if (!(a + b > c && b + c > a && c + a > b)) {
            this.a = a;
            this.b = b;
            this.c = c;
            throw new CannotBuiltTriangleException();
        } else {
            return a + b + c;
        }
    }
    public void wrongSides(){
        System.out.println("Wrong sides :"+a+" ,"+b+" ,"+c);
    }
}