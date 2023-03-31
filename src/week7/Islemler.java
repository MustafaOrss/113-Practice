package week7;

import java.util.ArrayList;
import java.util.Scanner;

public class Islemler {

    Scanner scan = new Scanner(System.in);
    ogrenci Ogrenci;
    int numara = 10000;
    void menu(ArrayList<ogrenci> ogrList){
        System.out.println(" ============= İŞLEMLER =============\n" +
                "          1-EKLEME\n" +
                "          2-ARAMA\n" +
                "          3-LİSTELEME\n" +
                "          4-SİLME\n" +
                "          Q-ÇIKIŞ\n"+
                "\t SECIMINIZ : ");
        char secim = scan.next().toUpperCase().charAt(0);
        switch (secim){
            case '1':{
                ekleme(ogrList);
            }
            case '2': {
                listele(ogrList);
            }
            case '3':{
                arama(ogrList);
            }
            case '4':{}
            case 'Q':{}
        }

    }

    private void arama(ArrayList<ogrenci> ogrList) {
        System.out.println("Arama yapilacak tc no : ");
        String aranacakTcNo = scan.next();
        for (ogrenci each: ogrList
             ) {
            if(aranacakTcNo.equals(each.getTcNo())){
                System.out.println("Aradiginiz ogrencinin bilgileri\n"+each);
            }

        }
    }

    private void listele(ArrayList<ogrenci> ogrList) {
        for (ogrenci each:ogrList
             ) {
            System.out.println(each);

        }
    }

    private void ekleme(ArrayList<ogrenci> ogrList) {
        System.out.print("Ogrencinin adini giriniz : ");
        String ad = scan.nextLine();
        System.out.println("");
        System.out.print("Ogrencinin soyadini giriniz : ");
        String  sAd = scan.nextLine();
        System.out.print("Ogrencinin tc numarasini giriniz : ");
        String tcNo = scan.next();
        System.out.print("Ogrencinin yasini giriniz : ");
        int yas = scan.nextInt();
        System.out.print("Ogrencinin sinifini giriniz : ");
        int sinif = scan.nextInt();

        Ogrenci  = new ogrenci(ad,sAd,tcNo,yas,numara++,sinif);
        ogrList.add(Ogrenci);
        listele(ogrList);
    }

}
