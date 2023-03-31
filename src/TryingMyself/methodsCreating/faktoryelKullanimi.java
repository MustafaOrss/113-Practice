package TryingMyself.methodsCreating;

public class faktoryelKullanimi {
    // verdigimiz bir sayinin faktoryelini hesaplayip
    // sonucu bize donduren bir method olusturun

    public static void main(String[] args) {

        int sonuc = faktoryelHesapla(4);
        System.out.println(sonuc);



    }

    public static int faktoryelHesapla(int sayi) {

        int faktoryel =1;
        for (int i = sayi; i >=1 ; i--) {
            faktoryel *= i;
        }
        return faktoryel;
    }
}
