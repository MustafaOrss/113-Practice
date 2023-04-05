package TryingMyself.methodsCreating;

import java.util.Scanner;

public class isimDuzenleme {
    /*
    - Kullanicidan main method icinde ayri ayri isim ve soyismini alin
      Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
      isim bosluk soyisim seklinde bize donduren bir method olusturun
      input : isim : Ali soyisim :YILMAZ. output : Ali Yilmaz
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz: ");
        String isim = scan.nextLine();
        System.out.println("Lutfen soyisminizi giniz: ");
        String soyisim = scan.nextLine();

        System.out.println(duzenliYazdir(isim, soyisim));
    }

    private static String duzenliYazdir(String isim, String soyisim) {

        isim = isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase();

        soyisim = soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).toLowerCase();
        return isim+ " " +soyisim;

    }

}
