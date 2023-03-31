package week01;

public class P02_dataTypes {
    public static void main(String[] args) {
        System.out.println("Merhaba Dunya ");
        String name="Tarik";
        String surname= "Yigit";
        String job="QA Software Test Engineer";
        System.out.println(name+" "+surname+" - "+job);
        System.out.println("=== ==== KOD BASARIYLA TAMAMLANDI ===");
        System.out.print (name+" ");
        System.out.print (surname+" - ");
        System.out.print(job);
        System.out.println("======= PRINTLN FARKI==");
        System.out.println (name+" ");
        System.out.println(job);

        /*byte  : Sadece tam sayi deger alir 8 bit
        short   : Sadece tam sayi deger alir 16 bit
        int     : Sadece tam sayi deger alir 32 bit
        long    : Sadece tam sayi deger alir 64 bit

        float   : Ondalikli sayi degerlerini alir, degerin sonuna kucuk veya buyuk harf ile F harfi yazilir.
        double  : Ondalikli sayi degerlerini alir.

        boolean : True veya False degeri verir
        char    : Tek tirnak icinde karakter - tirnak icinde olmadan sayi (ASCII)
        */
        byte b1 = Byte.MAX_VALUE;
        System.out.println("En yuksek byte degeri : " + b1);

    }
}

