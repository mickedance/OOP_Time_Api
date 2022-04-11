package org.example;

/*
* Using DateTimeFormatter format the LocalDateTime object from exercise 11 to a String that should
look tile this: torsdag 5 april 10:00 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Ex14 {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("eeee dd MMMM HH:mm").withLocale(new Locale("sv"));
        System.out.println(LocalDateTime.parse("2002-04-14T14:14").format(dtf));
    }
}
