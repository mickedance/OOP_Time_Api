package org.example;

/*Create a period of 4 years, 7 months and 29 days. Then create a LocalDate of current date and add
the period you created to the current date.*/

import java.time.LocalDate;
import java.time.Period;

public class Ex8 {

    /**
     * Print out a date 4 years, 7 months and 29 days from today. Using period class
     *
     * @param args
     */
    public static void main(String[] args) {
        Period period = Period.of(4, 7, 29);
        LocalDate today = LocalDate.now();
        today = today.plus(period);

        System.out.println(today);
    }
}
