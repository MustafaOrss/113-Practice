package TryingMyself.StringManipulation;

import java.util.Scanner;

public class cumleIci {
    // Soru 1 : Kullanicidan bir cumle alin
    //- cumlede ev geciyorsa, "home sweet home" yazdirin
    //- cumlede is geciyorsa, "calismak guzeldir"
    //- ikisini de iceriyorsa "Hem ev lazim hem is"
    //- hicbirini icermiyorsa "cok calisman lazim" yazdirin

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz : ");
        String cumle = scan.nextLine();
        cumle = cumle.toLowerCase();
        if(cumle.contains("ev")){
            System.out.println("Home sweet home.");
        }
        if (cumle.contains("iş")){
            System.out.println("Hem ev lazım hem iş.");
        }
        else{
            System.out.println("Cok calışman lazım...!");
        }



    }
}
