package stringmanipulations;

import java.util.Scanner;

public class C05_Problems {
    static  Scanner scan =new Scanner(System.in);
    public static void main(String[] args) {
        /* TASK :
               Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
               ad ayrı soyad ayrı sekilde ekrana yazdırınız.

        String adSoyad="yusuf sefa";
        String ad=adSoyad.substring(0,adSoyad.indexOf(" "));
        String soyad=adSoyad.substring(adSoyad.indexOf(" ")+1);
        System.out.println(ad);
        System.out.println(soyad);

         TASK :
        Kullanıcıdan alacağınız, 3 kelimeden oluşan ismi
         Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.

        String adSoyad1 = "Agri Buyuksehir Belediyesi";
        String yeniAdsoy=adSoyad1.toUpperCase().substring(0,1)+(adSoyad1.split(" ")[1].toUpperCase().substring(0,1)+
                adSoyad1.split(" ")[2].toUpperCase().substring(0,1)).replaceAll("",".");
        System.out.println(yeniAdsoy);

       TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all


        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen birinci 3 harfli ismi giriniz");
        String isim1="abe";
        String s1=isim1.substring(0,1);
        String s2=isim1.substring(1,2);
        String s3=isim1.substring(2,3);


      boolean farklilik=s1.equals(s2)||s2.equals(s3)||s1.equals(s3);
      if (isim1.length()==3) {
          if (farklilik) {
              System.out.println("benzer harf vardir");
          } else System.out.println("harfler farklidir");
      }else System.out.println("kelime 3 harfli degildir");


        char s4 =isim1.charAt(0);
        char s5 =isim1.charAt(1);
        char s6 =isim1.charAt(2);

        String isimlers=isim1.length()==3?
                (s4==s5||s4==s6||s5==s6?"benzer harf vardir":"harfler farklidir")
                :"kelime 3 harfli degildir";
        System.out.println(isimlers);
*/



        /*  TASK :
				StringMethods:
				cift uzunlukta bir degiskenin ilk yarisini konsolda yazdirmak icin bir Java programi yaziniz.
	    	    ORNEK:
		     	INPUT      :  Python
				OUTPUT :   Pyt
	    */
        System.out.println("bir kelime giriniz");
        String kelime=scan.nextLine();

        if (kelime.length()%2==0){
            System.out.println(kelime.substring(0,kelime.length()/2));
        }else System.out.println("kelimenin uzunlugu cift degildir");

         /*
            TASK :
         * Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel forma dönüştürün
         * Kredi kartı numarasını kontrol edin, yoksa 16 haneden küçük olursa   "Geçersiz kredi kartı numarası" yazdırın.
         * input : John White 1234234534561478
           output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adın baş harfleri ve soyadı büyük olmalıdır)
         */

        System.out.println("lutfen ad giriniz");
        String ad=scan.nextLine();
        System.out.println("lutfen ad giriniz");
        String soyAd=scan.nextLine();
        System.out.println("kredi karti no giriniz");
        String kkNo=scan.nextLine();

        String yeniAd=ad.toUpperCase().substring(0,1)+ad.substring(1).replaceAll("\\w","*");
        String yeniSoyAd=soyAd.toUpperCase().substring(0,1)+soyAd.substring(1).replaceAll("\\w","*");
        System.out.println(yeniAd+" "+yeniSoyAd);
        String yeniKkNo=kkNo;
         if (yeniKkNo.length()==16){
             System.out.println(yeniKkNo.substring(0,yeniKkNo.length()-4).replaceAll("\\d","*")+(yeniKkNo.length()-6));
         }else System.out.println("lutfen 16 karakter giriniz");



    }
}
