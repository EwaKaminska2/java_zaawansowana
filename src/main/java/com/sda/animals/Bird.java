package com.sda.animals;

public class Bird extends Animal{
    @Override
    public String introduce() {
        return "Cześć, jestem Tweety";
    }

    @Override
    public String letsPlay() {
        return  "śpiewam";
    }

    @Override
    public String makeAsound() {
        return "ćwir,ćwir";
    }

    public Bird(){};
}
