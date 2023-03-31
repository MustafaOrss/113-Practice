package TryingMyself.forLoop;

import java.util.Scanner;

public class faktoryel {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan 20’den kucuk bir sayi alip,
        //       bu sayinin faktoryel degerini hesaplayin.

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen 20'den kucuk bir tam sayi giriniz :");
        int sayi = scan.nextInt();
        int faktoryel = 1;
        if (sayi>20){
            System.out.println("20'den kucuk bir tam sayi girmeniz istendi.");
        }
        else {
            for (int i = sayi; i >= 1; i--) {
                faktoryel *= i;
            }
            System.out.print("Faktoryel sonucu : " + faktoryel);
        }

    }
}
