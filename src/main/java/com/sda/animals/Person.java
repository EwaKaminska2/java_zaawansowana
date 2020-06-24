package com.sda.animals;

public class Person {

    //public static void main(String[] args) {
        Animal animal;


        public Person(){
            animal =new Dog();
        }
            void setAnimal(Animal animal){
                this.animal=animal;
            }

            public String introduceAnimal(){
            return animal.introduce();
        }

        public String letsPlayAnimal(){
            return animal.letsPlay();
        }

        public String makeAsoundAnimal(){
            return animal.makeAsound();
        }
    }








