package com.sda.calc2;

public class MathUtilsApp extends Exception {
    public static void main(String[] args) {
        MathUtils parse = new MathUtils();
        try {
            System.out.println(parse.parseNumber());
        } catch (NumberFormatException exception) {

            System.out.println("Wrong text "+ exception.getMessage());

        }
    }
}
