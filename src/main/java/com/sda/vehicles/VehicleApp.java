package com.sda.vehicles;

public class VehicleApp {
    public static void main(String[] args) {
       Vehicle vehicle=new Vehicle();
       vehicle.run(200.3);
       vehicle= new Car();

        //Car car = new Car();
        //car.addPassenger();
        //System.out.println(car);
        vehicle.run(120);


    }
}
