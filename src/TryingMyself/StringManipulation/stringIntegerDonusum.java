package TryingMyself.StringManipulation;

public class stringIntegerDonusum {
    public static void main(String[] args) {
         // Soru 3 : Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        // input1 : "15.30 €" , input2 : "11.40 €"
       // output : 26.70 €

        String input1 = "15.30";
        String input2 = "11.40";

        System.out.println(input1 = input1.replaceAll("\\D", ""));
        System.out.println(input2 = input2.replaceAll("\\D", ""));

        double inp1 = Double.parseDouble(input1);
        double inp2 = Double.parseDouble(input2);
        System.out.println((double) (inp1+inp2)/100 +" €");
    }
}
