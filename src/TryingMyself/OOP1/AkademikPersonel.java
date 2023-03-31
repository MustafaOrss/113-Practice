package TryingMyself.OOP1;

public class AkademikPersonel extends Calisan{
    String bolum = "Bilgisayar";
    String akademikUnvan = "Bilgisayar bilimcisi";



    public static void main(String[] args) {
        AkademikPersonel obj3 = new AkademikPersonel();
        System.out.println("Isim : "+obj3.getIsim());
        System.out.println("Maas : "+obj3.getMaas());
        System.out.println("Pozisyon : "+obj3.getPozisyon());
        System.out.println("Bolum : "+obj3.getBolum());
        System.out.println("Akademik unvan : "+obj3.getAkademikUnvan());
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public void setAkademikUnvan(String akademikUnvan) {
        this.akademikUnvan = akademikUnvan;
    }

    public String getBolum() {
        return bolum;
    }

    public String getAkademikUnvan() {
        return akademikUnvan;
    }
}
