package TryingMyself.StringManipulation;

public class istenmeyenHarfler {
    public static void main(String[] args) {

         // Soru 2 : Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
        // sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.
       // input : java1 ogRe2@nMek3 #ne +Gu=zel
      // output : Java ogrenmek ne guzel.

       String duzensizKelime = "java1 ogRe2@nMek3 #ne +Gu=zel";

       String yeni1 = duzensizKelime.replaceAll("\\d", "!");
        System.out.println(yeni1);
       String yeni2 = yeni1.replaceAll(" ", "5");
        System.out.println(yeni2);
        String yeni3 = yeni2.replaceAll("\\W", "");
        System.out.println(yeni3);
        String yeni4 = yeni3.replaceAll("\\d", " ");
        System.out.println(yeni4);
        yeni4 = yeni4.substring(0,1).toUpperCase() + yeni4.substring(1).toLowerCase();
        System.out.println(yeni4);


    }

}
