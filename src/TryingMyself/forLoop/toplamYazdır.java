package TryingMyself.forLoop;

import java.util.Scanner;

public class toplamYazdır {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen ilk buyuk degerini kucuk sonra baslangic degeri kucuk olacak sekilde \n" +
                "degerleri giriniz :");
        int bit = scan.nextInt();
        int bas = scan.nextInt();
        int sonuc = 0;

        if (bas > bit) {
            System.out.println("Balangic degerini kucuk girmeniz istenmisti. ");
        } else {

            for (int i = bas; i <= bit; i++) {

                sonuc +=i;
            }
            System.out.println("Sonuc : " + sonuc);

        }

    }
}
