package TryingMyself.Ifelse;

import java.util.Scanner;

public class Try5_Ifelse {
    public static void main(String[] args) {

          /*
        Soru 5- Kullanicidan bir harf isteyin,
        girilen karakter kucuk harf ise onu buyuk harf  olarak yazdirin,
        yoksa girilen harfi yazdirin
     */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir harf giriniz : ");
        char  krk = scan.nextLine().charAt(0);
        if (krk>= 'a' && krk <= 'z'){
            System.out.println("Girdiginiz karakterin donusturulmus hali : "+Character.toUpperCase(krk));
        }
        else{
            System.out.println("Girdiginiz karakter : " + krk);
        }
    }
}
