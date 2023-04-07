package TryingMyself.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class tekrarEdenDegerleriSil {
    public static void main(String[] args) {
        // verilen bir array'den tekrar eden sayilari silip
        // her bir elementin sadece bir kez kullanildigi bir hale donusturun


        int[] arr = {3,1,5,3,2,6,5,7,8,9};

        List<Integer> tekrarlardanKurutulmusHali = new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            if(!tekrarlardanKurutulmusHali.contains(arr[i])){
                tekrarlardanKurutulmusHali.add(arr[i]);
            }
        }

       arr = new int[tekrarlardanKurutulmusHali.size()];
        for (int i = 0; i <arr.length; i++) {
              arr[i] += tekrarlardanKurutulmusHali.get(i);
        }

        
        System.out.println(Arrays.toString(arr));
    }
}
