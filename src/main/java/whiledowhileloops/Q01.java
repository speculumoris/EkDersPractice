package whiledowhileloops;

import java.util.Scanner;

public class Q01 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        // girilen sayının basamaklarındaki rakamların toplamını bulunuz.


        int sayi=scan.nextInt();
        System.out.println(basamakRakamlariBul(sayi));

        System.out.println(doWhileBasamaksTop(sayi));


    }

    private static int doWhileBasamaksTop(int sayi) {
        int toplam=0;
        do {

            toplam=toplam+sayi%10;
            sayi/=10;
            System.out.println("kalan sayi :"+sayi+"\ntoplam :"+toplam);
        }while (sayi>0);

        System.out.println("do while loop ile toplam :"+toplam);
       return toplam;
    }

    private static int basamakRakamlariBul(int sayi) {

        int toplam=0;
        while (sayi!=0){
            toplam=toplam+sayi%10;
            sayi/=10;
        }
        return toplam;
    }
}
