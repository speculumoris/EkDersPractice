package stringmanipulations;

import java.util.Scanner;

public class C01_Problem1 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // Soru 1) Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup olmadigini yazdirin

         char input ='z';
         System.out.println("bir cumle giriniz");
        String cumle =scan.nextLine();
        System.out.println("lutfen bir kelime giriniz");
        String kelime =scan.next();
        int varMi=cumle.lastIndexOf(input);
         System.out.println(varMi);

        int varMi1 =cumle.indexOf(input);
        System.out.println(varMi);

        //Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //- Girilen kelime cumlede kullanilmamis.
        //- Girilen kelime cumlede 1 kere kullanilmis.
        //- Girilen kelime cumlede 1’den fazla kullanilmis.
       int ilkKullanim=cumle.indexOf(kelime);
       int ikinciKullanim=cumle.indexOf(kelime,ilkKullanim+1);
       //if (ilkKullanim==-1){
       //    System.out.println("Girilen kelime cumlede kullanilmamis");
       //}else if (ikinciKullanim==-1){
       //    System.out.println("Girilen kelime cumlede 1 kere kullanilmis.");
       //}else {System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis.");


          int ilkKulanim1=cumle.lastIndexOf(kelime);
          int ikinciKullanim1=cumle.lastIndexOf(kelime,ilkKulanim1-1);
          if (ilkKulanim1==-1){
              System.out.println("Girilen kelime cumlede kullanilmamis");
          }else if (ikinciKullanim1==-1){
              System.out.println("Girilen kelime cumlede 1 kere kullanilmis.");
          }else {
              System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis.");
          }

//Soru 1) Kullanicidan email adresini girmesini isteyin,
// mail @gmail.com icermiyorsa “lutfen gmail adresi giriniz”,
// @gmail.com ile bitiyorsa “Email adresiniz kaydedildi “ ,
// @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
     // System.out.println("lutfen e-mail adresinizi giriniz");
     // String eMail=scan.nextLine();
     // String gMail="@gmail.com";
     // boolean icerirMi=eMail.contains("@gmail.com");

     // if (!icerirMi){
     //     System.out.println("lutfen gmail adresi giriniz");
     // }else if (eMail.lastIndexOf(gMail)==eMail.length()-10){
     //     System.out.println("Email adresiniz kaydedildi");
     // }else System.out.println("lutfen yazimi kontrol ediniz");


        //Soru 2) Kullanicidan bir cumle isteyin. Cumle “buyuk” kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
        // “kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
        // iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor” yazdirin.
        System.out.println("lutfen bir cumle giriniz");
        String cumle12=scan.nextLine();

        if (cumle.contains("buyuk")){
            System.out.println(cumle.toUpperCase());
        }else if (cumle.contains("kucuk")){
            System.out.println(cumle.toLowerCase());
        }else System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor");


    }
}
