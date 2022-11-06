package ternary;

public class C01_Ternary {
    public static void main(String[] args) {
        //1) Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
        //Parola boşluk karakterinden farklı olarak en az 8 karakter içeriyorsa, "Geçerli Parola",
        //Parola boşluk karakterinden farklı olarak 8 karakterden daha az ise, "Geçersiz Parola"

        String parola = "1234 5asd";

        String pwd1 = parola.replaceAll("\\s", "").length() > 7 ? "gecerli parola" : "gecersiz parola";
        System.out.println(pwd1);

        //2) Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
        //a) Bir üçgenin iki kenarının uzunluğu eşitse "İkizkenar Üçgen".
        //b) Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".
        //c) a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen "
        int a = 5, b = 4, c = 3;
        String uzunlukBulma = (a == b && b != c || a == c && c != b || a == b && a != c) ? "ikizkenar" : a == b && a == c && b == c ? "eskenar ucgen" : "cesitkenar";
        System.out.println(uzunlukBulma);

        //3) Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
        //a) Son basamak 5 ‘e eşit ve 5 den büyükse, yuvarlama işlemi: “Son basamağı bir üst ondalı-
        //ğa yuvarla”
        //b) Son basamak 5 den küçükse, yuvarlama işlemi: “Son basamağı bir alt ondalığa yuvarla”
        //Örneğin; 127 yukarı yuvarlanacak ve değer 130 olacaktır.
        //125 yukarı yuvarlanacak ve değer 130 olacaktır.
        // 123 aşağı yuvarlanacak ve değer 120 olacaktır.

        int yus = 123;
        int yuvarlama = yus % 10 >= 5 ? ((yus / 10 + 1) * 10) : ((yus / 10 - 1) * 10);
        System.out.println(yuvarlama);

        //4) Nested Ternary kullanarak Apex kodunu yazınız.
        //Bir yılın artık yıl olup olmadığını kontrol eden bir program yazınız.
        //Yıl 100'e tam bölünüyorsa 400'e tam bölünmelidir. Bir yıl 100'e tam bölünemiyorsa 4'e tam bölünmelidir.
        int yilMi = 2001;
        String yillik = yilMi /100==0 ?( yilMi % 400 == 0?"artik yil":"artik yil degil" ):
                yilMi % 4 == 0?"artik yil":"artik yil degil";
        System.out.println(yillik);

        //Nested Ternary kullanarak;
        //Şifreyi kontrol etmek için kodu yazınız.
        //8'den fazla karakter içeriyorsa, baş harfi 'i' olmalıdır.
        //8 karakterden fazla içermiyorsa, baş harfi 'K' olmalıdır.
        String sifre="Ksdas";
       String sifremi= sifre.length()>7? (sifre.startsWith("i")?"sifre gecerli":"sifre gecersiz"):
               sifre.startsWith("K")?"sifre gecerli":"sifre gecersiz";
        System.out.println(sifremi);

        //Bir sayının mutlak değerini hesaplamak için kodu yazınız.
        // Pozitif sayılar ve sıfır mutlak değer için sayı ile aynıdır.
        //Negatif sayıların mutlak değerini bulmak için sayıyı -1 ile çarpınız.
        int sayi1=-1;

        int mutlaks=sayi1<0?-1*sayi1:sayi1;
        System.out.println(mutlaks);

        //Sayı 3 basamaklı ise konsolda kodunuz "Bu sayı 3 basamaklıdır" olacaktır. Aksi takdirde, kodunuz " Bu sayı 3 basamaklı değildir" olacaktır.
        int sayi2=234;
        String ucMu=sayi2>99 &&sayi2<1000?"bu sayi 3 basamaklidir":"bu sayi uc basamakli degildir";
        System.out.println(ucMu);



    }
}
