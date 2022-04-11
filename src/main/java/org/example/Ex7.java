package org.example;

import java.time.LocalDate;
import java.time.Period;

public class Ex7 {

    /*
    * Using the LocalDate from exercise 6 and your birthdate, create a Period between your birthdate and
the date from exercise 5. Print out the elapsed years, months and days.*/

    /**
     * Print out elapsed time in years, month and days from my birthday and to date in Ex6/class Ex6
     *
     * @param args
     */
    public static void main(String[] args) {
        LocalDate dateFromEx6 = new Ex6().getDate();
        LocalDate myBirthday = LocalDate.parse("1984-06-06");

        Period period = Period.between(myBirthday, dateFromEx6);
        System.out.println("Elapsed Years: " + period.getYears());
        System.out.println("Elapsed Months: " + period.getMonths());
        System.out.println("Elapsed Days: " + period.getDays());
        System.out.println("Between: " + myBirthday + " and " + dateFromEx6);

    }
}
