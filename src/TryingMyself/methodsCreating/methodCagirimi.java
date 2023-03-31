package TryingMyself.methodsCreating;

import java.util.Scanner;

public class methodCagirimi {
    public static void main(String[] args) {
        // Kullanicidan 10'dan kucuk iki pozitif tamsayi alip
        // faktoryel degerlerini toplayin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 10'dan kucuk 2 sayi giriniz: ");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        int sonuc = faktoryelKullanimi.faktoryelHesapla(sayi1) + faktoryelKullanimi.faktoryelHesapla(sayi2);
        System.out.println(sonuc);
    }
}
