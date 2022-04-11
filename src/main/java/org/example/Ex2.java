package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Ex2 {


   /* Exercise3:
    :
Create a LocalDate of the current day and print it out in the following pattern using
DateTimeFormatter: Torsdag 29 mars

    */

    /** Print out a String of 29th of march in Swedish language and with a first letter in uppercase
     *
     * @param args
     */
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("2022-03-29");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE dd MMMM").withLocale(new Locale("sv"));
        dtf.format(date);
        String s = date.format(dtf);
        s = s.substring(0,1).toUpperCase() + s.substring(1);
        System.out.println(s);
    }
}
