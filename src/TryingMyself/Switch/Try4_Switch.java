package TryingMyself.Switch;

import java.util.Scanner;

public class Try4_Switch {
  /*
            Kullanicidan ISTQB kisaltmasindan hangi harfin anlamini ogrenmek istedigini sorun ve girilen
            harfin karsiligini yazdirin.

            I:  INTERNATIONAL S : SOFTWARE  T : TESTING Q : QUALIFICATIONS B : BOARD

     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("ISTQB kisaltmasindan acilimini gormek istediginiz harfi giriniz : ");
        char harf = scan.next().charAt(0);
        harf = Character.toUpperCase(harf);

        switch (harf) {
            case 'I':
                System.out.println("INTERNATIONAL");
                break;
            case 'S':
                System.out.println("SOFTWARE");
                break;
            case 'T':
                System.out.println(" TESTING");
                break;
            case 'Q':
                System.out.println("QUALIFICATIONS");
                break;
            case 'B':
                System.out.println("BOARD");
                break;
            default:
                System.out.println("Yanlis giriste bulundunuz.");
        }


    }


}
