package TryingMyself.Array;

import java.util.Arrays;

public class sayilariArtir {
    public static void main(String[] args) {

        // Array'deki sayilari 3 artiriniz

        int[] sayilar = {15, 23, 43, 65, 90};

        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] += 3;

        }
        System.out.println(Arrays.toString(sayilar));

    }

}
