package week02;

import java.util.Scanner;

public class P02_IfElseStatements {
    public static void main(String[] args) {

        /*
1- Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
Ornek:  gun=Pazar output = "Hafta sonu"  gun=Sali output = "Hafta ici"
*** String icin equals method'unusalı kullanin
 */
/*

        Scanner scan = new Scanner(System.in);
        System.out.println("Bugun gunlerden hangi gun.");
        String gun = scan.next().toLowerCase();
        if (gun.equals("cumartesi")|| gun.equals("pazar")) {

            System.out.println("Bugun Hafta sonu - Iyi tatiller.");
        }
        if(gun.equals("Pazartesi")|| gun.equals("Sali")|| gun.equals("Carsamba")|| gun.equals("Persembe")|| gun.equals("Pazar")){
            System.out.println("Hafta icerisindesin calisman gerek ");
        }if (!(gun.equals("Pazartesi")|| gun.equals("Sali")|| gun.equals("Carsamba")|| gun.equals("Persembe")||
                    gun.equals("Pazar")|| gun.equals("cumartesi")|| gun.equals("pazar"))) {

                System.out.println("Yanlis giris.");
        }
*/
/*
            2- Kullanıcıdan İki adet vize notu ve bir adet final notu girmesini isteyin
            Yıl sonu notunu vizeler %40 finaller % 60 olacak şekilde hesaplayıp
            Ders durumuna bu not 50'den büyük ise Geçtiniz Tebrikler! olduğunu 50'den
            küçükse Maalesef Kaldınız olarak aşağıdaki formatta yazdırınız

            Ad:
            Soyad:
            1.Vize:
            2. Vize:
            Final :
            Yıl Sonu Notu:
            Ders Durumu :

*/
        Scanner scan = new Scanner(System.in);
        System.out.print("Adınızı Giriniz :");
        String ad = scan.next();
        System.out.print("Soyadınızı Giriniz :");
        String soyAd = scan.next();
        System.out.print("1.Vize Notunuzu Giriniz : ");
        double not1 = scan.nextDouble();
        System.out.print("2.Vize Notunuzu Giriniz : ");
        double not2 = scan.nextDouble();
        System.out.print("Final Notunuzu Giriniz : ");
        double not3 = scan.nextDouble();

        double ort = (((not1 + not2) / 2) * 0.4) + (not3 * 0.6);
        if (ort >= 50) {
            System.out.println("Adınız :" + ad + "\n" + "Soyadınız : " + soyAd + "\n" +
                    "1.Vize : " + not1 + "\n" + "2.Vize : " + not2 + "\n" +
                    "Final : " + not3 + "\n" +
                    "Yılsonu Notu : " + ort + "\n" + "Ders Durumu : Geçtiniz");

        } else {
            System.out.println("Adınız :" + ad + "\n" + "Soyadınız : " + soyAd + "\n" +
                    "1.Vize : " + not1 + "\n" + "2.Vize : " + not2 + "\n" +
                    "Final : " + not3 + "\n" +
                    "Yılsonu Notu : " + ort + "\n" + "Ders Durumu : Kaldınız");

        }

    }
}

