package TryingMyself.methodsCreating;

import java.util.Scanner;

public class asalMi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen asal olup olmadigini merak ettiginiz sayiyi giriniz: ");
        int sayi = scan.nextInt();
        asalsaYazdir(sayi);

    }

    private static void asalsaYazdir(int sayi) {


        if (sayi == 2) {
            System.out.println("2 asal bir sayidir.");
        }

        int flag = 0;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                flag++;
                break;

            }
        }
        if (flag==0) {
            System.out.println("Girdiginiz: " + sayi + " sayisi asal bir sayidir.");

        } else {
            System.out.println("Girdiginiz: " + sayi + " sayisi asal bir sayi degildir.");
        }


    }
}