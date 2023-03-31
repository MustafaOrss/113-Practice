package Team113_ogrenciPratikDersleri;

import java.util.Scanner;

public class methodTekrar_3 {
    public static void main(String[] args) {

        /*
                Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin.
                        Girilen sayinin asal sayi olup olmadigini kontrol edip,
                        sonuc olarak "asal sayi" veya "asal sayi degil"
                        sonuclarini donduren bir method olusturun.
                        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz : ");
        int sayi = scan.nextInt();

        System.out.println(asalMi(sayi));

    }

    public static String asalMi(int number) {
        int flag = 0;
        for (int i = 2; i < number; i++) {
            if (number %i == 0) {
                flag++;

            }
        }
        if (number ==2){
            return "Asal SAYI";
        }


           else if (flag==0){
                return "Asal Sayi.";
            }
            else {
                return "Asal Sayi Degil.";
            }

    }
}

