package TryingMyself.OOP1;

import java.util.Scanner;

public class IdariPersonel extends Calisan{


    String departmann;
    int izinGunSayisii;

    public static void main(String[] args) {

        IdariPersonel obj1 = new IdariPersonel();

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen departman giriniz : ");
        String depart = scan.nextLine();

        System.out.println("Izin gun sayisi giriniz : ");

        Scanner scan2= new Scanner(System.in);
        int izin = scan.nextInt();

        
        obj1.setDepartmann(depart);
        obj1.setIzinGunSayisii(izin);



        System.out.println("Isim : "+obj1.getIsim());
        System.out.println("Maas : "+obj1.getMaas());
        System.out.println("Pozisyon : "+obj1.getPozisyon());
        System.out.println("Departman : "+obj1.getDepartmann());
        System.out.println("Izin gun sayisi : "+obj1.getIzinGunSayisii());

    }


    public String getDepartmann() {
        return departmann;
    }

    public int getIzinGunSayisii() {
        return izinGunSayisii;
    }

    public void setDepartmann(String departmann) {
        this.departmann = departmann;
    }

    public void setIzinGunSayisii(int izinGunSayisii) {
        this.izinGunSayisii = izinGunSayisii;
    }
}
