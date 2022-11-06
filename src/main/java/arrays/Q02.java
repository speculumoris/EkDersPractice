package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q02 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        /*

        //Example 1: Szie verilen pozitif ve negatif sayilar iceren bir integer Arraydeki
        // "en buyuk negatif" ve "en kucuk pozitif" elemani bulunuz.(Math.min math classına mutlaka gideceksin)

        int arr[] = {-2, 5, 6, -1, 0, -4};
        Arrays.sort(arr);

        int maxNegative = arr[0];
        int minPositive = arr[arr.length - 1];

        for (int w : arr) {

            if (w<0){
                maxNegative=Math.max(maxNegative,w);
            }
            if (w>0){
                minPositive=Math.min(minPositive,w);
            }

        }
        System.out.println("en buyuk negative sayi :"+maxNegative);
        System.out.println("en kucuk positive sayi :"+minPositive);


        //Example 1:Bir Stringteki sesli harflerin sayisini bulan kodu yaziniz
        //          a-e-i-o-u-A-E-I-O-U
        String str="Java ogrenince para kazanmak kolay, ogrenmeyince ne kolay ki.";
        str=str.toLowerCase();
        String str1[] =str.split("");
        int counter=0;
        for (String w:str1) {
            switch (w){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    counter++;
                    break;
            }

        }


        //Bir String multidimensional Array'de icinde "a" olan elemanlari konsola yazdiriniz
        String brr[][] = { {"learn", "java", "it"}, {"is", "easy"} };

        for (String[] w:brr){
            for (String k:w) {

                if (k.contains("a")){
                    System.out.print(k+" ");
                }

            }
        }

         */
       /*
        given an int array and find the squares of the elements
        (Verilen bir int dizisi icin elemanlarin karelerini bulun )
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}

        int arr[] = {2, 6, 4, 5, 8, 9};

        int idx = 0;

        for (int i = 0; arr.length > i; i++) {

            arr[idx] = (arr[i] * arr[i]);
            idx++;
        }
        System.out.println(Arrays.toString(arr));

        */
        /*
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * lari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4

        int input[] = {1, 2, 3, 4, 5, 6, 7};
        int toplam = 0;

        for (int w : input) {
            toplam=w+toplam;
        }
        double avarage=toplam/input.length;
        System.out.println("ortalama :"+avarage);
        System.out.print("ortalamadan buyuk elemanlar :");
        for (int w : input){
            if (w>avarage){
                System.out.print(w + " ");
            }
        }

         *//*  you have a string "HeySiri"
         * with arrays change it to "ByeSiri" and write changing array
         *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )


        String a="HeySiri";
        a=a.replaceAll("Hey","Bye");
        String arr[]=a.split("");
        System.out.println(Arrays.toString(arr));

        System.out.println("2.yoolllllll");
        String b="HeySiri";
        String c[]=b.split("y");
        c[0]="Bye";
        b=c[0]+c[1];

        System.out.println(b);

        String str1[]=new String[1];
        str1[0]=b;
        System.out.println(Arrays.toString(str1));
         /*
         * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini //
         * yazdiran bir method yaziniz
         int[] arr= {5,7,-6,4,2,15,3,8,1};
         int istenenToplam=9;


        int[] arr= {5,7,-6,4,2,15,3,8,1};
        int istenenToplam=9;

        Arrays.sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]+arr[j]==istenenToplam){
                    System.out.println(arr[i]+" ve "+arr[j]+" istenen toplam :"+istenenToplam);
            }
        }



        }
        /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)

        System.out.print("lutfen 8 tane sayi giriniz :");
        int sayi;
        int i = 0;


        int arr[] = new int[8];
        do {
            sayi = scan.nextInt();
            arr[i] = sayi;
            i++;
        } while (i < 8);
        System.out.println(Arrays.toString(arr));
        int count = 0;

        for (int w : arr) {
            if (w % 3 == 0) {
                count++;
            }
        }
        System.out.println("3 ile bolunebilen sayi miktari :" + count);
         /*
        * arr1 = { {0,2,-1}, {3,8,9}, {7} }  ve  arr2 = { {-7,6,-9}, {0,12}, {19} }  veriliyor.
        * Bu iki array'in tum elemanlarinin toplamini bulan programi yaziniz.


        int arr1[][] = { {0,2,-1}, {3,8,9}, {7} };
        int arr2[][] = { {-7,6,-9}, {0,12}, {19} };
        int toplam = 0;
        for (int[] w :arr1) {
            for (int a:w){
                toplam+=a;

            }

        }
        System.out.println(toplam);

        int toplam1=0;
        for (int[] w :arr2) {
            for (int a : w) {
                toplam1 += a;

            }
        }
            System.out.println(toplam1);
        System.out.println("Array'lerin toplami :" + (toplam+toplam1));

         * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
         *  2D arrayinden min number print et


        int k[][]={{1,2,3}, {2,3,1} , {5,-5,5} , {2,1,-8}};

        int enbuyuk=k[0][0];
        for (int[] w :k) {
            for (int a:w) {
                if (enbuyuk>a){
                    enbuyuk=Math.min(enbuyuk,a);
                }
            }

        }
        System.out.println("min :"+enbuyuk);

         *  String 2D array olustur
         *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
         *  String de $ varsa 3.2 ile carp
         *  String de € varsa 4.2 ile carp
         *  elemanlarin toplamini double olarak yazdir

        String arr[][]={{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};
        double toplam=0;

        for (String[] w :arr) {
            for (String a:w) {
                if (a.contains("$")){
                    toplam+=Integer.valueOf(a.replace("$",""))*(3.2);
                } else if (a.contains("€")) {
                    toplam+=Integer.valueOf(a.replaceAll("€",""))*(4.2);


                }
            }
        }
        System.out.println(toplam);

         * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
         * yaziniz
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         *
         * OUTPUT : Arraydeki cift sayilarin toplami : 30

         */
        /*
        int arr[][] ={{1,3,6},{2,8},{5,7,9,14}};
        System.out.println("Arraydeki cift sayilarin toplami :"+arrayinToplami(arr));


    }

    private static int arrayinToplami(int[][] arr) {
        int toplam = 0;

        for (int[] w:arr) {
            for (int a:w) {
                if (a%2==0){
                    toplam+=a;
                }

            }

        }
        return toplam;

         */
        /*
         *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.

        String cumle="Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
        cumle=cumle.replace(" ", "");

        String arr1[]=cumle.split("");
        System.out.println(arr1.length);

         [[3, 7, 11, 21], [8, 15, 34, 1], [5, 45, 86, 69]]

            Yukaridaki gibi bir MultiDimensional Array olusturunuz

            Arayin cift sayilarini toplayin ve konsola yazdirin..
            Arayin tek sayilarini carpin ve konsola yazdirin..

            carpim sonucunu / toplam sonuca bolun ve sonucu konsala yazdirin...


        int arr[][]= { {3, 7, 11, 2},{8, 15, 34, 1},{5, 45, 86, 69}};
        int ciftToplam=0;
        int tekcarpim=1;

        for (int[] w:arr) {
            for (int a:w) {
                if (a%2==0){
                    ciftToplam+=a;
                }else {
                    tekcarpim*=a;
                }
            }
        }
        System.out.println(" tek sayilarin carpim sonucu :"+tekcarpim);
        System.out.println(" cift sayilarin toplam sonucu :"+ciftToplam);
        int bolme=tekcarpim/ciftToplam;

        System.out.println("tek sayilarin carpiminin tek sayilarin toplamina bolumu : "+bolme);


        //String str[][] = {{"okula", "Ali", "beraber"},{"Veli", "gittiler"},{"bu", "ile"},{".", "gun"} };
        //Ali ile Veli bu gun okula beraber gittiler.
        //anlamli cumle olacak sekilde yeni bir Array olusturunuz.
        String str[][] = {{"okula", "Ali", "beraber"},{"Veli", "gittiler"},{"bu", "ile"},{".", "gun"} };
        str[0][0]="Ali";
        str[0][1]="ile";
        str[0][2]="Veli";

        str[1][0]="bu";
        str[1][1]="gun";

        str[2][0]="okula";
        str[2][1]="beraber";

        str[3][0]="gittiler";
        str[3][1]=".";
        System.out.println(Arrays.deepToString(str));

         */
        ///*
        //		 Asagidki multi dimensional array'in ic array'lerde ki tum elemanlarin toplamini birer birer bulun
        //		 ve her bir sonucu yeni bir arrayín elemani yapan ve yeni array'i ekrana yazdiran program yapin.
        //
        //		 ornek ; { {5,2,13}, {41,25}, {63,17} }  ==> 5+2+13=20   41+25=66   63+17=80    ===>    {20, 66, 80}
        //		 */

        int arr[][] = {{5, 2, 13}, {41, 25}, {63, 17}};
        int toplam1 = 0, toplam2 = 0, toplam3 = 0;

       // for (int i = 0; i < arr[0].length; i++) {
       //     toplam1 += arr[0][i];
       // }
       // for (int i = 0; i < arr[1].length; i++) {
       //     toplam2 += arr[1][i];
       // }
//
       // for (int i = 0; i < arr[2].length; i++) {
       //     toplam3 += arr[2][i];
       // }


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0) {
                    toplam1 += arr[i][j];
                } else if (i == 1) {
                    toplam2 += arr[i][j];
                }
                if (i == 2) {
                    toplam3 += arr[i][j];
                }

            }
        }

        int art[] = {toplam1, toplam2, toplam3};
        System.out.println(Arrays.toString(art));
    }
}
