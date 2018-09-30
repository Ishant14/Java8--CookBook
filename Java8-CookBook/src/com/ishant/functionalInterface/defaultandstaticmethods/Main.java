package com.ishant.functionalInterface.defaultandstaticmethods;

public class Main {
    public static void main(String args[]){
        SportsCar sportsCar = new SportsCar(100,200);
        sportsCar.turnAlarmOn();
        System.out.println(sportsCar.getHorsePower());
        sportsCar.turnAlarmOf();

    }
}
