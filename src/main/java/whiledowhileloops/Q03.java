package whiledowhileloops;

import java.util.Scanner;

public class Q03 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
       /*
        //19) Bir String’ deki boşluk ve noktalama işaretleri dışındaki toplam karakter sayısını bulunuz.
        String s = "Java is a strongly typed, object-oriented programming language.";
        s=s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);
        System.out.println(s.length());


        //20) Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        //******
        //*****
        //****
        //***
        //**
        //*
        int a=6;
        for (int i = a; i >0 ; i--) {
            for (int j = i; j >0 ; j--) {
                System.out.print("*");

            }
            System.out.println();
        }
        System.out.println("*********a");
        int i=a;
        while (i>0){
            for (int j = i; j >0 ; j--) {
                System.out.print("*");

            }
            System.out.println();
            i--;

        }
        System.out.println("*********args");
        i=a;
        do {
            for (int k=i; k >0 ; k--){
                System.out.print("*");
            }
            System.out.println();
            i--;
        }while (i>0);


        //21) Bir tamsayının benzersiz(tekrarsız) basamaklarının toplamını bulmak için kodu yazınız.
        // Örnek:12133455  ́ 2+4=6

        // String tmSayiStr=String.valueOf(tamSayi);
        // int  a= 0;
        // for (int i = 0; i < tmSayiStr.length(); i++) {
        //     String c=tmSayiStr.substring(i,i+1);
        //     if (tmSayiStr.indexOf(c)== tmSayiStr.lastIndexOf(c)){
        //         a=a+Integer.valueOf(c);
        //     }
//
        // }
        // System.out.println(a);
        int tamSayi = 12133455;
        String str = String.valueOf(tamSayi);
        int a = 0;
        int i = 0;
        while (i < str.length()) {
            String str1 = str.substring(i, i + 1);
            if (str.indexOf(str1) == str.lastIndexOf(str1)) {

                a = a + Integer.valueOf(str1);
            }
            i++;
        }
        System.out.println(a);
        i=0;
        int ba=0;
        do {
            String c=str.substring(i, i + 1);
            if (str.indexOf(c)== str.lastIndexOf(c)){
                ba=ba+Integer.valueOf(c);
            }
            i++;
        }while (i< str.length());
        System.out.println(ba);




        //22) 5 hariç 3'ten 9'a kadar olan tam sayıları yazdırmak için kod yazınız.
        for (int i = 3; i <10 ; i++) {
            if (i==5){
                continue;
            }else System.out.print(i+" ");




        //         *
        //        * *
        //       *   *
        //      *     *
        //     * * * * *

        Scanner scan =new Scanner(System.in);
        System.out.println("sutun kontrol");
        int sayi=5;
        System.out.println("satir kontrol");

        for (int i= 1; i  0 ; i--){//satir kontrolu
            for (int j = sayi-i; j < 6 ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < 6 ; j++) {
                if (i==1||i==sayi){
                System.out.print("* ");
                }else if (j==1||j==sayi){
                    System.out.print("*");
                }
                if (){

                }

            }
            System.out.println();


        int b=scan.nextInt();

        for (int i=b; i >0 ; i--){
            for (int j = b-i; j < 6 ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < 6 ; j++) {
                if (j==1||j==i){
                    System.out.print("* ");
                } else if (i==b){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        System.out.println( "ssayi giriniz");
        int a=scan.nextInt();

        for (int i=1; i <=a ; i++){
            for (int k = a; k >=i ; k--) {
                System.out.print(" ");
            }
            for (int m = 1; m<=i ; m++) {

                if (m==1||m==i){
                    System.out.print("* ");
                }else if (i==a){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }


        //Soru 4) Kullanicidan toplamak uzere pozitif sayilar isteyin,
        //islemi bitirmek icin 0'a basmasini soyleyin
        //Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin ve
        //"Negatif sayi giremezsiniz" yazdirip basa donun
        //Kullanici 0'a bastiginda toplam kac pozitif sayi girdigini,
        //yanlislikla kac negative sayi girdigini ve
        //girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin

        int sayi;
        int count=0;
        int toplam = 0;

       do {
           System.out.println("lutfen bir sayi giriniz\n islemi bitirmek icin 0 a basiniz");
           sayi=scan.nextInt();
           if (sayi>0){
               toplam+=sayi;
           }
           else if (sayi==0){
               System.out.println("isleminiz sonlanmistir");
               break;

           }else if (sayi<0){
               System.out.println("negatif sayi giremezsiniz");
               count++;
               continue;
           }

       }while (true);
        System.out.println("girdiginiz pozitif sayilarin toplami :"+toplam);
        System.out.println("girdiginiz negatif sayilarin sayisi :"+count);




        //Soru 4) Kullanicidan toplamak uzere pozitif sayilar isteyin,
        //islemi bitirmek icin 0'a basmasini soyleyin
        //Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin ve
        //"Negatif sayi giremezsiniz" yazdirip basa donun
        //Kullanici 0'a bastiginda toplam kac pozitif sayi girdigini,
        //yanlislikla kac negative sayi girdigini ve
        //girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin

        int sayi1;
        int toplam1=0;
        int sayma=0;
        int sayaç=0;

        do {
            System.out.println("lutfen bir sayi giriniz \n islemi bitirmek icin 0 basiniz");
            sayi1=scan.nextInt();
            if (sayi1>0){
                toplam1=toplam1+sayi1;
                sayaç++;
            }
            else if (sayi1==0){
                System.out.println("isleminiz bitmistir");
                break;
            }else if(sayi1<0){
                sayma++;
                continue;
            }

        }while (true);
        System.out.println("girilen pozitif sayilarin toplamlari :"+toplam1);
        System.out.println("pozitif sayilarin sayaci :"+sayaç+" negatif sayilarin sayaci :"+sayma);

        */
       // output: Monyth:09 Day:20 Year:2022

       //Scanner scan = new Scanner(System.in);

       //System.out.println("bir sayi giriniz...");
       //String date="09/20/2022";

       //System.out.println(date);
       //System.out.print("Month:"+date.split("/")[0]+" ");
       //System.out.print("Day:"+date.split("/")[1]+" ");
       //System.out.print("Year:"+[2]);

        System.out.println("bir sayi giriniz...");
        String date="09/20/2022";

        String month = date.split("/")[0]+" ";
        String day = date.split("/")[1]+" ";
        String year = date.split("/")[2];

        System.out.print(month + " " + day + " " + year);






























    }
}
