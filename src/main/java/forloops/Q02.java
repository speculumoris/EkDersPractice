package forloops;

import java.util.Scanner;

public class Q02 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
         /*
       sayacı ritmik ilerleyen ve adım sayısı belli ise FOR kullanılır.
       DEĞİLSE While kullanılır, Eğer döngüye bir kez mutlaka girilecekse DO_WHILE kullanılır.

       TASK :
        100'den 0'a kadar 13'e tam bölünebilen sayıları ve toplamlarını ekrana yazdırınız (büyükten küçüğe).

         Ekran Çıktısı
        91
        78
        65
        52
        39
        26
        13
        int a=0;
        for (int i = 100; i >-1 ; i--) {

            if (i%13==0){
                a=a+i;
            }

        }System.out.println(a);


        // 0-255 e kadar olan harflerin , sayı ve harf değerini konsola yazdırınız.
        for (int i = 0; i < 256; i++) {
            char karakter= (char) i;
            System.out.println(i+"="+karakter);
        }

          */
         /* TASK :
        Girilen bir stringdeki a harfi sayısını bulunuz.
        ama  c harfine  gelirse döngüden çıkılsın

        Bugün hava oldukca güzel.-> 2
         str.CharAt(0)


        String str="bugun hava oldukca guzel";
        int aMiktar=0;
        for (int i = 0; i < str.length() ; i++) {
            if (str.toLowerCase().charAt(i)=='a'){
                aMiktar++;
            }else if (str.toLowerCase().charAt(i)=='c'){
                break;
            }

        }
        System.out.println("girdiginiz metindeki c karakterine kadar olan a karakter sayisi : "+aMiktar);
        /*
        TASK :
        Kullanıcıdan 5 adet sayı isteyiniz
        Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.

        int toplam=0;
        for (int i = 1; i <6 ; i++) {
            System.out.println("lutfen 5 tane sayi giriniz");
            int sayi=scan.nextInt();

            if (sayi>5&&sayi<10){
                continue;
            }else {
                toplam+=sayi;

            }
            System.out.println(toplam);
        }

          */
        /* TASK :
        Aşağıdaki şekilde çıktı veren programı print içerisinde
        sadece bir tane # kullanarak yazıdırınız

           #####
           #####
           #####
           #####
           #####


        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <6 ; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

         */
        /*  TASK :
       2 boyutlu bir tablo olarak, ekrana çarpım tablosunu hesaplayıp yazan kodu yazınız.

       Örnek Ekran çıktısı
       1  2  3  4  5
       2  4  6  8 10
       3  6  9 12 15
       4  8 12 16 20
       5 10 15 20 25

       Ekran çıktısı 5 x 5 boyutları için örnek olarak verilmiştir,
       isterseniz boyutları klavyeden okuyup istenen boyutlara göre
       ekrana basan bir kod yazabilirsiniz.


        System.out.println("lutfen bir sayi giriniz");
        int sayi=scan.nextInt();
        int carpım=0;
        for (int i = 1; i <=sayi ; i++) {//satir kontrolü
            for (int j = 1; j <=sayi; j++) {//sutun kontrolu
                System.out.print(i*j+" ");
            }
            System.out.println();
        }

         */
     /*  TASK :
            Matrisin boyutunu kullanıcıdan okuyup.
            Sadece diyagonu (köşegeni) 1 olan ve
            diğer elemanları 0 olan bir kare matrisi ekrana bastırın.

           Ekran Çıktısı
            Bir sayı giriniz: 7
            1000000
            0100000
            0010000
            0001000
            0000100
            0000010
            0000001

            Bir sayi giriniz: 5
            10000
            01000
            00100
            00010
            00001

        System.out.println("bir sayi giriniz");
        int sayi1=scan.nextInt();

        for (int i = 1; i <=sayi1 ; i++) {//satir kontrolu
            for (int j =1 ; j <=sayi1 ; j++) {//sutun kontrolu
               if (i==j){
                   System.out.print("1");
               }else System.out.print("0");

            }
            System.out.println();
        }
      */
         /* TASK :
        Kullanicidan bir String isteyin. Kullanicinin girdigi
        String’in palindrome olup olmadigini kontrol eden bir program yazin.



        System.out.println("lutfen bir kelime giriniz");
        String kelime =scan.nextLine();
        String tersKelime="";

        for (int i=kelime.length()-1; i>=0;i--) {
            tersKelime += kelime.charAt(i);
        }
        if (tersKelime.equals(kelime)) {
            System.out.println("kelime veya cumle palindrome dur");
        }else {
            System.out.println("kelime veya cumle palindrome degildir");
        }

          */
        /*
    Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
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
    we  yada %

    Beklenen Çıktı:
    Yanlis karakter girdiniz!



        System.out.println("lutfen bir harf giriniz");
        String harfYazma=scan.next();
        String harfler = "aeoui";
        String sessizHarfler = "bcdfghjklmnprstvyzxwq";

        for (int i = 0; i <harfler.length() ; i++) {
            if (harfler.contains(harfYazma)){
                System.out.println("harfler seslidir");
                break;

            }else if (sessizHarfler.contains(harfYazma)){
                System.out.println("harfler sessiz harftir");
                break;
            }else System.out.println("yanlis karakter girdiniz");
            break;

        }

         */
        /*
        Bir sayinin mükemmel olup olmadiğini bulan bir program yaziniz.
        Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı, kendisine eşitse o sayi mükemmeldir.
        ORNEK:
        INPUT     : 6
        OUTPUT : 1,2,3
                      1+2+3 = 6 = 6 (Mükemmel)

                      mukemmel sayi kontrolu
                      1. kullanicidan sayi alalim
                      2. bir toplam degiskeni olusturuyoruz
                      3. sayinin bolenleri bul
                      4. bolenleri toplamla topla
                      5. sayiyla toplamin esitligini kontrol et

        */
        System.out.println("lutfen bir sayi giriniz");
        int sayi3=scan.nextInt();

        System.out.println(sayilarToplamiKontrol(sayi3));
        boolean dogruMu;
        dogruMu=sayilarToplamiKontrol(sayi3);
        System.out.println(dogruMu);
       
        
            }

    private static boolean sayilarToplamiKontrol(int sayi3) {
        int sayiToplami=0;
        boolean dogruMu= false;
        for (int i=1;i < sayi3 ; i++){
            if (sayi3%i==0){
                sayiToplami+=i;
            }
            if (sayi3==sayiToplami){
                dogruMu=true;
            }

        }
        return dogruMu;
    }

}
























    

        