package com.ishant.functionalInterface.defaultandstaticmethods;

public interface Vehicle {

    default void turnAlarmOn(){
        System.out.println("Turning alarm on..");
    }

    default void turnAlarmOf(){
        System.out.println("Turning alarm off..");
    }

    static int getHorsePower(int rpm, int torque){
        return (rpm * torque)/ 5252;
    }
}
