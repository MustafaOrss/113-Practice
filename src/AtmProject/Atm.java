package AtmProject;

import java.util.Scanner;

public class Atm {

    /*
                                                      --   ATM  --

        Kullanicidan giris icin kart numarasi ve sifresini isteyin,
        eger herhangi birini yanlis girerse tekrar isteyin. Kart numarasi aralarda bosluk ile girerse de eger dogruysa kabul edin
        Kart numarasi ve sifre dogrulanirsa kullanicinin yapabilecegi islemleri ekrana yazdirin,

        Menu listesinde Bakiye sorgula, para yatirma, para cekme para gonderme, sifre degistirme ve cikis islemleri olacaktir.

        Para cekme ve para gonderme isleminde mevcut bakiyeden fazla para cekilemez,

        Para gonderme isleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger degilse menu ekranina geri donulsun.

        Sifre degistirme isleminde mevcut sifreyi teyit ettikten sonra, sifre degisikligik islemini yapmali

    */

    static String kartNo = "123456";
    static String sifre = "1234";

    static Scanner scan = new Scanner(System.in);

    static double bakiye = 50000;

    public static void main(String[] args)
    {
        int flag =0;

        giris();


    }


    private static void giris() {
//        Kullanicidan giris icin kart numarasi ve sifresini isteyin,
//        eger herhangi birini yanlis girerse tekrar isteyin. Kart numarasi aralarda bosluk ile girerse de eger dogruysa kabul edin
//        Kart numarasi ve sifre dogrulanirsa kullanicinin yapabilecegi islemleri ekrana yazdirin,


        System.out.println("KART NUMARASI GİRİNİZ: ");

        String kKartNo = scan.nextLine().replace(" ", "");
        System.out.println("ŞİFRE GİRİNİZ: ");
        String kSifre = scan.next();



        if (kSifre.equals(sifre) && kKartNo.equals(kartNo)) {
            menu();
        }

        else {
            System.out.println("KULLANICI ADI VEYA SİFRE YANLIŞ GİRİLDİ...");
            scan.nextLine(); // dummy ----------> art arda scanner objesi kullanildiginda alinan hatayi engellemek amacli kullandik
            giris();

        }

    }

    private static void menu() {

        //Menu listesinde Bakiye sorgula, para yatirma, para cekme para gonderme, sifre degistirme ve cikis islemleri olacaktir.

        System.out.print("YAPMAK İSTEDİĞİNİZ İŞLEMİ SEÇİNİZ: \n" +
                "1. BAKİYE SORGULAMA\n" +
                "2. PARA YATIRMA\n" +
                "3. PARA ÇEKME\n" +
                "4. PARA GÖNDERME\n" +
                "5. ŞİFRE DEĞİŞTİRME\n" +
                "6. ÇIKIŞ\n" +
                "SEÇİMİNİZ: ");
        int secim = scan.nextInt();
        switch (secim) {
            case (1): {
                // BAKİYE SORGULAMA
                bakiyesorgula();
            }
            case (2): {
                // PARA YATIRMA
                System.out.println("YATIRMAK İSTEDİĞİNİZ MİKTARI GİRİNİZ: ");
                double miktar = scan.nextDouble();
                paraYatirma(miktar);
            }

            case (3): {
                // PARA ÇEKME
                // Para çekme ve para gönderme işleminde mevcut bakiyeden büyük para çekilemez
                System.out.println("ÇEKMEK İSTEDİĞİNİZ MİKTARI GİRİNİZ: ");
                double miktar = scan.nextDouble();
                paraCekme(miktar);
            }
            case (4): {
                paraGonderme();
            }
            // PARA GÖNDERME
            //   Para gonderme isleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger degilse menu ekranina geri donulsun.

            case (5): {
                //  Sifre degistirme isleminde mevcut sifreyi teyit ettikten sonra, sifre degisikligik islemini yapmali

                sifreDegistir();
            }

            case (6): {

                System.exit(0);
            }
            default:{
                System.out.println("Hatali giris yaptiniz..");
            }
        }
    }

    private static void sifreDegistir() {

        System.out.print("Eski sifrenizi giriniz: ");
        String eSifre = scan.next();

        if (eSifre.equals(sifre)) {
            System.out.print("Yeni sifre giriniz: ");
            sifre = scan.next();
            scan.nextLine(); // ---> dummy mantigi.
             System.out.println("Sifreniz olusturuldu...");
            giris();
        } else {
            
            System.out.println("Hatali giris yaptiniz!");

            sifreDegistir();

        }
    }


    private static void paraGonderme() {

        scan.nextLine();
        System.out.print("Gondermek istediginiz Iban'i giriniz : \n" +
                "Not : Iban TR ile baslamali :");
        String iban = scan.nextLine().replace(" ", "").toUpperCase();

        if (iban.length() != 26 && !iban.startsWith("TR")) {
            System.out.println("Iban veya TR girisi hatali");
            paraGonderme();
        }
          else if (iban.length() == 26 && iban.startsWith("TR")) {

            System.out.print("Gondermek istediginiz miktari giriniz : ");
            double miktar = scan.nextInt();
            if (miktar <= bakiye) {
                System.out.println(miktar + " TL '" + iban + "' Nolu hesaba gonderildi.");
                bakiye = bakiye - miktar;
                System.out.println("kalan bakiyeniz : " + bakiye);
                scan.nextLine();
                giris();

            } else {
                System.out.println("Gondermek istediginiz tutara sahip degilsiniz!\n" +
                        "Bakiyeniz " + bakiye);

            }

        }
    }

    private static void paraCekme(double miktar) {
        // Para çekme ve para gönderme işleminde mevcut bakiyeden büyük para çekilemez
        if (miktar <= bakiye) {
            bakiye -= miktar;
            bakiyesorgula();
        } else {
            System.out.println("Çekmek istediginiz tutara sahip degilsiniz!");
            menu();
        }
    }

    private static void paraYatirma(double miktar) {
        bakiye += miktar;
        bakiyesorgula();
    }


    private static void bakiyesorgula() {
        System.out.println("BAKİYENİZ: " + bakiye + "\n");
        menu();
    }

}
