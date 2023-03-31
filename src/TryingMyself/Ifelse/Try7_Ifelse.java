package TryingMyself.Ifelse;

import java.util.Scanner;

public class Try7_Ifelse {
    public static void main(String[] args) {

         /*
        Soru 7- Kullanicinin kilo(kg) ve boyunu(cm) isteyip
                vucut kitle endeksini hesaplayin (kilo*10000 / (boy *boy))
                vucut kitle endeksi 30’dan buyukse obez,
                20-25 arasi ise normal,
                20’den kucukse zayif yazdirin. */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen Kilonuzu giriniz : ");
        int kilo = scan.nextInt();
        System.out.print("Lutfen boyunuzu giriniz : ");
        int boy = scan.nextInt();

        int endeks = (kilo*10000)/(boy*boy);

        if (endeks>= 30){
            System.out.println("Obez.");
        }
       else if (endeks>=20 || endeks<=25){
            System.out.println("Normal.");
        }
      else if(endeks<20){
            System.out.println("Zayif.");
        }


    }
}
