package com.ishant.functionalInterface.howToUseFunctionalInterfaceInLambdaExpression;

public class Main {

    public static void main(String args[]){

        //Write LAMBDA EXPRESSION to implement method of MyInterface (FunctionalInterface)
        MyInterface myInterface = () -> {
            System.out.println("hi I am abstract method in MyInterface");
        };

        myInterface.m1();


        // Calculator functional interface
        Calculator cal = ((num1, num2) -> num1+num2);
        System.out.println(cal.calculate(2,3));


    }


}
