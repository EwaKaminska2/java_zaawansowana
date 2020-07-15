package com.sda.example;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.*;
import java.util.function.Predicate;

//import static jdk.nashorn.internal.objects.Global.print;

public class PersonApp {
    public static void main(String[] args) {

        //HashSet<Person> people = new HashSet<>();
        //  Person person1 = new Person("Ewa","Kot", LocalDate.now());
//Person person2 = new Person("Ala","Kowalska",LocalDate.now());
//Person person3 = new Person("Tomek","Jan",LocalDate.now().minusYears(1));

//people.add(person1);
//people.add(person2);
//people.add(person3);
        // System.out.println(person1.equals(person2));
        //people.remove(person1);

        List<Person> people = List.of(new Person("a", "b", LocalDate.now(), 170),
                new Person("d", "w", LocalDate.now(), 190));


        for (int i = 0; i < people.size(); i++) {
            System.out.println(((people.get(i))));

        }
        for (Person person : people) {
            System.out.println(person);
        }

        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        Consumer<Person> printer = new Consumer<Person>() {
            @Override
            public void accept(Person person) {
                System.out.println(person);
            }
        };
        people.forEach(printer);

        for (Person person : people) {
            printer.accept(person);

        }

        Person person1 = new Person("aa", "ccc", LocalDate.now(), 181);
        Person person2 = new Person("bb", "ddd", LocalDate.now(), 170);
        Person person3 = new Person("cc", "eee", LocalDate.now(), 160);
        List<Person> people3 = Arrays.asList(person2, person1, person3);

        System.out.println(people3);
        Collections.sort(people3);
        System.out.println(people3);


        System.out.println(getHighestBorn(people3, LocalDate.now().minusDays(1)));

        Optional<Person> optionalHighest = getHighestBorn(people3, LocalDate.now());
        if (optionalHighest.isPresent()) {
            Person person = optionalHighest.get();
            System.out.println(person);
        }


    }

    public static Optional<Person> getHighestBorn(List<Person> people, LocalDate date) {
        //Person person1 = new Person("Ala","Kot",LocalDate.now(),181);
        // Person person2 = new Person("Karol","Kowalski",LocalDate.now().minusYears(2),170);
        // Person person3 = new Person("Joanna","Wróbel",LocalDate.now().minusMonths(6),160);
        // List<Person> people4 = Arrays.asList(person2,person1,person3);
        // Collections.sort(people4);
        // System.out.println(people4);

        List<Person> bornInDate = new ArrayList<>();
        for (Person person : people) {
            if (person.getDateOfBirth().equals(date)) {
                bornInDate.add(person);
            }
        }
        if (bornInDate.isEmpty()) {
            return Optional.empty();
        }
        bornInDate.sort(Comparator.reverseOrder());
        return Optional.of(bornInDate.get(0));

    }
        Predicate<Person> isHiger180 = new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                return person.getHight() > 180;
            }
        };


        Predicate<Person> isHiger180Lambda = (Person person) -> {
            return person.getHight() > 180;
        };


    }


