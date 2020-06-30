package com.sda.postoffice;

import java.util.Scanner;

public class PostOfficeApp {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        PackageStatus[] statuses = PackageStatus.values();

        Package pack1 = new Package("Package 1");

        System.out.println(pack1);
        pack1.setStatus(PackageStatus.LOST);
        System.out.println(pack1);



        Package newPackage = new Package("New package");
        System.out.println("Choose status");
        for (PackageStatus status : statuses) {
            System.out.println(status);
        }
        boolean correctStatus = false;
        while (!correctStatus) {
            String choice = scanner.nextLine();
            try {
                newPackage.setStatus(PackageStatus.valueOf(choice));
                correctStatus = true;
            } catch (IllegalArgumentException exception) {
                System.out.println("Wrong status - try again");
            }
        }
        System.out.println(newPackage.getStatus());

    }
}