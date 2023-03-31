package week09;

public class P03_Arrays {
    /*
        Verilen bir array’deki tum elementleri bir saga kaydirip, sondaki elementi de
        basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.
    */

    public static void main(String[] args) {
        int[] arr = {10, 12, 14, 16, 8};
        elementleriSagaKaydir(arr);
    }

    private static int[] elementleriSagaKaydir(int[] arr) {
        int[] yeniArr = new int[arr.length];
        yeniArr[0] = arr[arr.length - 1];
        for (int i = 0; i < arr.length; i++) {
            yeniArr[i + 1] = arr[i];

        }
        arr=yeniArr;
        return arr;
    }
}
