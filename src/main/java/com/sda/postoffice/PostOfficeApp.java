package com.sda.postoffice;

public class PostOfficeApp {
    public static void main(String[] args) {
        Package socks = new Package("socks");

        // wyswietl wszystkie możliwe statusy
        PackageStatus[] statuses = PackageStatus.values();
        //wyswietl je

        //2. pobierz od uzytkownieka nazwe wybranego statusu
        String choeseStatus = "SENT";

        //3.Stworz obiekt wybranego statusu  lub wyswietl blad
        //aby obsluzyc bledna nazwe zlap wyjatek rzucany przez valueOf
        PackageStatus newStatus = PackageStatus.valueOf(choeseStatus);
    }
}
