package week8;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        // Computer vs user
        // First five points win

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int userChoice = 0;
        int compChoise = 0;
        int user = 0;
        int comp = 0;
do {


    System.out.println("Asagidakilerden birini sec : \n 1- Tas  2-Kagit  3-Makas ");

    // Kullanicinin secim yapmasini istiyoruz
    userChoice = scan.nextInt();

    // Bilgisayarin secim yapmasini saglayim
    compChoise = random.nextInt(3) + 1; // --> Burada 0-3 arasinda bir deger secer (+ 1 ile 1,2,3'den birini secmesini sagladik)

    if (userChoice == 1 && compChoise == 2) {
        System.out.println("Bilgisayarin secimi : " + compChoise);
        System.out.println(" ");
        System.out.println("Kagit tasi  sarar -- Bilgisayar +1");
        comp++;

        System.out.println("Oyuncu: " + user + " Bilgisayar: " + comp);
        System.out.println(" ");
    } else if (userChoice == 1 && compChoise == 3) {
        System.out.println("Bilgisayarin secimi : " + compChoise);
        System.out.println(" ");
        System.out.println("Tas makasi kirar -- Oyuncu +1");
        user++;
        System.out.println("Oyuncu: " + user + " Bilgisayar : " + comp);
        System.out.println(" ");
    } else if (userChoice == 2 && compChoise == 1) {
        System.out.println("Bilgisayarin secimi : " + compChoise);
        System.out.println(" ");
        System.out.println("Kagit tasi sarar -- Oyuncu +1");
        user++;
        System.out.println("Oyuncu: " + user + " Bilgisayar: " + comp);
    } else if (userChoice == 2 && compChoise == 3) {
        System.out.println("Makas kagidi sarar -- Bilgisayar +1");
        System.out.println("Bilgisayarin secimi : " + compChoise);
        System.out.println(" ");
        comp++;
        System.out.println(" ");
        System.out.println("Oyuncu: " + user + " Bilgisayar: " + comp);
    } else if (userChoice == 3 && compChoise == 1) {
        System.out.println("Tas Makasi kirar -- Bilgisayar +1");
        System.out.println("Bilgisayarin secimi : " + compChoise);
        System.out.println(" ");
        comp++;
        System.out.println(" ");
        System.out.println("Oyuncu: " + user + " Bilgisayar: " + comp);
    } else if (userChoice == 3 && compChoise == 2) {
        System.out.println("Makas kagidi keser -- Oyuncu +1");
        System.out.println("Bilgisayarin secimi : " + compChoise);
        System.out.println(" ");
        user++;
        System.out.println(" ");
        System.out.println("Oyuncu: " + user + " Bilgisayar: " + comp);
    } else {
        System.out.println("Bilgisayarda " + userChoice + "secti " + " Berabere, kimse puan alamadi.");
        System.out.println("Oyuncu: " + user + " Bilgisayar: " + comp);

    }
}       while (user!=5&&comp!=5);{
            // kazanani gosterelim
            if(user>comp){
                System.out.println("------------------- Tebrikler Siz Kazandiniz -------------------");

            }
            else {
                System.out.println("------------------- Maalesef Kaybettiniz -------------------");

            }
        }
    }

}
