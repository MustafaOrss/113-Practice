package TryingMyself.whileLoop;

import java.util.Scanner;

public class sifiraBasanaKadar {
    public static void main(String[] args) {

        // Kullanicidan toplanmak uzere sayilar alin
        // kullaniciya bitirmek icin 0'a basmasini soyleyin
        // kullanici 0'a bastiginda
        // 0 haric kac sayi girildigini ve toplamlarini yazdirin

        Scanner scan = new Scanner(System.in);
        int sayi = 1;
        int toplam = 0;
        int sayiAdedi = 0;


        while (sayi != 0)
        {
            System.out.println("Lutfen toplamak uzere sayi giriniz eger cikmak isterseniz sifira basiniz\n" +
                    ": ");
            sayi = scan.nextInt();
            if (sayi != 0) {
                toplam += sayi;
                sayiAdedi++;
            }
        }
        System.out.println("Girilen sayi adedi: " + sayiAdedi + " Sayilarin toplami: " + toplam );
    }

}
