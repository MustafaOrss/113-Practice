package TryingMyself.methodsCreating;

import java.util.Scanner;

public class aralikYazdir {
    /*
    - Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore
        baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran
        bir method olusturun.
    - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata
        mesaji verin
    - kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji
    yazdirin. */
    public static void main(String[] args) {

        aradakiHarfler();

    }

    private static void aradakiHarfler() {

        int flag = 0;
        while (flag!=1)
        {
            flag = 0;

            Scanner scan = new Scanner(System.in);
            System.out.println("Lutfen bir String giriniz: ");
            String str = scan.nextLine();
            System.out.println("lutfen yazdirmak istediginiz araligin baslangic index'ini giriniz: ");
            int bas = scan.nextInt();
            System.out.println("lutfen yazdirmak istediginiz araligin bitis index'ini giriniz: ");
            int bit = scan.nextInt();


            if (bas < 10 && bit < 10) {
                System.out.println(str.substring(bas, bit));
                flag=1;
                break;
            }
            if (bit > 10) {
                System.out.println("Lutfen 10'dan kucuk bir bitis index'i degeri giriniz: ");
            }
            if (bas > 10) {
                System.out.println("Lutfen 10'dan kucuk bir baslangic index'i degeri giriniz: ");
            } else {
                System.out.println("Yanlis giriste bulundunuz.");
            }
        }
    }
}

