package week09;

import java.util.Arrays;
import java.util.Scanner;

public class P04_Arrays {
    public static void main(String[] args) {
        /*
            Kullanicidan array'in boyutunu ve elementlerini alip array'i olusturan ve bize donduren bir method olusturun.

         */

        System.out.println(Arrays.toString(kullaniciyaArrayYaptir()));
    }

    private static int[] kullaniciyaArrayYaptir() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen olusturmak istediginiz Array'i boyutunu giriniz: ");
        int length = scan.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Array'e eklemek istediginiz sayiyi giriniz: ");
            arr[i] = scan.nextInt();
        }
        return arr;

    }
}
