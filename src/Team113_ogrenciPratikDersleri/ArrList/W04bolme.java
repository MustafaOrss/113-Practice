package Team113_ogrenciPratikDersleri.ArrList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class W04bolme {
    public static void main(String[] args) {

        // Soru 6- Kullanicidan pozitif bir tamsayi alip,
        //         o tamsayiyi tam bolebilen tum pozitif tamsayilari
        //         bir liste olarak bize donduren bir method olusturun

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen tam bolenini bilmek istediginiz sayi giriniz: ");
        int sayi = scan.nextInt();

        System.out.println(tamBolenMethodu(sayi));

    }

    private static List<Integer> tamBolenMethodu(int sayi) {
        List<Integer> yeniListe = new ArrayList<>();
        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                yeniListe.add(i);
            }
        }
            return yeniListe;
    }

}
