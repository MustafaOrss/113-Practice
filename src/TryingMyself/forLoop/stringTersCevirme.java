package TryingMyself.forLoop;

public class stringTersCevirme {
    public static void main(String[] args) {

        //Soru 10 (interview)- Kullanicidan bir String isteyin
        //        ve String’i tersine cevirip kaydedin.

        String string = "Java'ya merhaba de.";

        System.out.println("-------------------");
        for (int i = string.length()-1; i >=0 ; --i) {
            System.out.print(string.charAt(i));
        }
    }
}
