package TryingMyself.Ifelse;

import java.util.Scanner;

public class Try2_Ifelse {
    public static void main(String[] args) {

         /*
        Soru 2- Kullanicidan notunu alin
        50 veya daha buyukse ”Sinifi Gectin”,
        50’den kucukse “Maalesef kaldin” yazdirin.
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz : ");
        double not = scan.nextDouble();

        if (not >= 50 && not <= 100){
            System.out.println("Tebrikler sinifi gectiniz.");
        }
        else if (not >= 0 && not <50){
            System.out.println("Maalesef kaldiniz.");
        }

    }
}
