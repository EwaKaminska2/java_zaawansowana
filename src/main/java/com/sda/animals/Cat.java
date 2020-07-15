package com.sda.animals;

public class Cat extends Animal{
    @Override
    public String introduce() {
        return "Cześć, jestem Mruczek";
    }

    @Override
    public String letsPlay() {
        return  "gonię mysz";
    }

    @Override
    public String makeAsound() {
        return "miau, miau";
    }

    public Cat(){};
}
