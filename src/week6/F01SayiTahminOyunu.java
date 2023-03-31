package week6;

import java.util.Scanner;

public class F01SayiTahminOyunu {
    public static void main(String[] args) {

        /*
        *Sisteme bir sayi tanimlayip, kullanicidan sayi isteyerek
        * Bu sayi fazla ise Cok soyledin dusur, az ise Dusuk soyledin arttir.
        * biulince de tebrik edip programi durduran bir kod yaziniz.

        */


            int sayi = 94;
            Scanner scan = new Scanner(System.in);
            System.out.print("Sayi tahmin oyununa hos geldiniz, Lutfen tahminde bulunmak icin bir sayi giriniz : ");



        int bayrak = 0;


        while (bayrak!=1){

            int tahmin = scan.nextInt();

            if (tahmin == sayi) {
                System.out.print("Tebrikler oyunu kazandiniz!");
                bayrak++;
                break;

            }
            else if (tahmin >= 70 && tahmin <= sayi) {
                System.out.print("Cok yaklastin!" +
                        "\n" +"Artirarak tahminde bulunmaya devam et : ");

            }
            else if (tahmin <70) {
                System.out.print("Uzak bir tahminde bulundun " +
                        "\n"+"Artirarak tahminde bulunmaya devam et : " );

            }
            else if (tahmin >= 95 && tahmin <= 117) {
                System.out.print("Cok yaklastin! " +
                       "\n" +"Dusurerek tahminde bulunmaya devam et : ");
            }
            else if (tahmin > 117) {
                System.out.println("Cok uzak bir tahminde bulundun" +
                       "\n"+ "Dusurerek tahminde bulunmaya devam et : " );

            }
            }

        }

    }

