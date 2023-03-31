package TryingMyself.Ifelse;

import java.util.Scanner;

public class Try3_Ifelse {
    public static void main(String[] args) {

          /*

        Soru 3- Kullanicidan yasini isteyin,

        65 yas ve uzeri ise ”Emekli olabilirsin”  yazdirin,

        yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.

     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Yasinizi giriniz : ");
        int yas = scan.nextInt();

        if (yas >= 65){
            System.out.println("Emekli olabilirsiniz.");
        }
        else {
            System.out.println("Emekli olabilmeniz icin : " + (65-yas)+ " yil daha gereklidir.");
        }


    }
}
