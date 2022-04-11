package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex15 {
    /**
     * Create a LocalDateTime object by combining LocalDate object and LocalTime object.
     * @param args
     */
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);

        System.out.println(localDateTime);
    }
}
