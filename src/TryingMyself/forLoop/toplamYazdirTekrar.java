package TryingMyself.forLoop;

import java.util.Scanner;

public class toplamYazdirTekrar {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucuk olsa da program calissin

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen ilk bitis degerini buyuk sonra baslangic degeri kucuk olacak sekilde \n" +
                "degerleri giriniz :");
        int bit = scan.nextInt();
        int bas = scan.nextInt();
        int sonuc = 0;


            for (int i = bas; i <= bit; i++) {

                sonuc +=i;
            }
            System.out.println("Sonuc : " + sonuc);

        }

    }

