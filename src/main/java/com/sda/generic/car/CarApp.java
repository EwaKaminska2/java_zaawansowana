package com.sda.generic.car;

public class CarApp {
    public static void main(String[] args) {
        Person person = new Person("Jan","Kowalski");
        person.introduceYourself();

        System.out.println();

        Car <Driver,Person> car = new Car<>();

        car.setDriver(new Driver("Tomasz","Kot","turbo"));
        car.setDriver(new Driver("Ala","Lis","sport"));

        System.out.println();

        car.addPassenger(new Person("Ola","Pasażer"));
        car.addPassenger(new Person("Jan","Kowalski"));
        car.addPassenger(new Person("Krzysztof","Lolek"));
        car.addPassenger(new Driver("Tom","Oliver","fast"));
        car.addPassenger(new Person("Ewa","Nowak"));
        // Driver dziedziczy po Person czyli również
        // po Abstarct person dlatego Driver może być pasażerem
    }
}
