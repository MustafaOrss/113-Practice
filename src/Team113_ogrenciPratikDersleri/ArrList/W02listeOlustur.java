package Team113_ogrenciPratikDersleri.ArrList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class W02listeOlustur {
    public static void main(String[] args) {

        // Kullanicidan istedigi kadar isim alip,
        // Q’ya bastiginda girdigi isimleri bize liste
        // olarak dondurecek bir method olusturun.


        System.out.println(listeOlarakDondurenMethod());

    }

    public static List<String> listeOlarakDondurenMethod() {
        List<String> isimListesi = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        String isim = "";

        do {

            System.out.println("Lutfen isim giriniz \n" +
                    "Cikmak icin Q'ya basiniz: ");
             isim = scan.nextLine().toLowerCase();
             if(!isim.equalsIgnoreCase("Q"))
            isimListesi.add(isim);
        } while (!isim.equalsIgnoreCase("Q"));
        return isimListesi;
    }
}
