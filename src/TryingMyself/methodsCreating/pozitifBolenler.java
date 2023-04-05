package TryingMyself.methodsCreating;

import java.util.Scanner;

public class pozitifBolenler {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sayi giriniz: ");
        int girilen = scan.nextInt();

        pozitifBolen(girilen);

    }

    public static Integer pozitifBolen(int sayi) {
        int flag = 0;
        for (int i = 0; i < sayi; i++) {
            if (i % 2 == 0) flag++;

        }
        System.out.println("Girilen " + sayi + " Sayisinin pozitif tam bolen sayisi " + flag);
        return flag;

    }

}
