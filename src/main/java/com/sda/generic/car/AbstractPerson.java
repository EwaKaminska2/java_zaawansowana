package com.sda.generic.car;

public abstract class AbstractPerson {
    String firstName;
    String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    AbstractPerson(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
        abstract void introduceYourself();


}
