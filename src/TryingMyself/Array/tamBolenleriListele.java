package TryingMyself.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class tamBolenleriListele {
    public static void main(String[] args) {

        // Soru 6- Kullanicidan main method'da pozitif bir tamsayi alip,
        //         o tamsayiyi tam bolebilen tum pozitif tamsayilari
        //         bir liste olarak bize donduren bir method olusturun.

        Scanner scan = new Scanner(System.in); // <-- Kullacidan deger alinmasi icin Scanner olusturuldu
        System.out.println("Lutfen bir tam sayi giriniz: "); // <-- Kullaniciya ne yapmasi gerektiginin mesaji verildi
        int girilenSayi = scan.nextInt(); // <-- kullanicidan alinan deger kaydedildi (istenen deger primitive data turu olarak alindigi icin "int" kullanildi)

        System.out.println(bolmeMethodu(girilenSayi)); // <-- method cagirma (methodu main method'un icerisinde cagirip yazdirdik)

    }

    public static List<Integer> bolmeMethodu(int Sayi) {
        List<Integer> liste = new ArrayList<>(); // <-- girilen sayinin tam bolenlerini siralamak icin bos bir liste olusturduk

        for (int i = 1; i <=Sayi; i++) { // <--bir for loop dongusu olusturarak kullanicidan alip kaydettigimiz deger kadar
                                                // donmesini sagladik ve donus uzunlugu kadar i degiskenini artirdik
            if (Sayi % i == 0) {  // <-- Kullanicidan aldigimiz ve kaydettigimiz degeri her seferinde i degiskenine bolduk ve kalaninin sifir olmasi icin kosul belirttik
                liste.add(i); // <-- Kosulumuz saglaniyor ise i degiskenini olusturdugumuz bos liste'ye ekledik
            }
        }
        return liste; // <-- main method'da islem yapmak icin dondurmek istedigimiz ne ise onu yazdik

    }
}
