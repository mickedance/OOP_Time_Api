package org.example;

import java.time.LocalDate;

public class Ex6 {

    /**
     * Print out month of 10 years minus 10 months from today.
     *
     * @param args
     */

    private LocalDate currentDate;

    public static void main(String[] args) {
        Ex6 ex = new Ex6();
        System.out.println(ex.currentDate.getMonth().toString());
    }

    public Ex6() {
        currentDate = LocalDate.now();
        currentDate = currentDate.plusYears(10).minusMonths(10);

    }

    public LocalDate getDate() {
        return currentDate;
    }
}
