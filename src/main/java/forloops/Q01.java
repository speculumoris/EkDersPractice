package forloops;

import java.util.Scanner;

public class Q01 {
    static  Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        /*
        100'den 0'a kadar 13'e tam bölünebilen sayıları ekrana yazdırınız (büyükten küçüğe).
        Ekran Çıktısı asagidaki sekilde olsun; ayrica sonrasinda bu sayilarin toplamini da yazdirin
        istenen sonuc :
         91
         78
         65
         52
         39
         26
         13
        for (int i = 100; i >-1 ; i--) {
            if (i%13==0){
                System.out.println(i);
            }

        }


        // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.
        for (int i = 0; i < 256; i++) {
            char karakter=(char)i;
            System.out.println(karakter+"="+i);

        }
        int i=0;
        while (i<256){
            char chara= (char) i;
            System.out.println(i+"="+chara);
            i++;
        }


        // 1 x 1 = 1
        // 1 x 2 = 2
        // 1 x 3 = 3
        // 1 x 4 = 4
        // 1 x 5 = 5
        // 1 x 6 = 6
        // 1 x 7 = 7
        // 1 x 8 = 8
        // 1 x 9 = 9
        // 1 x 10 = 10
        // Yukarıdaki çarpım tablosunu 10 a kadar ekrana yazdırınız.
        int a=1;
        for (int i = 0; i < 11; i++) {
            System.out.println(a+"x"+i+"="+i*a);
        }

         */
        /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
     değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
     1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
     Sesli harfler: a,e,i,o,u

     Test Data:
     a
     Beklenen Çıktı:
     a harfi sesli harfdir.

     Test Data:
     d
     Beklenen Çıktı:
     d harfi sesiz harftir.

     Test Data:
     we  yada  %

     Beklenen Çıktı:
     Yanlis karakter girdiniz!


        Scanner scan = new Scanner(System.in);//********************
        System.out.print("kelime giriniz :");
        String kelime = scan.next();

        String sesliHarfler="aeoui";

        for (int i = 0; i <= sesliHarfler.length(); i++) {
            if (sesliHarfler.contains(kelime.substring(0,1))){
                System.out.println("sesli harf");
                break;
            }else System.out.println("sessiz harf");
            break;
        }

         */
/*        Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
	         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
	         hesaplayan kodu yazınız.

	        Örnek Ekran Çıktısı
	        Girilen sayı=4
	        Kareler toplamı=14

        System.out.println("lutfen 1 den buyuk bir sayi giriniz");
        int sayi=scan.nextInt();
        int sayilarinKaresininToplami=0;
        for (int i = 1; i <sayi ; i++) {
            if (sayi>0){
                sayilarinKaresininToplami=sayilarinKaresininToplami+(i*i);
            }
            System.out.println(sayilarinKaresininToplami);
        }

 */
        /*
	 	Get the number of rows and columns from user.
	 	Create a rectangle.
	 	rows = 3 and column = 5 ==> * * * * *
	 	                            * * * * *
	 	                            * * * * *

        for (int i = 1; i <4 ; i++) {
            for (int j = 1; j <6 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

         */
        /* Interview Question
		 Write a Java program to reverse a string. Use for loop and create a method called
		  reverseString */
        System.out.println("lutfen bir string giriniz");
        String str=scan.nextLine();
        System.out.println("string ifadenin tersi :"+reverseString(str));

    }

    private static String reverseString(String str) {
        String reversed="";
        for (int i = str.length()-1; i>=0 ; i--) {
            reversed+=str.charAt(i);

        }
        return reversed;
    }
}
