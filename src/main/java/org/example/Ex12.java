package org.example;


import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex12 {
    /**
     * Using DateTimeFormatter format LocalTime from current time and print it out as following pattern:
     * 10:32:53
     *
     * @param args
     */
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println(localTime.format(dtf));
    }
}
