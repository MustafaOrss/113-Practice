package TryingMyself.Array;

import java.util.ArrayList;
import java.util.List;

public class elemanSilmeIki {
    public static void main(String[] args) {

        List<String> elemanlar = new ArrayList<>();
        elemanlar.add("Cokomel");
        elemanlar.add("Cokoprens");
        elemanlar.add("Kekstra");
        elemanlar.add("Kitkat");

        String istenmeyen = "o";
        System.out.println(elemanSilme.silmeMethodu(elemanlar, istenmeyen)); // <-- Baska siniftan method kullanildi
    }
}
