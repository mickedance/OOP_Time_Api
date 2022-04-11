package org.example;

import java.time.LocalDate;

public class Ex6 {


    /**
     * Print out month of 10 years minus 10 months from today.
     *
     * @param args
     */

    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        currentDate = currentDate.plusYears(10).minusMonths(10);
        System.out.println(currentDate.getMonth().toString());
    }
}
