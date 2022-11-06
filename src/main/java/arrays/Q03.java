package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
       /*
        //		 Asagidki multi dimensional array'in ic array'lerde ki tum elemanlarin toplamini birer birer bulun
        //		 ve her bir sonucu yeni bir arrayín elemani yapan ve yeni array'i ekrana yazdiran program yapin.
        //
        //		 ornek ; { {5,2,13}, {41,25}, {63,17} }  ==> 5+2+13=20   41+25=66   63+17=80    ===>    {20, 66, 80}
        //

        int arr[][] = {{5, 2, 13}, {41, 25}, {63, 17}};
        int toplam1 = 0, toplam2 = 0, toplam3 = 0;

       //for (int i = 0; i < arr[0].length; i++) {
       //    toplam1+= arr[0][i];
       //}
       //for (int i = 0; i < arr[1].length; i++) {
       //    toplam2+= arr[1][i];
       //}
       //for (int i = 0; i < arr[2].length; i++) {
       //    toplam3+= arr[2][i];
       //}



        for (int i = 0; i <arr.length ; i++) {
            for (int k=0;k<arr[i].length; k++) {
                if (i==0){
                    toplam1+= arr[i][k];
                } else if (i==1) {
                    toplam2+= arr[i][k];
                }else if (i == 2) {
                    toplam3+= arr[i][k];
                }
            }
        }
        int arr1[]={toplam1,toplam2,toplam3};
        System.out.println(Arrays.toString(arr1));

        */
       /* [[3, 7, 11, 21], [8, 15, 34, 1], [5, 45, 86, 69]]

        Yukaridaki gibi bir MultiDimensional Array olusturunuz

        Arayin cift sayilarini toplayin ve konsola yazdirin..
        Arayin tek sayilarini carpin ve konsola yazdirin..

        carpim sonucunu / toplam sonuca bolun ve sonucu konsala yazdirin...


        int arr[][]={{3, 7, -10, 21}, {-8, 15, 34, 1}, {5, 45, 86, 69}};

        int ciftToplami=0;
        int tekCarpim=1;

        for (int[] w:arr) {
            for (int a:w) {

                if (a%2==0){
                    ciftToplami+=a;
                }else {
                    tekCarpim*=a;
                }
            }
        }
        System.out.println("tek sayilarin carpim sonucu :"+tekCarpim);
        System.out.println("cift sayilarin toplam sonucu :"+ciftToplami);

        int bolum=tekCarpim/ciftToplami;
        System.out.println(bolum);

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


        //Soru 1: Verilen 3 elemanli bir array’in tum elemanlarini bir soldaki konuma tasiyacak bir program yazin.
        // Ornek; array [1,2, 3] ise output [2, 3, 1] olacak.

        int arr[] = {1, 2, 3};
        int newi[]= new int[arr.length];

            newi[arr.length-1]=arr[0];
        for (int i=0;i< arr.length-1 ; i++) {
            newi[i]=arr[i+1];

        }

        System.out.println(Arrays.toString(newi));

         int toplam= 0;
        for (int w:arr) {
            toplam=toplam+w;

        }
        System.out.println(toplam);

        //Soru 1 ) Asagidaki multi dimensional array’in tum elemanlarinin carpimini ekrana yazdiran bir method yaziniz.
        // { {1,2,3}, {4,5,6} }
        int arr1[][]= { {1,2,3}, {4,5,6} };
        int carpim=1;
        for (int[] w:arr1) {
            for (int a:w) {
                carpim*=a;
            }
        }
        System.out.println(carpim);

        //Soru 2) Asagidaki multi dimensional array’in ic array’lerindeki
        // son elemanlarin carpimini ekrana yazdiran bir program yaziniz
        //


        int carpim = 1;
       int arr[][] = {{1, 2, 3}, {4, 5}, {6}};
       int count=1;

        for (int [] w:arr) {
          count*=w[w.length-1];
            System.out.println(count);
        }



        //Soru 4) Asagidaki multi dimensional array’in ic array’lerindeki tum elemanlarin toplamini
        //birer birer bulan ve herbir sonucu yeni bir array’in elemani yapan
        // ve yeni array’i ekrana yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6,7} }
        //Ornek; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==> output: {6, 9, 13}

        int arr[][] = {{1, 2, 3}, {4, 5}, {6, 7}};
        int idx = 0;

        int aNew[] = new int[arr.length];
        for (int[] w : arr) {
            int toplam = 0;
            for (int a:w) {
                toplam += a;
            }
            aNew[idx]+=toplam;
            idx++;
            System.out.println(Arrays.toString(aNew));
        }




        //Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin
        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String cumle= scan.nextLine();

        String newa[] =cumle.split(" ");
        int ab= newa.length;
        System.out.println(ab);


        System.out.println(Arrays.toString(newa));

        */


        //Soru 3) Asagidaki multi dimensional array’lerin ic array’lerinde ayni index’e sahip elemanlarin toplamini
        // ekrana yazdiran bir program yaziniz.
        // (Zor soru) arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }

        int arr1[][] = {{1, 2}, {3, 4, 7}, {6}};
        int arr2[][] = {{7, 8, 10}, {10, 12}, {12}};
/*
        int toplam = 0;
        int outerKisa=Math.min(arr1.length, arr2.length);
        int innerKisa;
        for (int i = 0; i < outerKisa; i++) {
            innerKisa=Math.min(arr1[i].length,arr2[i].length);
            for (int j = 0; j <innerKisa ; j++) {
                toplam=arr1[i][j]+arr2[i][j];
                System.out.print(toplam+" ");
            }

        }

 */

        int tosun=0;
        int dislarinFarki=Math.min(arr1.length, arr2.length);
        int iclerinFarki;
        for (int i = 0; i < dislarinFarki; i++) {
            iclerinFarki=Math.min(arr1[i].length,arr2[i].length);
            for (int j = 0; j < iclerinFarki; j++) {

                tosun=arr1[i][j]+arr2[i][j];
                System.out.print(tosun+" ");
            }
        }
























/*


        int toplam45 = 0;
        for (int[] w : arr1) {
            for (int a : w) {
                toplam++;
            }
        }
        System.out.println(toplam);

        int yeniArr1[] = new int[toplam];
        int idx = 0;
        for (int[] w : arr1) {
            for (int a : w) {
                yeniArr1[idx] = a;
                idx++;
            }
        }
        System.out.println(Arrays.toString(yeniArr1));

        int toplam1 = 0;
        for (int[] w : arr2) {
            for (int a : w) {
                toplam1++;
            }
        }
        System.out.println(toplam1);

        int yeniArr2[] = new int[toplam1];
        int itx = 0;
        for (int[] w : arr2) {
            for (int a : w) {
                yeniArr2[itx] = a;
                itx++;
            }

        }
        System.out.println(Arrays.toString(yeniArr2));
        int toplamArr[]=new int[yeniArr1.length];
        int toplam23 = 0;
        for (int i = 0; i < yeniArr1.length; i++) {


                toplamArr[i]= yeniArr1[i] + yeniArr2[i];


        }
        System.out.print(Arrays.toString(toplamArr));

 */


    }
}
