package stringmanipulations;

public class C07_Preoblems {
    public static void main(String[] args) {
        // Soru 1) Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup olmadigini yazdirin

        String cumle="pasalar nasillar";
        String kelime ="agalar";

        int cumle1=cumle.indexOf(kelime);
        int cumle2=cumle.indexOf(kelime,(cumle1+1));

        if (cumle1==-1){
            System.out.println("hic kullanilmamis");
        }else if (cumle2==-1){
            System.out.println("bir kere kullanilmistir");
        }else System.out.println("birden fazla kullanilmistir");

    }
}
