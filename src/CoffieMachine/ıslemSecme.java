package CoffieMachine;

import java.util.Scanner;

public class ıslemSecme {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

    /*
    ÖĞRENCİ YÖNETİM PLATFORMU KODLAYINIZ.
    1. BU PROGRAMDA ÖĞRENCİ KAYITLARI İLE İLGİLİ İŞLEMLER YAPILABİLMEKTEDİR. KAYITLARDA ŞU BİLGİLER OLMALIDIR:
          -AD SOYAD
          -KİMLİK NO
          -YAŞ
          -NUMARA
          -SINIF  BİLGİLERİNİ İÇERMELİDİR.

    2. ============= İŞLEMLER =============
          1-EKLEME
          2-ARAMA
          3-LİSTELEME
          4-SİLME
          Q-ÇIKIŞ

          SEÇİMİNİZ: ŞEKLİNDE BİR MENÜ OLUŞTURULMALI.
          3. ARAMA VE SİLME İŞLEMLERİ KİMLİK NO YA GÖRE YAPILMALIDIR.
          NOT: PROJEYİ YAPARKEN NESNE YÖNELİMLİ PROGRAMLAMANIN BİZE SAĞLADIĞI İMKANLARI KULLANMAYA DİKKAT EDİNİZ.
     */

        System.out.println("Öğrenci Yönetim Sistemine Hoşgeldiniz.. \n");
        System.out.println(
                        "          1-AD SOYAD\n" +
                        "          2-KİMLİK NO\n" +
                        "          3-YAŞ\n" +
                        "          4-NUMARA\n" +
                        "          5-SINIF  \n");

        System.out.println("Lutfen Yapmak Istediginiz islemi seciniz :  \n");

       int secim = scan.nextInt();

       switch (secim){
           case 1:
               ADSOYAD();
               break;
           case 2:
               KİMLİKNO();
               break;
           case 3:
               YAŞ();
               break;
           case 4:
               NUMARA();
               break;
           case 5:
               SINIF();
               break;




       }

    }

    private static void SINIF() {

    }

    private static void NUMARA() {
    }

    private static void YAŞ() {
    }

    private static void KİMLİKNO() {
    }

    private static void ADSOYAD() {


    }
}