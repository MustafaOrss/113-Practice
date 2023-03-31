package Team113_ogrenciPratikDersleri;

import java.util.Scanner;

public class methodTekrar_2 {
    public static void main(String[] args) {

        /*
         Soru 2- Kullanicidan main method icinde ayri ayri isim ve soyismini alin
                 Isim ve soyismi ilk harfleri buyuk diger harfleri kucuk olacak sekilde duzenleyip,
                 isim bosluk soyisim seklinde bize donduren bir method olusturun.

                 input : isim : Ali soyisim : YILMAZ. output : Ali Yilmaz

        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Adinizi giriniz : ");
        String isim = scan.nextLine();
        System.out.println("Soyisminizi giriniz : ");
        String soyIsim = scan.nextLine();
        System.out.println(isimSoyisimBirlestirme(isim,soyIsim));

    }
     public static String isimSoyisimBirlestirme(String name, String surname){
       String donduren = name.toUpperCase().charAt(0)+
               name.substring(1).toLowerCase()+" " +surname.toUpperCase().charAt(0)+
               surname.substring(1).toLowerCase();


        return donduren;
    }
}
