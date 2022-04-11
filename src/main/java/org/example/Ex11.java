package org.example;

import java.time.LocalTime;


public class Ex11 {
    /**
     *
     *  * Create a LocalTime object from a String using the .parse() method and prints it out
     * @param args
     */
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.parse("10:04:45");
        System.out.println(localTime);
    }
}
