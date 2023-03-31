package TryingMyself.StringManipulation;

public class tersYazdirma {
    public static void main(String[] args) {

        String cumle = "Hello world";
        String ters ="";


        for (int i = cumle.length()-1; i >=0; --i) {
            System.out.print(cumle.charAt(i));
        }
    }
}
