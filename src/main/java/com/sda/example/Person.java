package com.sda.example;

import java.time.LocalDate;
import java.util.Objects;

public class Person implements Comparable<Person>{
    String name;
    String surmane;
    LocalDate dateOfBirth;
    int hight;

    public String getName() {
        return name;
    }

    public String getSurmane() {
        return surmane;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public Integer getHight(){ return hight;}


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surmane='" + surmane + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", hight=" + hight +
                '}';
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setSurmane(String surmane) {
        this.surmane = surmane;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setHight(int hight){this.hight = hight;}


    public Person( String name,String surmane,LocalDate dateOfBirth,int hight){
        this.name = name;
        this.surmane=surmane;
        this.dateOfBirth=dateOfBirth;
        this.hight = hight;


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name) &&
                surmane.equals(person.surmane) &&
                dateOfBirth.equals(person.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surmane, dateOfBirth);
    }

    @Override
    public int compareTo(Person person){
        int heightDiffrence = this.getHight()-person.getHight();
        return heightDiffrence;
    }


}
