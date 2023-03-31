package week02;

import java.util.Scanner;

public class P03_IfElseStatements {
    public static void main(String[] args) {

        /*
1- Öğrenci notunu harf notuna dönüştüren bir kod yazınız
    85-100 -----> AA
    80-85 ------> BA
    75-80 ------> BB
    65-75 ------> CB
    50-65 ------> CC
    50 Altı ise  ------> FF
     */
        Scanner scan = new Scanner(System.in);
        /*System.out.println("Lutfen notunuzu giriniz : ");
        int not = scan.nextInt();
        if (not>=85 && not<=100) {
            System.out.println("Sinav notunuz : "+not+" Harf notunuz : AA");
        }
        else if (not>=80 && not<85){
            System.out.println("Sinav notunuz : " + not + " Harf notunuz : BA");
        } else if (not>=75 && not<80) {
            System.out.println("Sinav notunuz : " + not + " Harf notunuz : BB");
        } else if (not>=65 && not<65) {
            System.out.println(" Sinav notunuz " +not+ " Harf notunuz : CB");
        } else if (not>=50 && not<60) {
            System.out.println(" Sinav notunuz " +not+ " Harf notunuz : CC");
        }
            else {
            System.out.println(" Sinav notunuz " +not+ " Harf notunuz : FF");
        }
            // Not : Birden fazla if, else-if, else durumlarinda en son adima bakilir
            // else ile bitiyorsa tum ihtimaller bakilmistir.
            // else-if ile bitiyorsa kapsanmayan ihtimaller'de vardir*/

        /*
   2- Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi
      sorun, istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
      "istediginiz birim sisteme kayitli degil" yazdirin.
     */
/*

        System.out.println("Lutfen mesafeyi kilometre olarak giriniz : ");
        double km = scan.nextDouble();
        System.out.println("Lutfen donusturmek istediginiz birimi giriniz -> (Örnek Metre) : " );
        char birim = scan.next().charAt(0);

        if(birim== 'm'|| birim=='M'){
            System.out.println("Girdiginiz mesafenin metre degeri : " + km *1000+ " 'dir.");
        } else if (birim=='s' || birim=='S') {
            System.out.println("Girdiginiz mesafenin santimetre degeri : "+km*1000*100+ " 'dir.");
        } else {
            System.out.println("istediginiz birim sisteme kayitli degil");
        }
*/

        /*
    Soru ) Interview Question
    Kullanicidan artik yil olup olmadigini kontrol
    etmek icin yil girmesini isteyin.
    Kural 1: 4 ile bolunemeyen yillar artik yil  egildir
    Kural 2: 4 ile bolunup 100 ile bolunemeyen yillar artik yildir
    Kural 3: 4’un kati olmasina ragmen 100 ile bolunebilen yillardan sadece 400’un kati olan yillar artik yildir
     */
        /*System.out.println("Lutfen kontrol etmek istediginiz yili giriniz : ");
            int yil = scan.nextInt();
            if(yil%100==0&& yil%400==0 || yil%100!=0 && yil%4==0){
                System.out.println("Girdiginiz yil artik yildir.");
            } else {
                System.out.println("Girdiginiz yil artik yil degildir.");
            }
    */
            /*
    3-Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
    yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak "Emekli
    olabilirsin" veya "Emekli olmak icin .. Yil daha calisman gerekir" yazdirin.
     */
        System.out.println("Lutfen once yasinizi sonra cinsiyetinizi E ya da K seklinde giriniz : ");
        int yas = scan.nextInt();
        char cinsiyet = scan.next().charAt(0);

        if ((cinsiyet == 'k' || cinsiyet == 'K') && yas >= 60){
            System.out.println("Emekli olabilirsiniz.");


        if ((cinsiyet == 'e' || cinsiyet == 'E') && yas < 60){
                System.out.println("Emekli olmak icin : "+(60-yas) + " yil daha calismaniz gerek.");
            } }
        if ((cinsiyet=='E' || cinsiyet=='e') && yas>=65){
                System.out.println("Emekli olabilirsiniz.");
        }
        if ((cinsiyet=='E'|| cinsiyet=='e') && yas<65){

            System.out.println("Emekli olmak icin : "+ (65-yas)+" Yil daha calismaniz gerek.");

                }

            }
        }



