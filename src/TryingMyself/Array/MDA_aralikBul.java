package TryingMyself.Array;

public class MDA_aralikBul {
    public static void main(String[] args) {

        // Cok katmanli bir array'de 20 ile 40 arasinda olan sayilarin(20 ve 40 dahil) toplamini bulun

        int[][] arr = {{12, 23, 65}, {34, 26, 42}, {29}};

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] >= 20 && arr[i][j] <= 40) {
                   toplam += arr[i][j];
                }
            }
        }
        System.out.println(toplam);
    }
}
