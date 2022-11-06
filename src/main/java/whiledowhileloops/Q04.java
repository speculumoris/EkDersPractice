package whiledowhileloops;

import java.util.Scanner;

public class Q04 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
/*
        //23) Asal sayı olup olmadığını kontrol etmek için kullanıcıdan bir tam sayı girmesini isteyiniz.
        // Örnek: kullanıcı 43 girerse çıktı “43 bir asal sayıdır”, kullanıcı 120 girerse “120 asal değildir” olur,
        // kullanıcı negatif tam sayılar girerse çıktı “Pozitif bir tam sayı giriniz” şeklinde kullanıcıyı yönlendiriniz.

        System.out.println("lutfen bir sayi giriniz");
        int a = scan.nextInt();
        int sayac=0;

        for (int i = 1; i <=a ; i++) {
            if (a%i==0){
                sayac++;
            }

        }
        if (sayac>2){
            System.out.println(a +" bir asal degildir");
        }else if(a<0){
            System.out.println("lutfen pozitif bir sayi giriniz");
        }else System.out.println(a +" bir asaldir");


        //24) Kullanıcıya kaç tane fibonacci sayısı görmek istediğini sorunuz.
        // Ardından bu fibonacci sayılarını yazdıran kodu yazınız.
        //Örnek: kullanıcı 6 girerse çıktı 1 1 2 3 5 8 olacaktır.
        System.out.println("kac tane fibonacci sayisi gormek istiyorsunuz");
        int sayi=scan.nextInt();
       int fib1=1;
       int fib2=1;
       int fibonacci=0;
        System.out.println(fib1 +" ");
        System.out.println(fib2 +" ");
        for (int i = 0; i < sayi-1; i++) {
            fibonacci=fib1+fib2;
            fib1=fib2;
            fib2=fibonacci;
            System.out.println(fibonacci +" ");

        }

 */
        //25) Bir sayı, her basamağının küpünün toplamına eşitse Armstrong sayısı olarak adlandırılır.
        // Örneğin, 153, her basamağın küpüne eşit olan 153= 1 + 125 + 27 olduğundan bir Armstrong sayısıdır.
        // Verilen numaranın Armstrong sayısı olup olmadığını kontrol etmek için bir kod yazınız.
        System.out.println("lutfen bir sayi giriniz");
        int sayi=scan.nextInt();
        int temp=sayi;
        int kupToplam=0;
        int basamak=0;
       while (sayi>0){
            basamak=sayi%10;
            kupToplam=kupToplam+(basamak*basamak*basamak);
            sayi=sayi/10;
            System.out.println(sayi +" sayi");
            System.out.println("kuptoplam"+kupToplam);

        }
       if (temp==kupToplam){
        System.out.println("sayi bir armstrong sayisidir");
    }else System.out.println("sayi armstrong sayi degildir");






    }
}
