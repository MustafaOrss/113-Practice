package TryingMyself.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class scannerİleListeOlustur {
    // Kullanicidan istedigi kadar isim alip,
    // Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek bir method olusturun.

    public static void main(String[] args) {

        System.out.println(kullanicidanAlarakListeOlustur());

    }

    public static List<String> kullanicidanAlarakListeOlustur() {


        List<String> isimler = new ArrayList<>();
        String girilenIsim = "";
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Lutfen isim giriniz"
                    + "\n cikmak icin Q'ya basiniz: ");
            girilenIsim = scan.nextLine();
            if (!girilenIsim.equalsIgnoreCase("q")) {
                isimler.add(girilenIsim);
            }
        } while (!girilenIsim.equalsIgnoreCase("Q"));

        return isimler;
    }

}
