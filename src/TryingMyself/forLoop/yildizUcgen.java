package TryingMyself.forLoop;

import java.util.Scanner;

public class yildizUcgen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Deger giriniz : ");
        int deger1= scan.nextInt();


        for (int i = 1; i <=deger1 ; i++) {

            for (int j = 1; j <=i; j++) {
                System.out.print( " *");
            }
            System.out.println("");
        }
    }
}
