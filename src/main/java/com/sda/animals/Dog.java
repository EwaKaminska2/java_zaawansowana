package com.sda.animals;


public class Dog extends Animal {
    @Override
    public String introduce() {
        return "Cześć, jestem Azor";
    }

    @Override
    public String letsPlay() {
        return  "usiadłem";
    }

    @Override
    public String makeAsound() {
        return "wof,wof";
    }

   public Dog(){};
  //  Dog dog = new Dog();

}
