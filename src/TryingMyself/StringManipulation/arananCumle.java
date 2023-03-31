package TryingMyself.StringManipulation;

public class arananCumle {
    /*
        Verilen bir cumlede, istenen bir String icin
        asagidaki cumlelerden uygun olani yazdirin

        1- aradiginiz kelime cumlede 1 kere kullanilmis
        2- aradiginiz kelime cumlede 2 kere kullanilmis
        3- aradiginiz kelime cumlede 2'den fazla kez kullanilmis
        4- aradiginiz kelime cumlede hic kullanilmamis
     */
    public static void main(String[] args) {

        String cumle = "Yasasin java, iyi ki java ogreniyorum";
        String kelime = "java";

        if (cumle.indexOf(kelime) == (-1)) {
            System.out.println("aradiginiz kelime cumlede hic kullanilmamis");
        } else {
            int kelimeIlk = cumle.indexOf(kelime);//
            if (cumle.indexOf(kelime, (kelimeIlk)) == (-1)) {
                System.out.println("aradiginiz kelime cumlede 1 kere kullanilmis");
            }
            else{
                int kelimeIkinci = cumle.indexOf(kelime,(kelimeIlk+1));
                if(cumle.indexOf(kelime,(kelimeIkinci+1))==(-1)){
                    System.out.println("aradiginiz kelime cumlede 2 kez kullanilmis");
                }
                else {
                    System.out.println("aradiginiz kelime cumlede 2'den fazla kez kullanilmis");
                }
            }

        }

    }

}