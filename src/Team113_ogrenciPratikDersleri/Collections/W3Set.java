package Team113_ogrenciPratikDersleri.Collections;

import java.util.*;

public class W3Set {
    public static void main(String[] args) {


        // verilen bir array'in tekrar eden elementlerini silip
        // her elementin sadece 1 kere kullanildigi hale getirin

        int[] arr = {1,2,4,9,6,5,2,3,4,6,5,6,1,3,5,6,1,3,5};
        Set<Integer> benzersiz = new HashSet<>();

        for (int each: arr
             ) {
            benzersiz.add(each);
        }

        List<Integer> son = new ArrayList<>(benzersiz);
        System.out.println(benzersiz);
    }
}
