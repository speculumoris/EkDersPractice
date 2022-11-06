package whiledowhileloops;

import java.util.Scanner;

public class Q05 {
    static Scanner scan = new Scanner(System.in);
    static int bolum = 0;

    public static void main(String[] args) {
 /* TASK :
        verilen bir sayinin Armstrong sayi olup olmadigini kontrol eden code create ediniz
        Armstrong sayi rakamlarinin kuplerinin toplamina esit olan sayidir
        153 = (1*1*1) + (5*5*5) + (3*3*3) gibi

        System.out.println("lutfen bir sayi giriniz");
        int sayi=scan.nextInt();
        int kuplerToplami=0;
        int ilkdeger=sayi;
        int rakam=0;
        while(sayi>0){
            rakam=sayi%10;
            kuplerToplami+=(rakam*rakam*rakam);
            sayi/=10;
        }
        if (ilkdeger==kuplerToplami){
            System.out.println("armstrong sayidir");
        }else System.out.println("armstrong degildir");

        // TASK : indexi tek sayi olan karakterleri yazdiran bir code create ediniz
        System.out.println("bir metin giriniz");
        String str =scan.nextLine();
        int index=0;
        while (index<str.length()){
            if (index%2==1){
                System.out.print(str.charAt(index)+" ");
            }

            index++;
        }
        System.out.println("*   *******"  );
        index=0;
        do {
            if (index%2==1){
                System.out.print(str.charAt(index)+" ");
            }
            index++;
        }while (index<str.length());

  */
        /*
          Kullanicidan 2 sayi alaliniz.
        1. sayi taban
        2. sayi Ust
        1 sayinin ussunu hesaplatan code create ediniz.
         3, 3  sonuc = 27

        2  3 = 2*2*2=8

        System.out.println("tabani giriniz");
        int taban = scan.nextInt();
        System.out.println("üssü giriniz");
        int uss = scan.nextInt();
        long sonuc = 1;
        int i = 0;
       //while (uss != 0) {
       //    sonuc = sonuc * taban;

       //    uss--;
       //}
       //System.out.println(sonuc);

        do {
            sonuc=sonuc*taban;
            uss--;
        }while (uss!=0);
        System.out.println(sonuc);

         *
        int num = 10;
        do {
            System.out.print(num-- + " " + num);
        } while (num == 0);
        /*
         * // What is the result?
         * A) 9876543210
         * B) 9
         * C) 421
         * D) 9 10
         * E) Nothing is printed
         * F) 10 9
         * ***

        // TASK : GİRİLEN SAYININ BASAMAKLARINDAKİ RAKAMLARIN TOPLAMINI BULUNUZ.
        System.out.println("bir sayi giriniz");
        int sayi=scan.nextInt();
        int rakamTop=0;
       // while (sayi>0){
       //     rakamTop=rakamTop+sayi%10;
       //     sayi/=10;
       // }
       // System.out.println(rakamTop);

        do {
            rakamTop+=sayi%10;
            sayi/=10;
        }while (sayi>0);
        System.out.println(rakamTop);

         */
    /*
    TASK :
		 kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
		 kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.



        System.out.println("lutfen bolunen degerini giriniz");//********************mantıkli
        int bolunen=scan.nextInt();
        System.out.println("lutfen bolen degerini giriniz");
        int bolen =scan.nextInt();

        System.out.print("sonuc :"+bol(bolen, bolunen));


    }

    private static int bol(int bolen, int bolunen) {
      while (bolunen>=bolen){
          bolunen-=bolen;
          bolum++;
      }
      return bolum;

     */
        /* TASK :
       Kullanıcıda x  girilene kadar ekrana "Program çalışıyor" yazan
        ve x girildiğinde ise "Program bitti" yazan programı yazınız.


        String str="";
        do {
            str=scan.nextLine();
            if (str.equalsIgnoreCase("x"))break;

            System.out.println("program calisiyor");

        }while (!str.equalsIgnoreCase("x"));
        System.out.println("program bitti");

        //TASK :  kullanicinin INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazınız.
        System.out.println("lutfen pin kodunu giriniz");
        int kPin= scan.nextInt();
        int sPin= 1453;

        while (kPin!=sPin){
            System.out.println("**** hatali giris yapildi ****");
            System.out.println("tekrar deneyiniz");
            kPin=scan.nextInt();
        }
        System.out.println("pin basarili");


        //TASK:Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.

        int enBuyuk = 0;
        int sayi;
        int a = 0;
        while (a < 5) {
            System.out.println("lutfen sayi giriniz");
            sayi = scan.nextInt();
            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }

            a++;
        }
        System.out.println("en buyuk sayi :" + enBuyuk);




        int buyuk = 0;
        int say;
        int i = 0;
        do {
            System.out.println("lutfen sayiyi giriniz");
            say = scan.nextInt();
            if (say > buyuk) {
                buyuk = say;
            }
            i++;
        } while (i < 5);
        System.out.println("en buyuk sayi :" + buyuk);

         */
         /*   TASK :
           Girilen pozitif bir sayının tam kare olup olmadığını bulunuz,
           tamkare ise true  değilse false yazdırınız.

            Not: sqrt gibi fonksiyonları  kullanmayın.

            Example 1:
            Input: 16
            Output: true
            Not: bu sayı tamkare çünkü 4*4 = 16

            Example 2:
            Input: 25
            Output: true
            Note: bu sayı tamkare çünkü 5*5=25


            Example 3:
            Input: 14
            Output: false


        System.out.println("lutfen bir sayi giriniz");//********************mantıkli onemli
        int sayi = scan.nextInt();
        boolean a = false;
        int count = 0;
        while (count * count <= sayi) {
            if (count * count == sayi) {
                System.out.println(true);
                a = true;
            }
            count++;
        }
        if (a == false) System.out.println("false");

            TASK :
        Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil

        System.out.println("lutfen sayi giriniz");
        int sayi=scan.nextInt();
        int i =0;
        while (i<=sayi){
            if (i%2==1)
            System.out.print(i+" ");
            if (sayi==i){
                break;
            }
            i++;
        }

          */
        /* TASK :
         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
         * musteri karti olup olmadigini sorun
         *
         * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
         * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az alirsa %10
         * indirim yapin

        System.out.println("lutfen kac adet satin aldiginizi giriniz");
        int adet=scan.nextInt();
        System.out.println("lutfen urunun liste fiyatini giriniz");
        int listeFiyati=scan.nextInt();
        System.out.println("musteri kartini var mi");
        boolean varMi=true;

         */
        /* TASK :
        Verilen bir sayının faktöriyelini özyineli (recursive) olarak
        hespalayan fonksiyonu yazınız.

        Örnek Ekran Çıktıları
        Bir sayi giriniz: 6*5*4*3*2*1=720
        Faktöriyeli: 720

        Bir sayı giriniz: 3*2*1
        Faktöriyeli 6

        System.out.println("bir sayi giriniz :");
        int sayi=scan.nextInt();
        int fakt=1;
        while (sayi>0){
            fakt=fakt*(sayi);
            System.out.println(sayi+" "+fakt);

            sayi--;
        }


        // TASK : STRING OLAN PIN kodunuzu kontrol eden ve 3 giris hakki veren bir kod yazınız.
        System.out.println("lutfen pin i giriniz");
        String str ;
        String pin="13579Sef";

        int i=3;
        while (true){

            str=scan.nextLine();
            if (str.equals(pin)){
                System.out.println("giris basarili");
                break;
            }else if(!str.equals(pin)){
                System.out.println("hatali giris yapildi");
                i--;
                System.out.println("kalan deneme hakki :" +i);
                if (i==0){
                    System.out.println("bloke oldu");
                    break;
                }
            }

        }

         */
        //Soru 6 ) Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam kac tane olduklarini ekranda yazdirin

        int a=45;
        int i=1;
        int count= 0;
        while (i<=a){
            if (a%i==0){
                System.out.print(i+" ");
                count++;
            }
            i++;
        }
        System.out.println();
        System.out.println(count);





    }
}
