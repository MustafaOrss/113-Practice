package week8;

import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        System.out.println("1- Toplama 2-Cikarma 3-Carpma 4-Bolme \n" +
                "Lutfen yapmak istediginiz islemi seciniz : ");
        Scanner scan = new Scanner(System.in);
        int islem = scan.nextInt();
        System.out.print("");
        System.out.println("Ilk sayiyi giriniz : ");
        double sayi1,sayi2, sonuc;
        sayi1 = scan.nextDouble();
        System.out.println("Ikinci sayiyi giriniz: ");
        sayi2 = scan.nextDouble();
        switch (islem){
            case 1: {
                sonuc = sayi1+sayi2;
                System.out.println("Islem sonucu: " + sonuc);
                break;
            }
            case 2:{
                sonuc = sayi1-sayi2;
                System.out.println("Islem sonucu : " + sonuc);
                break;
            }
            case 3:{
                sonuc= sayi1*sayi2;
                System.out.println("Islem sonucu : " + sonuc);
                break;
            }
            case 4:{
                sonuc = sayi1/sayi2;
                System.out.println("Islem sonucu : " + sonuc);
                break;
            }
            default:{
                System.out.println("Yanlis giris.");
            }
        }

    }
}
