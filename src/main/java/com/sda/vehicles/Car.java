package com.sda.vehicles;

public class Car extends Vehicle{

    int passengers;

    public void addPassenger(){
        ++passengers;
        System.out.println(" Wsiadł kolejny pasażer, teraz jest ich: "+ passengers);
    }

    public void removePassenger(){
        if(passengers<1){
            return;
        }
        --passengers;
        System.out.println(" Wysiadł pasażer,teraz jest ich: "+passengers);

    }

    @Override
    public String toString() {
        return "Car{" +
                "passengers=" + passengers +
                '}';
    }
    public Car(){
        System.out.println("Empty car constructor.");
    }

    @Override
   // public void run(double velocity) {
      //  super.run(velocity); }

    public void run(double velocity){
        System.out.println("Car speed : "+velocity);
    }
}
