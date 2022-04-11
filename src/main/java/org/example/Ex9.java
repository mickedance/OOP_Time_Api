package org.example;

import java.time.LocalDate;
import java.time.LocalTime;


public class Ex9 {
    /**
     * Print out current time
     *
     * @param args
     */
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
    }
}
