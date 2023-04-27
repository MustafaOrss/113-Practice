package Team113_ogrenciPratikDersleri.ArrList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class W01tekrarEdenlerdenKurtulma {
    public static void main(String[] args) {

        // Verilen bir array'den tekrar eden sayilari silip
        // her bir elementin sadece bir kez kullanildigi bir hale donusturup bunuda ArrayList'e atayalim

        int[] arr = {3,5,9,5,2,0,1,2,4,5,9,2,3,4,5,3,3,5};

        List<Integer> yeniHali = new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            if(!yeniHali.contains(arr[i])){
                yeniHali.add(arr[i]);
            }
        }
        Collections.sort(yeniHali);
        System.out.println(yeniHali);

    }
}
