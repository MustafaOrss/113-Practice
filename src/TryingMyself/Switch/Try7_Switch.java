package TryingMyself.Switch;

import java.util.Scanner;

public class Try7_Switch {
    //    1- Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
    //    Ornek:  gun=Pazar output = "Hafta sonu"  gun=Sali output = "Hafta ici"
    //            *** String icin equals method'unu salı kullanin

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir gun ismi giriniz : ");
        String gunIsmi = scan.next();
        gunIsmi = gunIsmi.toLowerCase();



        switch (gunIsmi) {
            case "pazartesi":
            case "salı":
            case "çarşamba":
            case "perşembe":
            case "cuma":
                System.out.println("Su an hafta ici.");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("Su an hafta sonu");
                break;
            default:
                System.out.println("Yanlis giriste bulundunuz ");

        }


    }

}
