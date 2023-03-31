package TryingMyself.Ifelse;

import java.util.Scanner;

public class Try1_Ifelse {

    public static void main(String[] args) {


        /*
        Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
         ucgen eskenar ise “Eskenar ucgen” yazdirin,
         degilse “Eskenar degil” yazdirin.
     */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen Ucgenin kenar uzunluklarini giriniz : ");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();

        if (kenar1 == 0 && kenar2 == 0 && kenar3 == 0){
            System.out.println("0 bir deger olarak kabul edilemez.");
        }
       else if(kenar1 == kenar2 && kenar2 == kenar3){
            System.out.println("Eskenar ucgen. ");
        }

        else if (kenar1 != kenar2 && kenar2 != kenar3) {
            System.out.println("Eskenar degil");
        }
        else {
            System.out.println("Lutfen sayisal bir deger giriniz");
        }
    }
}