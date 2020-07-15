package com.sda.animals;

public class Person {


       private Animal animal;


        public Person(){
           // animal = new Dog();
            this(new Cat());
        }
        public Person( Animal animal){
            this.animal = animal;
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








