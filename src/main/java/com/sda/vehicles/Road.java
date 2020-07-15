package com.sda.vehicles;

import java.util.ArrayList;
import java.util.List;

public class Road <T extends Vehicle>{
    List<T> vehicles = new ArrayList<>();


    void addVehicle(T vehicle){
        vehicles.add(vehicle);

    }

    @Override
    public String toString() {
        return "Road{" +
                "vehicles=" + vehicles +
                '}';
    }
    // dla wszystkich vehicles każe jechać 40
    public void limitSpeed(){
        for (int i = 0; i <vehicles.size(); i++) {
            vehicles.get(i).run(40);
        }

    }

}
