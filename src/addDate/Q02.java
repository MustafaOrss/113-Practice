package addDate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q02 {
    // Girilen decimal degeri binary degere ceviren methodu olusturunuz.
    // Ornek : 12 = 1 1 0 0

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Decimal deger giriniz : ");
        int sayi = scan.nextInt();

        System.out.println(sayi + " decimal sayisinin binary karisiligi "+ binaryDonusum(sayi));
    }

    private static ArrayList<Integer> binaryDonusum(int sayi) {
        ArrayList<Integer> binary = new ArrayList<>();

        while (sayi>=1){
            binary.add(sayi%2);
            sayi/=2;

        }
        ArrayList<Integer> tersList= new ArrayList<>();
        for (int i = binary.size()-1; i >=0 ; i--) {
            tersList.add(binary.get(i));
        }
        return binary;
    }

}
