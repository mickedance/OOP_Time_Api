package org.example;

/*
* Create a LocalDate of last Monday. Then print out the entire week in a loop using standard ISO
format*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class Ex3 {
    /**
     * Get last weeks monday, then print that whole week out.
     * @param args
     */
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        today = today.plusDays(100);
        System.out.println("from: " +today);

        int nrOfDaysLeftInThisWeek =  today.getDayOfWeek().getValue() + 6;
        LocalDate lastMonday = today.minusDays(nrOfDaysLeftInThisWeek  );
        System.out.println("Last week  looked like this: " );

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEEE dd MMMM").withLocale(new Locale("sv"));
        for(int i =0; i<7;i++){
            System.out.println(lastMonday.plusDays(i).format(dtf2));
        }
    }
}
