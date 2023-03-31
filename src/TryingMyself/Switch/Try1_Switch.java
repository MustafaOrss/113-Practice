package TryingMyself.Switch;

import java.util.Scanner;

public class Try1_Switch {

    /*
        Kullanicidan ay numarasini alip mevsimi yazdirin.
    */


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir ay numarasi giriniz : ");
        int ayNo = scan.nextInt();

        switch (ayNo){
            case 12:
            case 1:
            case 2:
                System.out.println("Kis mevsimi.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Ilk bahar mevsimi.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz mevsimi.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Son bahar.");
                break;
            default:
                System.out.println("Gecersiz giriste bulundunuz.");



        }


    }



}
