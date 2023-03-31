package week5;

import java.util.Scanner;

public class P02_methodCreation {

    static String duzenliStr = "";

    /*
            Kullanicidan main method icinde ayri ayri isim ve soyismini alin
            Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
            isim bosluk soyisim seklinde bize donduren bir method olusturun
        */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen ilk adinizi giriniz : ");
        String name = scan.next();
        System.out.print("Lutfen ikinci adinizi giriniz : ");
        String name2 = scan.next();
        System.out.print("Lutfen soyadinizi giriniz : ");
        String surname = scan.next();

        System.out.println(isimSoyisimYazdir(name,name2, surname));


    }

    public static String isimSoyisimYazdir(String name, String name2, String surname) {
       name = name.toUpperCase().charAt(0)+name.substring(1).toLowerCase();
       name2 = name2.toUpperCase().charAt(0) + name2.substring(1).toLowerCase();
       surname = surname.toUpperCase().charAt(0)+surname.substring(1).toLowerCase();

        duzenliStr = name + " "+ name2 +" " + surname;
        return duzenliStr;
    }


}
