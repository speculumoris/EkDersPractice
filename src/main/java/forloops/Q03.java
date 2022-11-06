package forloops;

import java.util.Scanner;

public class Q03 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        /*
     TASK :
    Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
         hesaplayan kodu yazınız.

         Örnek Ekran Çıktısı
        Girilen sayı=4
        Kareler toplamı=30

        int sayi1=4;
        int sayiToplami=0;
        if (sayi1>1){
            for (int i = 1; i <=sayi1 ; i++) {
                sayiToplami+=i*i;
                System.out.println(sayiToplami);
            }

        }
         */
        /* TASK :
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.

        System.out.println("bir cumle girin");
        String cumle = scan.nextLine().toLowerCase();
        System.out.println("bir harf girin");
        char harf = scan.next().toLowerCase().charAt(0);
        int count = 0;
        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i)==harf) {
                count++;
            }

        }  System.out.println(count);

         */
        /*  TASK :
        Girilen bir sayı kadar satır ve sütünu olan ve
        sağ kenara dayalı üçgeni basan kodu yazınız.

        Ekran Çıktısı
        Bir sayi giriniz: 5
            *
           **
          ***
         ****
        *****


        System.out.println("lutfen birsayi griniz");//*********************
        int sayi=scan.nextInt();
        for (int satir = 1; satir <=sayi ; satir++) {
            for (int bosluk = sayi-satir; bosluk >=0 ; bosluk--) {//bosluk kontrolu burada biz sayidan oldugumuz sayi kadar cıkardıgımızda bosluk sayisini buluyoruz
                System.out.print(" ");
            }
            for (int j = 1; j <=satir ; j++){
                System.out.print("*");
            }
            System.out.println();

        }

         */
        /*
        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F
        şeklini yazdırınız.  65=A'nın ascıı değeri

        int harf = 65;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char)(harf+j)+" ");

            }
            System.out.println();
        }

        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        şekli yazdırınız


        int harf=65;
        for (int i = 0; i <6 ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print((char)(harf+i)+" " );

            }
            System.out.println();
        }


        //        1 2 3 4 5 6
        //         2 3 4 5 6
        //          3 4 5 6
        //           4 5 6
        //            5 6
        //             6

        for (int satir = 1; satir <= 6; satir++) {

            for (int bosluk = 1; bosluk < satir; bosluk++) {

                System.out.print(" ");
            }
            for (int sutun = satir; sutun <= 6; sutun++) {

                System.out.print(sutun + " ");
            }
            System.out.println();
        }


        //        1
        //        2 3
        //        4 5 6
        //        7 8 9 10
        //        11 12 13 14 15
        //        16 17 18 19 20 21
        //        22 23 24 25 26 27 28
        //        29 30 31 32 33 34 35 36

        int a=1;
        for (int i=1; i<9;i++){
            for (int j = 1; j <=i; j++) {
                System.out.print(a++ +" ");
            }
            System.out.println();
        }

         */
         /*
     Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız.
            Sonuç böyle olmalıdır;

                   *
                  * *
                 * * *
                * * * *
               * * * * *


        for (int i = 5; i > 0; i--) {
            for (int k =5-i ; k <6 ; k++) {
                System.out.print(" ");
            }
            for (int j =i ; j < 6; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
          */
        /*
         * SORU 1 Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak
         * Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin. Input : 30 40
         * Beklenen Cikti: 30 ve 40 icin EBOB = 10 30 ve 40 icin EKOK = 120
         */
        System.out.println("lutfen 1. tam sayiyi giriniz");
        int sayi1= scan.nextInt();
        System.out.println("lutfen . tam sayiyi giriniz");
        int sayi2= scan.nextInt();



























    }
}
