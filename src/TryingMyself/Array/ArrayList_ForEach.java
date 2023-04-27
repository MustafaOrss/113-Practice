package TryingMyself.Array;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_ForEach {
    public static void main(String[] args) {
        int[] arr = {3,4,6,7,9,7,8,3,1,6,3,8,9,0,5};

        // arr array'inin elementlerini ArrayList'e ekleyelim


        List<Integer> sayilar = new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            sayilar.add(arr[i]);
        }
        System.out.println("ArrayList'e eklenmis hali: " + sayilar);  // <-- Bu sekilde liste olarak yazdirdik

        // arr'nin tum elemanlarini yazdiralim


        int toplam = 0;
        for (int each: arr
             ) {

           toplam += each;
        }
        System.out.println(toplam);
    }

}
