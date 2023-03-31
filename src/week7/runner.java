package week7;

import java.util.ArrayList;

public class runner {
    /*
        Ogrenci Yonetim Plartformu

        1. Bu programda ogrenci kayitlari ile ilgili islemler yapilabilmektedir. kayitlarda su bilgiler olmalidir

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
     */
    public static void main(String[] args) {


        ArrayList<ogrenci> ogrList = new ArrayList();
        ogrenci ogrenci1 = new ogrenci("Avdullah", "Bozca", "1111", 34, 55, 1);
        ogrList.add(ogrenci1);
        ogrenci ogrenci2 = new ogrenci("Avdullah", "Bozca", "2222", 34, 55, 1);
        ogrList.add(ogrenci2);
        ogrenci ogrenci3 = new ogrenci("Avdullah", "Bozca", "3333", 34, 55, 1);
        ogrList.add(ogrenci3);
        Islemler islemler = new Islemler();
        islemler.menu(ogrList);
    }
}
