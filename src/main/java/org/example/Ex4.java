package org.example;

import java.time.LocalDate;

public class Ex4 {
    /**
     * //Create a LocalDate object from a String by using the .parse() method.
     *
     * @param args
     */
    public static void main(String[] args) {
        String s = "1984-06-06";
        LocalDate date = LocalDate.parse(s);
        System.out.println(date);

    }
}
