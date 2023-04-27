package Team113_ogrenciPratikDersleri.ArrList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class W03silme {
    // Soru 3- Verilen String bir listede
    //         istenmeyen harf iceren elementleri silip,
    //         kalan kismini list olarak bize donduren bir method olusturun.

    public static void main(String[] args) {

        List<String> kullaniciListesi = W02listeOlustur.listeOlarakDondurenMethod();

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen istemediginiz harfi giriniz: ");

        String istenmeyenHarf = scan.next().substring(0, 1).toLowerCase();

        List<String> sonuc = ayricalikliListe(kullaniciListesi, istenmeyenHarf);
        System.out.println(sonuc);

    }

    public static List<String> ayricalikliListe(List<String> kullaniciListesi, String istenmeyenHarf) {
        List<String> kalanLar = new ArrayList<>();
        for (int i = 0; i < kullaniciListesi.size(); i++) {
            if (!kullaniciListesi.get(i).contains(istenmeyenHarf)) {
                kalanLar.add(kullaniciListesi.get(i));
            }
        }
            return kalanLar;
    }
}