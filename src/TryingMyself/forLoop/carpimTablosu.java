package TryingMyself.forLoop;

import java.util.Scanner;

public class carpimTablosu {
    public static void main(String[] args) {
        // verilen bir rakam icin carpim tablosu olusturun

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen sayiyi giriniz :");
        int sayi = scan.nextInt();

        for (int i = 1; i <=sayi ; i++) {
            for (int j = 1; j <=sayi ; j++) {
                System.out.print(i*j + " " );
            }
            System.out.println("");
        }
    }
}
