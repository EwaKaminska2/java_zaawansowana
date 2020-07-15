package com.sda.generic.car;

import java.util.ArrayList;
import java.util.List;

public class Car<D extends Driver, P extends AbstractPerson> {

    private D driver;
    private List<P> passengers;

    public Car() {
        driver = null;
        passengers = new ArrayList<>();
    }

    public void setDriver(D driver) {
        if (this.driver == null) {
            this.driver = driver;
        } else {
            System.out.println("This car already have a driver");
        }
        this.driver.introduceYourself();
        this.driver.drive();

    }

    public void addPassenger(P passenger) {

        if (passengers.size() < 4) {
            passengers.add(passenger);
            passenger.introduceYourself();
        } else {
            System.out.println("This car have only four sits.You can't get in.");
        }
    }
}