package com.sda.triangles;

public class TriangleCalculationApp {
    public static void main(String[] args) {
        TriangleCalculation triangle = new TriangleCalculation();

        try {
            System.out.println(triangle.calculateTriangleCircuit(9, 8, 3));

            System.out.println(triangle.calculateTriangleCircuit(0,11,5));


        } catch (CannotBuiltTriangleException exception) {
            System.out.println(exception.getMessage());
            triangle.wrongSides();

        }
    }
}
