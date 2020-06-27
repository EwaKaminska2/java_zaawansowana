package com.sda.postoffice;

import java.util.Scanner;

public class PostOfficeApp {
    public static void main(String[] args) {
        Package socks = new Package("socks");



        // wyswietl wszystkie możliwe statusy
        PackageStatus[] statuses = PackageStatus.values();
        System.out.println("Wszystkie statusy");
        for(PackageStatus status:PackageStatus.values()){
            System.out.println(status.toString());
        }



        //2. pobierz od uzytkownieka nazwe wybranego statusu
        System.out.println("Wybierz status");
        String choeseStatus = "SENT";
        Scanner scanner = new Scanner(System.in);

        PackageStatus[] statuses1 = PackageStatus.values();
        Package newSocks = new Package(" New Socks ");
        switch (choeseStatus){
            case "LOST":
                PackageStatus.valueOf("lOST");
                break;
            case "TRAVELLING":
                PackageStatus.valueOf("TRAVELLING");
                break;
        }
      //  newSocks.changeStatus(newStatus);
        System.out.println(newSocks);

        //3.Stworz obiekt wybranego statusu  lub wyswietl blad
        //aby obsluzyc bledna nazwe zlap wyjatek rzucany przez valueOf
       // PackageStatus newStatus = PackageStatus.valueOf(choeseStatus);


    }


    public void getNextStatuses(){

    }
}
