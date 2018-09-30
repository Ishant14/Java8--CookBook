package com.ishant.apicollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String args[]){

        Person p1 = new Person("ishant",12);
        Person p2 = new Person("gaurav",45);
        Person p3 = new Person("rahul",34);
        Person p4 = new Person("naman",12);
        Person p5 = new Person("Shamuel",89);
        Person p6 = new Person("Mashuk",23);

        //List<Person> people = Arrays.asList(p1,p2,p3,p4,p5,p6);
        List<Person> people = new ArrayList<>(Arrays.asList(p1,p2,p3,p4,p5,p6));

        // using lambda expression
       // people.forEach(s -> System.out.println(s));

        Predicate<Person> ageLessThanThirty =  person -> person.getAge() < 30;
        people.removeIf(ageLessThanThirty);


        people.replaceAll(person -> new Person(person.getName().toUpperCase(),person.getAge()));

        people.sort(Comparator.comparing(Person::getAge).reversed());

        // using method reference
        people.forEach(System.out::println);


    }
}
