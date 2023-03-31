package week04;

import java.util.Scanner;

public class P03_foorLoop {
    public static void main(String[] args) {

        /*
            Kullanicidan 150'den küçük pozitif bir sayi alin, 1’den baslayarak tum
            tamsayilari yazdirin, sira
            - 3 ile bolunebilen bir sayiya gelirse, sayi yerine WISE
            - 5 ile bolunebilen bir sayiya gelirse sayi yerine QUARTER
            - hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine WISE QUARTER
            yazdirin
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("150'den kucuk pozitif bir tamsayi giriniz: ");
        int girilenSayi = scan.nextInt();
        for (int i = girilenSayi; i <=girilenSayi ; i++) {

             if (i%3==0 && i%5==0){
                System.err.println("WISE QUARTER");

            }

            else if(i%3==0){
                System.err.println("WISE");
            }
            else if (i%5==0){
                System.err.println("QUARTER");
            }
            else {
                 System.out.println(i+"");
             }
        }

    }
}
