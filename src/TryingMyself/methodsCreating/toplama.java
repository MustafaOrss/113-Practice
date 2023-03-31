package TryingMyself.methodsCreating;

import java.util.Scanner;

public class toplama {
    // kullanicidan 2 sayi alip
    // toplamlarini yazdiran bir method olusturun
    public static void main(String[] args) {



      sayiToplami();
    }

    public static void sayiToplami() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen toplanmasi icin iki sayi giriniz: ");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        double toplam = (sayi1+sayi2);
        System.out.println("Sayilarin toplami: " + toplam);
    }


}
