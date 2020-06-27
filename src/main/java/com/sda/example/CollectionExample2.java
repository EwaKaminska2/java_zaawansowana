package com.sda.example;
import java.time.LocalDate;
import java.util.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CollectionExample2 {
    public static void main(String[] args) {

        Map<String, Person> people = new HashMap<>();
        people.put("1", new Person("Ola", "Kot", LocalDate.now()));
        people.put("1", new Person("Ola", "Kot", LocalDate.now()));


        //Set<Map.Entry><String, Person >> elements = people.entrySet();
        //for (Map.Entry<String, Person> element : elements) {
          //  String key = element.getKey();
          //  Person value = element.getValue();
           // System.out.println("#" + key + ":" + value);


        }
    }

