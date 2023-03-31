package Team113_ogrenciPratikDersleri;

import java.util.Scanner;

public class methodTekrar {
    public static void main(String[] args) {

        /*
            Soru 1- Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore baslangic index'i
            dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran bir method olusturun
            - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata mesaji verin
            - kullanici str'da olan index'llerdem daha buyuk bir index girerse hata mesahi yazdirin.

       */


        baslangicBitisMethod();
    }

    public static void baslangicBitisMethod(){



        Scanner scan = new Scanner(System.in);
        System.out.println("bir kelime giriniz....: ");
        String kelime = scan.nextLine();

        System.out.println("Baslangic index'ini giriniz....: ");
        int baslangicDegeri= scan.nextInt();

        System.out.println("Bitis index'ini giriniz....: ");
        int bitisDegeri= scan.nextInt();

        if (baslangicDegeri>bitisDegeri){
            System.out.println("Baslangic index'i bitis index'inden buyuk olamaz.");
        } else if (baslangicDegeri>kelime.length()-1 || bitisDegeri>kelime.length()-1) {

            System.out.println("Kelimenin index numarasindan buyuk bir deger girdiniz.");
        }
        else {
            for (int i = baslangicDegeri; i < bitisDegeri-1; i++) {
                System.out.print(kelime.charAt(i)+"-");
            }
            System.out.println(kelime.charAt(bitisDegeri-1));
        }


    }

}
