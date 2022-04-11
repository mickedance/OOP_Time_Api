package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class Ex13 {
    /**
     * Create a LocalDateTime with the date and time components as: date: 2018-04-05, time: 10.00 and
     * prints it out
     * @param args
     */
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.parse("2018-04-05T10:00");

        System.out.println(localDateTime);
    }
}
