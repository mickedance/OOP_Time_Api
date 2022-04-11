package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Ex5 {
    /**
     * Prints out the day of week for date 1945-05-08
     *
     * @param args
     */


    public static void main(String[] args) {
        LocalDate date1945 = LocalDate.parse("1945-05-08");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("eeee").withLocale(new Locale("sv"));
        String daySwedish = date1945.format(dtf);
        String dayEnglish = date1945.getDayOfWeek().toString();
        System.out.println(daySwedish);
        System.out.println(dayEnglish);
    }
}
