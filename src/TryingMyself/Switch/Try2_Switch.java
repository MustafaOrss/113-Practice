package TryingMyself.Switch;

import java.util.Scanner;

public class Try2_Switch {

    public static void main(String[] args) {


       /*
        Kullanicidan gun numarasini alip hafta ici veya hafta sonu yazdirin.
    */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen gun sayisi giriniz : ");
        int gunNo = scan.nextInt();

        switch (gunNo){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Girdiniz gun hafta icidir.");
                break;
            case 6:
            case 7:
                System.out.println("Girdiginiz gun hafta sonudur.");
                break;
            default:
                System.out.println("Yanlis giriste bulundunuz.");

        }

    }


}
