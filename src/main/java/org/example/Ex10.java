package org.example;


import java.time.LocalTime;

public class Ex10 {
    /**
     * Print out nanoseconds of current time object
     *
     * @param args
     */
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime.getNano());
    }
}
