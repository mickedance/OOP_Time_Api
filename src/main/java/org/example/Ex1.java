package org.example;

import java.time.LocalDate;

public class Ex1 {

    /**
     * Printing out todays date in ISO Format
     *
     * @param args
     */
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        System.out.println(currentDate);
    }
}
