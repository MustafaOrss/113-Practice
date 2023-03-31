package week09;

public class P02_Arrays {
    /*
        Verilen bir array'deki pozitif tamsayilari toplayip sonucu bize donduren bir method yazininiz.
     */
    public static void main(String[] args) {

        int[] arr = {2, -5, -3, 10, 5, 3, 6, 9, -15, 20, 35};
        System.out.println(arraydekiPozitifSayilariTopla(arr)); // Sonuc array olarak donuyorsa Arrays.toStrring ile yazdirilir.
        // Sonuc int vb. donuyorsa direk yazdirilir

    }

    private static int arraydekiPozitifSayilariTopla(int[] arr) {
        int sonuc = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sonuc += arr[i];
            }
        }
        return sonuc;
    }

}
