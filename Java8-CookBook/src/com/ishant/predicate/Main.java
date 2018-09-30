package com.ishant.predicate;


public class Main {

    public static void main(String args[]){

        Predicate<String> predicate = s -> s.length() < 20 ;
        Predicate<String> predicate2 = s -> s.length() > 5 ;

        Predicate p3 = predicate.and(predicate2);

        System.out.println("P3 for Yes : "+ p3.test("Yes"));
        System.out.println("p3 for Good Morning : "+ p3.test("Good Morning"));
        System.out.println("p3 for Good Morning Gentleman : "+ p3.test("Good Morning Gentleman"));

        Predicate p4 = predicate.or(predicate2);

        System.out.println("p4 for Yes : "+ p4.test("Yes"));
        System.out.println("p4 for Good Morning : "+ p4.test("Good Morning"));
        System.out.println("p4 for Good Morning Gentleman : "+ p4.test("Good Morning Gentleman"));


        Predicate<String> p5 = Predicate.isEqualsTo("Yes");

        System.out.println("P5 for Yes:" + p5.test("Yes"));
        System.out.println("P5 for No:" + p5.test("No"));

        Predicate<Integer> p6 = Predicate.isEqualsTo(5);

        System.out.println("P6 for 5: "+ p6.test(5));
        System.out.println("P6 for 4: "+ p6.test(4));
    }
}
