package TryingMyself.Array;

import java.util.Arrays;

public class sayiArtirMethodla {
    // Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method olusturun.
    // Eski array’i yeni haliyle kaydedin.

    public static void main(String[] args) {

        int[] arr1 = {3,4,5,6};

        artirmaMethodu(arr1, 3);
        System.out.println(Arrays.toString(arr1));

    }

    private static int artirmaMethodu(int[] arr, int sayiArtir) {

        int sayi = 0;

        for (int i = 0; i < arr.length ; i++) {
            arr[i] += sayiArtir;
            sayi = arr[i];
        }
        return sayi;
    }

}
