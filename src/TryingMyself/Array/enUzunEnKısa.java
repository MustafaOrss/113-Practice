package TryingMyself.Array;

public class enUzunEnKısa {
    public static void main(String[] args) {
        //Soru 6- Verilen String bir array’deki
        //        en uzun ve en kisa kelimeleri yazdiran bir method olusturun.

        String[] arr1 = { "Melike", "Ali","Su", "Can", "Canan"};

        enUzunVeEnKisaBul(arr1);

    }

    private static void enUzunVeEnKisaBul(String[] arr) {

        String enUzun = arr[0];
        String enKisa = arr[0];

        for (int i = 0; i < arr.length; i++) {


            if (enUzun.length() < arr[i].length()) {
                enUzun =arr[i] ;
            }

            if (enKisa.length() > arr[i].length()) {
                enKisa = arr[i];
            }
        }
        System.out.println("En uzun length : " + enUzun);
        System.out.println("En kisa length : " + enKisa);
    }

}
