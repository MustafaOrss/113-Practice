package Team113_ogrenciPratikDersleri.Collections;

import java.util.LinkedList;
import java.util.List;

public class W1LinkedList {

    /*
Java'da LinkedList, verileri düğümler halinde saklayan bir veri yapısıdır. Her düğüm, kendisinden sonraki düğümün adresini içerir ve son düğümün adresi null'dır.

LinkedList, veri eklemek veya çıkarmak için hızlıdır. Listenin başına veya sonuna eleman eklemek veya çıkarmak için O(1) zaman karmaşıklığına sahiptir.

Ancak, belirli bir düğüme erişmek için O(n) zaman karmaşıklığına sahiptir. Bu nedenle, LinkedList, özellikle veri ekleme veya çıkarma işlemlerinin
sık yapıldığı senaryolarda kullanışlıdır.

LinkedList, List arabirimini uygular, bu nedenle bir ArrayList ile aynı şekilde kullanılabilir. Ancak, ArrayList, erişim süreleri konusunda daha hızlıdır
ve sadece sona eklemeler veya son çıkarmalar yapılacaksa LinkedList'ten daha iyi performans gösterir.

LinkedList, bağlantılı liste yapısı nedeniyle bir dizi olarak depolanan verilerden daha fazla bellek tüketir ve ayrıca daha
yavaş erişim süreleri nedeniyle performansı etkileyebilir. Bu nedenle, LinkedList kullanmadan önce, uygulamanın ihtiyaçlarını dikkatlice düşünmek gerekir.
    */
    public static void main(String[] args) {

        LinkedList linky = new LinkedList();


        LinkedList<String> ll1 = new LinkedList<>();

        ll1.add("K");
        ll1.add("T");

        // LinkedList 3 tane interface'i implements etmistir
        // List, Queue, Deque interfaceleri
        // Dolayisiyla bu interface'lerden sonra gelen ilk concrete class oldugundan
        // Bu 3 interface'deki tum abstract method'lari override etmistir

        // LinkedList olusturulurken secilen data turune gore
        // bu 3 interface'den birinin ozelliklerini alabilir
        // veya data turu LinkedList secilirse, 3 interface'in ozelliklerini de toptan alir

        List<String> ll2 = new LinkedList<>();

        // Daha onceden arrayList olustururken, List<> interface'ini data turu olarak kullandigimizdan
        // bu sekilde olusturulan LinkedList'lerin ozelliklerini biliyoruz

        ll2.add("R"); // [R]

        ll2.add("Z"); // [R, Z]

        ll2.add(0,"A"); // [A, R, Z]

        ll2.addAll(2,ll1); // [A, R, K, T, Z]

        ll2.set(3,"M");

        System.out.println(ll2.get(1)); // R


        ll2.add("K");
        ll2.add("T");
        System.out.println(ll2); // [A, R, K, M, Z, K, T]

        System.out.println(ll2.retainAll(ll1)); // true

        System.out.println(ll2); // [K, K, T]
        ll2.add("A");

        System.out.println(ll2.hashCode()); // 3232590  [K, K, T, A]

        // System.out.println(ll2.get(4)); Exc


        System.out.println(ll2.subList(2, 4)); // 2 dahil, 4 dahil olmadigindan exception firlatmaz
    }
}
