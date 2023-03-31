package CoffieMachine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class kodlamaKismi {

    public static void main(String[] args) {
        System.out.println("Kahveciye Hos Geldiniz...");
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen paranizi giriniz : ");
        double para = scan.nextDouble();
        scan.nextLine(); // -----> DUMMY ATILDI

        boolean bayrak = true;
        List<String> liste = new ArrayList<>();
        double number1 = 0;
        double number2 = 0;
        double number3 = 0;
        double number4 = 0;
        double number5 = 0;
        double number6 = 0;
        double number7 = 0;


        while (bayrak) {
            System.out.println("Lutfen listeden kahve seciniz : ");
            kahveListesi.kahveListesi();
            int kahveTuru = scan.nextInt();
            scan.nextLine();
            if (para > 1) {
                switch (kahveTuru) {
                    case 1: {

                        fiyatListesi.americanoFiyat();
                        int boyutNumarasi = scan.nextInt();
                        number1 = boyutFiyatListesi.AmericanoBoyutFiyat(boyutNumarasi);
                        para -= number1;
                        System.out.println("Kalan bakiyeniz : " + para + "TL");
                        break;


                    }
                    case 2: {
                        fiyatListesi.CappicunoFiyat();
                        int boyutNumarasi = scan.nextInt();
                        number2 = boyutFiyatListesi.CappicunoBoyutFiyat(boyutNumarasi);
                        para -= number2;
                        System.out.println("Kalan bakiyeniz : " + para + "TL");
                        break;
                    }
                    case 3: {
                        fiyatListesi.espressoFiyat();
                        int boyutNumarasi = scan.nextInt();
                        number3 = boyutFiyatListesi.EspressoBoyutFiyat(boyutNumarasi);
                        para -= number3;
                        System.out.println("Kalan bakiyeniz : " + para + "TL");
                        break;
                    }
                    case 4: {
                        fiyatListesi.LatteFiyat();
                        int boyutNumarasi = scan.nextInt();
                        number4 = boyutFiyatListesi.LatteBoyutFiyat(boyutNumarasi);
                        para -= number4;
                        System.out.println("Kalan bakiyeniz : " + para + "TL");
                        break;
                    }
                    case 5: {
                        fiyatListesi.MoccaFiyat();
                        int boyutNumarasi = scan.nextInt();
                        number5 = boyutFiyatListesi.MochaBoyutFiyat(boyutNumarasi);
                        para -= number5;
                        System.out.println("Kalan bakiyeniz : " + para + "TL");
                        break;
                    }
                    case 6: {
                        fiyatListesi.MacchiatoFiyat();
                        int boyutNumarasi = scan.nextInt();
                        number6 = boyutFiyatListesi.MacchiatoBoyutFiyat(boyutNumarasi);
                        para -= number6;
                        System.out.println("Kalan bakiyeniz : " + para + "TL");
                        break;
                    }
                    case 7: {
                        fiyatListesi.DecafFiyat();
                        int boyutNumarasi = scan.nextInt();
                        number7 = boyutFiyatListesi.DecafBoyutFiyat(boyutNumarasi);
                        para -= number7;
                        System.out.println("Kalan bakiyeniz : " + para + "TL");
                        break;
                    }
                    default:
                        System.out.println("Yanlis giriste bulundunuz.");
                }


                if (para >= 1) {
                    System.out.println("Alisverise devam etmek istiyor musunuz?\nYes - No");
                    String devam = scan.next().toLowerCase();
                    if (devam.equals("yes")) {
                        bayrak = true;
                    } else if (devam.equals("no")) {
                        System.out.println("Cikiliyor.");
                        bayrak = false;
                    } else if (para < 1) {
                        System.out.println("Bakiye yetersiz para yukleyiniz? \n Yes - No");

                        String istek = scan.next().toLowerCase();
                        if (istek.equals("Yes")) {
                            System.out.println("Paranizi makinaya yukleyiniz : ");
                            int yukleme = scan.nextInt();
                            para += yukleme;
                        } else if (istek.equals("No")) {
                            bayrak = false;

                        }
                    }
                }
            }
        }
    }


}