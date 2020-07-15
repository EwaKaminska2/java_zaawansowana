package com.sda.vehicles;

public class Vehicle {

    public void run(double velocity){
        System.out.println("Vehicle running at speed "+velocity);
    }


    @Override
    public String toString() {
        return "Vehicle{}";
    }
    public Vehicle(){
        System.out.println("Empty vehicle constructor.");

    }
}
