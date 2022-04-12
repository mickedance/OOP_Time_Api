package org.example;

import java.time.LocalDate;
import java.util.Scanner;

public class ExExtra {
    /**
     * In this class we make a calendar
     */

    private static LocalDate currentMonth;

    /**
     * We initiate a scanner so that user can use keyboard inputs to go back and forward in calendar by month
     *
     * @param args
     */
    public static void main(String[] args) {
        currentMonth = LocalDate.parse("2018-01-01");
        //currentMonth = currentMonth.minusMonths(1);
        Scanner sc = new Scanner(System.in);
        drawMonth();
        while (true) {
            String input = sc.nextLine();
            if (input.trim().equalsIgnoreCase("n")) {
                currentMonth = currentMonth.plusMonths(1);
                System.out.println("next");
                drawMonth();
            } else if (input.trim().equalsIgnoreCase("b")) {
                currentMonth = currentMonth.minusMonths(1);
                drawMonth();
            } else {
                break;
            }
        }

    }

    /**
     * Here we draw current month in a calendar format
     */

    public static void drawMonth() {
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        System.out.println("##########################");
        System.out.println("##### - " + currentMonth.getMonth() + " - " + currentMonth.getYear() + " - ######");
        for (int i = 0; i < 7; i++) {
            if (i == 0)
                System.out.print(days[i]);
            else
                System.out.print("\t" + days[i]);
        }

        for (int i = 0; i < currentMonth.lengthOfMonth(); i++) {
            LocalDate thisDay = currentMonth.plusDays(i);
            String tabs = "\t";

            if(thisDay.getDayOfWeek().getValue()==1 || thisDay.getDayOfMonth()==1){
                tabs= "";
            }
            //Set how many tabs before first date of month
            if (thisDay.getDayOfMonth() == 1) {
                for (int j = 1; j < thisDay.getDayOfWeek().getValue(); j++) {
                    tabs = tabs.concat("\t");
                }
            }
            if (thisDay.getDayOfWeek().getValue() == 1 || thisDay.getDayOfMonth() == 1)
                System.out.println();

            System.out.print(tabs + thisDay.getDayOfMonth());

        }
        System.out.println();
        System.out.println();
        System.out.println("Press 'N' for next month Or 'B' for month before.");
        System.out.println("Or other key to stop app");
        System.out.println("##########################");
        System.out.println();

    }
}
