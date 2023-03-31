package TryingMyself.OOP1;

import java.util.Scanner;

public class Calisan  {


    /*
         Bir "Çalışan" sınıfı oluşturun. Bu sınıfın özellikleri "isim" (String), "maaş" (double) ve "pozisyon" (String) olsun.
         Ayrıca "Çalışan" sınıfında, "isim", "maaş" ve
        "pozisyon" özelliklerini ayarlamak ve almak için gerekli olan getter ve setter metodları da olmalıdır.

        Daha sonra, "İdariPersonel" sınıfı oluşturun ve "Çalışan" sınıfından türetin. "İdariPersonel" sınıfının ek
        özellikleri "departman" (String) ve "izinGünüSayısı" (int) olsun. "İdariPersonel" sınıfında, "departman" ve
        "izinGünüSayısı" özelliklerini ayarlamak ve almak için gerekli olan getter ve setter metodları da olmalıdır.

        Son olarak, "AkademikPersonel" sınıfı oluşturun ve "Çalışan" sınıfından türetin.
         "AkademikPersonel" sınıfının ek özellikleri "bölüm"
        (String) ve "akademikUnvan" (String) olsun. "AkademikPersonel" sınıfında, "bölüm" ve
        "akademikUnvan" özelliklerini ayarlamak ve
         almak için gerekli olan getter ve setter metodları da olmalıdır.*/
    Scanner scan = new Scanner(System.in);


    String isim = "Mustafa";
    double maas = 10500;
    String pozisyon = "Danisma";


    public static void main(String[] args) {


        /*IdariPersonel obj2= new IdariPersonel();

        Scanner scan3 = new Scanner(System.in);
        System.out.println("Idari personelin departmanini tanimlayiniz : ");
        String departmanTanimi = scan3.nextLine();
        obj2.setDepartmann(departmanTanimi);



        Scanner scan4 = new Scanner(System.in);
        System.out.println("Idari personelin izin gun sayisini tanimlayiniz : ");
        int izinTanimi = scan4.nextInt();
        obj2.setIzinGunSayisii(izinTanimi);



        AkademikPersonel obj3 = new AkademikPersonel();

        Scanner scan5 = new Scanner(System.in);
        System.out.println("Lutfen akademik personelin bolumunu giriniz : ");
        String bolumTanimi = scan5.nextLine();
        obj3.setBolum(bolumTanimi);

        Scanner scan6 = new Scanner(System.in);
        System.out.println("Lutfen akademik unvani tanimlayiniz : ");
        String unvanTanimi = scan6.nextLine();
        obj3.setAkademikUnvan(unvanTanimi);

        System.out.println("Calisanin ismi : "+obj.getIsim());
        System.out.println( "Calisanin Pozisyonu : "+obj.getPozisyon());
        System.out.println("Calisanin Maasi : "+obj.getMaas());
        System.out.println("Calisanin Departmani "+ obj2.getDepartmann());
        System.out.println("Calisanin Izin Toplam Izin Gunu :"+obj2.getIzinGunSayisii());
        System.out.println("Calisanin Bolumu : "+obj3.getBolum());
        System.out.println( "Calisanin Akademik Unvani : " + obj3.getAkademikUnvan());
*/
    }




    public String getIsim() {
        return isim;
    }

    public double getMaas() {
        return maas;
    }

    public String getPozisyon() {
        return pozisyon;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public void setPozisyon(String pozisyon) {
        this.pozisyon = pozisyon;
    }
}

