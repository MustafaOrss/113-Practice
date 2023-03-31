package TryingMyself.methodsCreating;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

        // Verilen bir String'in Palindrome olup olmadigini yazdirin
        // Palindrome : duzden ve tersten ayni sekilde yazilan
        // madam, 12321, kabak

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Palindrome olup olmadigini ogrenmek istediginiz kelimeyi giriniz: ");
        String kelime = scan.nextLine();

        String sonuc = terseCevirmeMethodu.terseCevir(kelime);

        if (kelime.equals(sonuc)) {
            System.out.println("Girilen kelime palindrome.");
        } else {
            System.out.println("Girilen kelime palindrome degil.");
        }
    }
}
