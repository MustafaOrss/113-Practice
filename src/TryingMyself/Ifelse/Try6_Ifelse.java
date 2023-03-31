package TryingMyself.Ifelse;

import java.util.Scanner;

public class Try6_Ifelse {
    public static void main(String[] args) {

         /*
        Soru 6- Kullanicidan cinsiyetini ve yasini alin,
         Kadin, 60 yas ve uzeri , Erkek 65  yas ve uzeri emekli olabilir.
         Cinsiyet ve yasini dikkate alarak “Emekli  olabilirsin” veya
          “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
     */


        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen Cinsiyetinizi giriniz giriniz : ");

        char cnsyt= scan.next().charAt(0);


        System.out.print("Lutfen yasinizi giriniz : ");
        int yas = scan.nextInt();



        if (cnsyt =='e' || cnsyt=='E'){
           if (yas >=65){
               System.out.println("Emekli olabilirsiniz.");
           }
           else if (yas<65) {
               System.out.println("Emekli olmak icin " + (65 - yas) + " yil daha calismaniz gerekmektedir.");

           }

       }
        else {
            System.out.println("Lutfen gecerli bir cinsiyet giriniz.");
        }

        if (cnsyt == 'k' || cnsyt=='K'){
            if (yas >=60){
                System.out.println("Emekli olabilirsiniz ");
            } else if (yas <60) {
                System.out.println("Emekli olmak icin " + (60-yas) + " yil daha calismaniz lazim");
    }

            else {
                System.out.println("Lutfen gecerli bir cinsiyet giriniz.");
            }
        }
    }
}
