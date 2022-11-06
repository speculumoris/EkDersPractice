package stringmanipulations;

import java.util.Locale;
import java.util.Scanner;

public class C06_Problems {


    public static void main(String[] args) {
        //7) Tam isim için dilbilgisi kurallarını kontrol etmek için kodu yazınız.
        //a) Kodunuz "ali Can", "Ali can", "ali can" için "Baş harflerinde hata" yazmalıdır.
        //b) Kodunuz, aşağıdaki gibi tek kelimeler için "Ad veya soyadı eksik" yazmalıdır.
        //c) "Ali" veya "Can" veya "ali"Kodunuz "ALI CAN" gibi tüm formatlar için "Format hatası" yazmalıdır.
        //d) Kodunuz bir veya daha fazla boşluk (" " veya " " gibi karakterler) için " Isim girilmedi" yazmalıdır.
        //e) Ad, harfler ve boşluktan başka herhangi bir karakteri içeriyorsa, kodunuz "Geçersiz Ad" yazmalıdır.
        //Not : Kısaltmada 1'den fazla hata varsa, ilgili tüm hata mesajları çıktı olarak konsolda görünmelidir.
        // Örneğin; "ali3" için kodunuz "Baş harflerinde hata", "Ad veya soyadı eksik" ve "Geçersiz Ad"

        String isimSoy = "TehlikeL";
        String adinIlkHarfı = isimSoy.substring(0, 1);
        String soyAdinIlkHarfı = isimSoy.substring((isimSoy.indexOf(" ") + 1), isimSoy.indexOf(" ") + 2);
        int bosluk = isimSoy.trim().indexOf(' ');
        boolean isminIlkHarfBuyukMu = (adinIlkHarfı.charAt(0) >= 'A' && adinIlkHarfı.charAt(0) <= 'Z');
        boolean soyIsminIlkHarfBuyukMu = (soyAdinIlkHarfı.charAt(0) >= 'A' && soyAdinIlkHarfı.charAt(0) <= 'Z');

        if (!isminIlkHarfBuyukMu || !soyIsminIlkHarfBuyukMu) {
            System.out.println("bas harflerde hata");
        }
        if (isimSoy.indexOf(" ") == -1) {
            System.out.println("Ad veya soyad eksik");
        }
        if (isimSoy.equals(isimSoy.toUpperCase())) {
            System.out.println("format hatasi");
        }
        if (isimSoy.replaceAll("\\s", "").length() == 0) {
            System.out.println("isim girilmedi");
        }
        if (isimSoy.replaceAll("\\s", "").replaceAll("[a-zA-Z]", "").length() > 0) {
            System.out.println("Gecersiz isim");
        }


        //Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
        //a) Şifre boşluk karakterinden farklı en az 8 karakter içeriyorsa "Geçerli Şifre"
        //b) Herhangi bir pozisyonda şifrede boşluk karakteri varsa "Şifrede boşluk karakteri kullanmayınız"
        //c) a ve b koşullarının sağlanmaması durumunda "Geçersiz Şifre"
        String sifre = "avbcdgder45";
        if (sifre.replaceAll(" ", "").length() > 7) {
            System.out.println("gecerli sifre");
        } else if (sifre.contains(" ")) {
            System.out.println("lutfen bosluk karakteri girmeyiniz");
        } else System.out.println("gecersiz sifre");

        //8) ABD'deki eyalet kısaltmalarının biçimini kontrol etmek için kod yazınız.
        //a) Kısaltma 2'den fazla karakter içeriyor ise kodunuz, "Eyalet kısaltmaları 2 karakterden faz-
        //la olamaz" yazmalıdır.
        //b) Kısaltmada küçük harfler var ise kodunuz, "Eyalet kısaltmaları küçük harf içeremez" yaz- malıdır.
        //c) Kısaltmanın harflerinden farklı karakterler var ise kodunuz, "Eyalet kısaltmaları aşağıda- kilerden farklı karakterler içeremez" yazmalıdır.
        String kısaltma = "Ma";
        if (kısaltma.length() > 2) {
            System.out.println("eyalet kisaltmalari 2 karakterden fazla olamaz");
        }
        if (kısaltma.replaceAll("[^a-z]", "").length() != 0) {
            System.out.println("Eyalet kısaltmaları küçük harf içeremez");
        }
        if (kısaltma.replaceAll("[^a-zA-Z]", "").length() != 0) {
            System.out.println("Eyalet kısaltmaları aşağıdakilerden farklı karakterler içeremez");
        }

        String abc = "abcABC345*";
        System.out.println(abc.replaceAll("[^a-zA-Z]", ""));
        System.out.println(abc.replaceAll("[^a-zA-Z]", "").length() != 0);

        String eyaletKisaltma = "F";
        if (eyaletKisaltma.length() > 2) {
            System.out.println("Eyalet kisaltmalari 2 karakterden fazla olamaz ");
        }
        if (eyaletKisaltma.replaceAll("[^a-z]", "").length() != 0) {
            System.out.println("Eyalet kisaltmalari kucuk harf iceremez ");
        }
        if (eyaletKisaltma.replaceAll("[^A-Za-z]", "").length() != 0) {
            System.out.println("Eyalet kisaltmalari asagidakilerden farkli karakterler iceremez ");
        }
    }
}
