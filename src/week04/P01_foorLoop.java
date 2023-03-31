package week04;

import java.util.Scanner;

public class P01_foorLoop {
    public static void main(String[] args) {
          /*
                Kullanicidan pozitif bir tamsayi alin, 1’den girilen sayiya kadar(girilen sayi
                dahil) 7 ila bolunebilen sayilari yazdirin.
          */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz : ");
        int girilenSayi = scan.nextInt();
        for (int i = 0; i <= girilenSayi; i++) {
            if (i%7==0){
                System.out.print(i+"-");

            }

        }

        System.out.println("");
        System.err.println("======================= ISLEM TAMAMLANDI =======================");

    }
}
