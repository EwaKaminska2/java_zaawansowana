package com.sda.generic.car;

public class Driver extends Person{

    String drivingStyle;

    public Driver(String firstName, String lastName,String drivingStyle) {
        super(firstName, lastName);
        this.drivingStyle = drivingStyle;
    }
    void drive(){
        System.out.println("I'm driving!");
    }
    @Override
    void introduceYourself() {
        System.out.println("Cześć,jestem "+ getFirstName()+ " "+getLastName()+" "+getDrivingStyle());
    }

    public String getDrivingStyle() {
        return drivingStyle;
    }
}
