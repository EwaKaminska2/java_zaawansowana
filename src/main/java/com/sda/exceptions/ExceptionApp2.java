package com.sda.exceptions;

import java.util.Scanner;

public class ExceptionApp2 {
    public static void main(String[] args) throws InvalidNameException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Przedstaw Się:");
        String name = scanner.nextLine();

        try {
            greet(name);

        } catch (IllegalArgumentException exception) {
            System.out.println(" Error exception :" + exception.getMessage());
        }
    }


    private static void greet(String who) throws InvalidNameException{
        if (who == null || who.isBlank()) {
            throw new InvalidNameException(who);
        }

        System.out.println("Hello " + who);

    }
}

