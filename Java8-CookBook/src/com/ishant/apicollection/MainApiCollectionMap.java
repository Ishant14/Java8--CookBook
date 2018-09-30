package com.ishant.apicollection;

import java.util.*;
import java.util.function.Predicate;

public class MainApiCollectionMap {

    public static void main(String args[]){

        Person p1 = new Person("ishant",12);
        Person p2 = new Person("gaurav",45);
        Person p3 = new Person("rahul",34);
        Person p4 = new Person("naman",12);
        Person p5 = new Person("Shamuel",89);
        Person p6 = new Person("Mashuk",23);

        //List<Person> people = Arrays.asList(p1,p2,p3,p4,p5,p6);
        List<Person> people = new ArrayList<>(Arrays.asList(p1,p2,p3,p4,p5,p6));

        City newYork = new City("New York");
        City shanghal = new City("Shangal");
        City paris = new City("Paris");

        Map<City,List<Person>> map = new HashMap<>();

        map.putIfAbsent(paris,new ArrayList<>());
        map.get(paris).add(p1);


        System.out.println("People from paris :"+ map.getOrDefault(paris, Collections.EMPTY_LIST));


    }
}
