package TryingMyself.Array;

public class MDA_ciftSayilariBul {
    public static void main(String[] args) {

        // Cok katmanli bir array'de kac tane cift sayi oldugunu bulun

        int [][] arr = {{3,7,4,19,7}, {2,6,3},{3,6,8,7}};
        int sayac =0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

                if(arr[i][j]%2==0){
                    sayac++;
                }
            }
        }
        System.out.println(sayac);
    }
}
