package TryingMyself.Array;

import java.util.Arrays;

public class istenenElemaniBul {
    public static void main(String[] args) {
        // Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini
        //         ve varsa kac kere kullanildigini yazdiran bir method olusturun.

        int[] elemanlar = {3, 5, 6, 8, 2, 3, 5, 5, 9};
        String[] elemanlar2 = {"E", "B", "D", "A"};

        aramaMethodu(elemanlar, 5);
        aramaMethodu2(elemanlar2, "E");
    }

    private static void aramaMethodu(int[] aranan, int arayan) {

        int sayac = 0;

        for (int i = 0; i < aranan.length; i++) {
            if (aranan[i] == arayan) {
                sayac++;
            }
        }
        System.out.println(sayac);
    }

    private static void aramaMethodu2(String[] arananString, String arayanString) {

        int sayac1 = 0;

        for (int i = 0; i < arananString.length; i++) {
            if (arananString[i].equals(arayanString)) {
               sayac1++;
            }
        }
        System.out.println(sayac1);
    }

}
