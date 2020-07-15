package com.sda.weekdays;

import java.util.Scanner;

public class WeekdaysApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Weekday day;


        boolean trueWeek = false;

        while (!trueWeek) {
            System.out.println("Write a day of the week( pol/eng):");
            String text = scanner.nextLine();
            String upperText = text.toUpperCase();
            try {
                day = Weekday.findByPolishName(upperText);
                trueWeek = true;
                System.out.println("This is polish name of weekday.");
            } catch (UnknownWeekdayException exception) {
                System.out.println();

                try {
                    day = Weekday.findByEnglishName(upperText);
                    trueWeek = true;
                    System.out.println("This is english name of weekday.");
                } catch (UnknownWeekdayException exception1) {
                    System.out.println("This day of the week in polish and english does't exist.");
                    System.out.println("Try again!");
                }

            }
        }
    }
}

