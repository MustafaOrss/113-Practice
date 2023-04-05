package TryingMyself.whileLoop;

public class rakamlarToplamiMethodla {

    // verilen pozitif bir tamsayinin
    // rakamlar toplamini bize döndüren method olusturun

    public static int toplaMethodu(int girilen) {

        int birlerBasamagi = 0;
        int sayi = girilen;
        int toplam = 0;
        int basamakSayisi = (sayi + "").length();

        for (int i = 0; i < basamakSayisi; i++) {


            birlerBasamagi = sayi % 10;
            sayi -= birlerBasamagi;
            toplam += birlerBasamagi;
            sayi /= 10;
        }
        return toplam;
    }

}

