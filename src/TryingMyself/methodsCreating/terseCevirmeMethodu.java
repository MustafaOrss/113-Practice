package TryingMyself.methodsCreating;

public class terseCevirmeMethodu {
    public static void main(String[] args) {

        // Verilen bir String'i tersine cevirip
        // bize donduren bir method olusturun

        System.out.println(terseCevir("merhaba."));
    }

    public static String terseCevir(String metin) {

        String tersMetin="";
        for (int i =metin.length()-1; i >=0 ; i--) {
          tersMetin +=  metin.charAt(i);

        }
        return tersMetin;
    }
}
