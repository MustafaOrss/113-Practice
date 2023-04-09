package TryingMyself.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class elemanSilme {
    public static void main(String[] args) {

        //Soru 3- Verilen String bir listede
        //        istenmeyen harf iceren elementleri silip,
        //        kalan kismini list olarak bize donduren bir method olusturun

        List<String> liste = scannerİleListeOlustur.kullanicidanAlarakListeOlustur();
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen listeden silmek istediginiz icerigi giriniz: ");
        String istenmeyenHarf = scan.nextLine().substring(0,1);

        List<String> ayiklanmisList = silmeMethodu(liste, istenmeyenHarf);
        System.out.println(ayiklanmisList);
    }

    public static List<String> silmeMethodu(List<String> liste, String istenmeyenHarf) {

        // listenin ali, veli, ayse, fatma ve istenmeyen harf a varsayarak ilerlersek
        // for loop ile elementleri ele alirken remove yapmak list'in uzunlugunu degisecek
        // bu yüzden farkli bir list olusturup, silinmeyecekleri yeni listeye kaydedelim

        List<String> ayiklanmisOlanlar = new ArrayList<>();
        for (int i = 0; i < liste.size(); i++) {
            if(!liste.get(i).contains(istenmeyenHarf)){
                ayiklanmisOlanlar.add(liste.get(i));
            }
        }
        return ayiklanmisOlanlar;
    }

}
