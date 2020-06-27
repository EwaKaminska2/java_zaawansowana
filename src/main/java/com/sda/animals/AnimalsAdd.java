package com.sda.animals;

public class AnimalsAdd {
    public static void main(String[] args) {
        Person person = new Person();

        Animal dog = new Dog(); //( polimorfizm)

        person.setAnimal(new Dog());
        System.out.println(person.introduceAnimal());
        System.out.println(person.letsPlayAnimal());
        System.out.println(person.makeAsoundAnimal());

        person.setAnimal(new Cat());
        System.out.println(person.introduceAnimal());
        System.out.println(person.letsPlayAnimal());
        System.out.println(person.makeAsoundAnimal());

        person.setAnimal(new Bird());
        System.out.println(person.introduceAnimal());
        System.out.println(person.letsPlayAnimal());
        System.out.println(person.makeAsoundAnimal());

    }
}
