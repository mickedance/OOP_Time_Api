package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex16 {
    /**
     * Create a LocalDateTime object. Then get the LocalDate and LocalTime components into separate
     * objects of respective types from the LocalDateTime object.
     *
     * @param args
     */
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

        LocalDate localDate = localDateTime.toLocalDate();
        LocalTime localTime = localDateTime.toLocalTime();

        System.out.println(localDate);
        System.out.println(localTime);
    }
}
