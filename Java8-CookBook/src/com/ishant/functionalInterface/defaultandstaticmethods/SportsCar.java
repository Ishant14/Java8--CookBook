package com.ishant.functionalInterface.defaultandstaticmethods;

public class SportsCar implements Vehicle {

    private int rpm;
    private int torque;

    SportsCar(int rpm, int torque){
        this.rpm = rpm;
        this.torque = torque;
    }

    public int getHorsePower(){
        return Vehicle.getHorsePower(this.rpm, this.torque);
    }

}
