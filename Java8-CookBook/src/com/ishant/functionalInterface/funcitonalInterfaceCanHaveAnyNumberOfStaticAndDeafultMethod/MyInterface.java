package com.ishant.functionalInterface.funcitonalInterfaceCanHaveAnyNumberOfStaticAndDeafultMethod;


    @FunctionalInterface
    interface MyInterface {

        abstract void myMethod();
        default void defaultMethodFirst() {
            System.out.println("Hi, I am the first default method in myInterface ");
        }
        static void staticMethodFirst() {
            System.out.println("Hi, I am the first static method in myInterface ");
        }
        default void defaultMethodSecond() {
            System.out.println("Hi, I am the second default method in myInterface ");
        }
        static void staticMethodSecond() {
            System.out.println("Hi, I am the second static method in myInterface ");
        }
    }

