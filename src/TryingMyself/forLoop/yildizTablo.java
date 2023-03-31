package TryingMyself.forLoop;

import java.util.Scanner;

public class yildizTablo {
    public static void main(String[] args) {

        // dinamik olarak verilen satir ve sutun sayisina gore
        // yildizlardan bir dikdortgen olusturun

        Scanner scan  = new Scanner(System.in);
        System.out.println("sayilari giriniz : ");
        int sat = scan.nextInt();
        int sut = scan.nextInt();

        for (int i = 1; i <=sat; i++) {
            for (int j = 1; j <=sut ; j++) {
                System.out.print(  " *");
            }
            System.out.println("");
        }

    }
}
