package week09;

public class P05_arrays {
    /*
            Verilen bir arraay'de istenen bir elemanin var olup olmadigini ve varsa kc kere kullanildigini yazdiran bir method olusturun
     */
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 5, 42, 4, 2, 6, 7, 8, 2, 9, 2};
        istenenElemaniAra(arr, 2);
    }

    private static void istenenElemaniAra(int[] arr, int aranan) {
        int sayac = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == aranan) {
                sayac++;
            }
        }
        if (sayac != 0) {
            System.out.println("Array'de aradiginiz " + aranan + " elemanindan " + " tane vardir. ");
        } else {
            System.out.println("Aradiginiz eleman array'de bulunmamaktadir.");
        }
    }
}
