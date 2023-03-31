package week5;

import java.util.Scanner;

public class P05_methodCreation {
      /*
            Kullanicidan main method icinde bir tamsayi alin. Girilen sayinin pozitif tam
            bolenleri sayisini bulup bize donduren bir method olusturun.
        */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen pozitif bir tamsayi giriniz : ");
        int sayi = scan.nextInt();

        System.out.println(pozitifBolenToplami(sayi));
    }

    private static int pozitifBolenToplami(int sayi) {
       int toplam = 0;
        for (int i = 1; i <=sayi ; i++) {
            if(sayi%i==0){
                toplam += i;
            }
        }
        return toplam;
    }


}
