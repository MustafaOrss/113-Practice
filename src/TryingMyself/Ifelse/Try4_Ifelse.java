package TryingMyself.Ifelse;

import java.util.Scanner;

public class Try4_Ifelse {
     /*
           Soru 4- Kullanicidan bir karakter girmesini isteyin,
           girilen karakterin buyuk harf olup olmadigini yazdirin.
     */

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir karakter giriniz : ");
        char krktr = scan.nextLine().charAt(0);

        if (krktr >= 'A' && krktr <='Z'){
            System.out.println("Girdiginiz karakter buyuk harflidir.");
        } else if (krktr >= 'a' && krktr<='z') {
            System.out.println("Girdiginiz karakter kucuk harflidir.");
        }
        else{
            System.out.println("Lutfen karakter giriniz.");
        }

    }
}
