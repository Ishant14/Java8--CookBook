package com.ishant.optinal;

import java.util.Optional;
import java.util.OptionalInt;

public class OptionalIntExample {

    public static void main(String[] args) {

        OptionalInt optionalIntInt = OptionalInt.of(5);

        //isPresent() will return true - If a value is present
        System.out.println("optionalInt.isPresent() = "+optionalIntInt.isPresent());

        //get() returns the value.
        System.out.println("optionalInt.get() = "+optionalIntInt.getAsInt()); //

        //orElse method - Return the value if present, otherwise return other.
        System.out.println("optionalInt.orElse = "+optionalIntInt.orElse(6)); //value is present, so it will print 5

        System.out.println("\n1 - optionalInt.ifPresent");
        //ifPresent method - If a value is present, it invokes the specified consumer with the value, otherwise do nothing
        optionalIntInt.ifPresent(System.out::println); //5 //It invokes  specified consumer i.e. System.out::println

        System.out.println("\n2 - optionalInt.ifPresent");
        // Display some custom message if value is present
        optionalIntInt.ifPresent((i) -> System.out.println("value = " + i)); // value = 5

        int value =5 ;

        // Optional.ofNullable()
        System.out.println(Optional.ofNullable(value).orElse(6));

        //
        System.out.println(Optional.ofNullable(value).orElseGet(()->getNumber()));

    }

    private static Integer getNumber() {
        return new Integer(6);
    }
}
