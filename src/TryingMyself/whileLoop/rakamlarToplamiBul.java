package TryingMyself.whileLoop;

import java.util.Scanner;

public class rakamlarToplamiBul {
    public static void main(String[] args) {
        //While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz: ");
        int girilen = scan.nextInt();
        int birlerBasamagi = 0;
        int sayi = girilen;
        int toplam =0;

        while (sayi>0) {
            birlerBasamagi = sayi % 10;
            sayi-=birlerBasamagi;
            sayi/=10;
            toplam += birlerBasamagi;
        }

        System.out.println("Girilen " + girilen +" sayisi'nin rakamlar toplami : " + toplam);
        System.out.println(rakamlarToplamiMethodla.toplaMethodu(toplam));
    }
}
