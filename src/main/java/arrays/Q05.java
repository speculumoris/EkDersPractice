package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q05 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        /* TASK :
	 kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
	 ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
	 java code create ediniz.


        System.out.println("kac eleman gireceginizi belirtiniz");
        int elemanSayisi= scan.nextInt();
        int eleman=0;
        int arr[]=new int[elemanSayisi];
        int i=0;
        do {
            System.out.println("lutfen Array elemanlarini giriniz");
            eleman= scan.nextInt();
            arr[i] = eleman;
            i++;

        }while (i<elemanSayisi);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        int fark=arr[arr.length-1]-arr[0];
        System.out.println("En buyuk ve en kucuk eleman arasindaki fark :"+fark);

         */
         /* TASK :
        multidimensional arrayin iç array lerindeki tüm elemanların toplamını birer birer bulan
        ve herbir sonucu yeni bir arrayin elemanı yapan ve yeni array i ekrana yazdıran programı yaziniz.
        input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}


        int arr[][]={{10,20,30},{4},{6,7,20}};
        int arr1[]=new int[arr.length];
        int toplam=0;
        int idx=0;
        for (int[] w:arr) {
            toplam=0;

            for (int a:w) {
                toplam+=a;
            }
            arr1[idx]=toplam;
            idx++;
            System.out.println(Arrays.toString(arr1));
        }

          */
        /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method yaziniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6


        int arr[]={1,2,-3,4,-5,-6};
        int newArr[]=new int[arr.length];
        int idx = 0;
        for (int w:arr) {
            if (w>0){
                w=-w;
                newArr[idx]=w;
                idx++;
            }else if (w<0){
                w=-w;
                newArr[idx]=w;
                idx++;
            }

        } System.out.println(Arrays.toString(newArr));

         */
        /*  TASK :
         *  verilen bir int  Arrayde toplamlari istenen degere esit olan sayi ciftlerini
         * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1};
         * int istenenToplam=9;

        int[] arr= {5,7,-6,4,2,15,3,8,1};
        int istenenToplam=9;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i; j <arr.length ; j++) {
                if (arr[i]+arr[j]==istenenToplam){
                    System.out.println((arr[i]+"+"+arr[j]+"="+istenenToplam));
                }
            }
        }

         */
        /*  TASK :
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4

        int input[]= {1,2,3,4,5,6,7};
        int avarage=0;
        for (int w:input) {
            avarage+=w;
        }
        avarage/=input.length;
        int count=0;
        for (int w:input) {
            if (avarage<=w){
                count++;
                System.out.println(w+" ");
            }

        }
        System.out.println("sayi miktari :" + count);

         */
        /*TASK :
	write a java program to find the second largest number in the array?//*********************
	Maximum and minimum number in the array?
	(Dizideki en büyük ikinci sayyiyi, maksimum ve minimum sayiyi
	bulmak için bir java programi yazin)

	int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };


        int[] arr = {100, 10001, -90, 845, 8787, 898, 1, -90};
        Arrays.sort(arr);

        int enbuyuk = arr[0];
        int enkucuk = arr[0];
        int ikinciBuyuk = arr[1];
        ikinciBuyuk = Math.min(enbuyuk, arr[arr.length - 2]);
        for (int w : arr) {
            enbuyuk = Math.max(enbuyuk, w);
            enkucuk = Math.min(enkucuk, w);
        }
        System.out.println(enbuyuk);
        System.out.println(enkucuk);
        ikinciBuyuk = Math.min(enbuyuk, arr[arr.length - 2]);
        System.out.println(ikinciBuyuk);
        int max = 0;
        int min = 0;
        int ikincimax = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] > ikincimax && arr[i] < max) {
                ikincimax = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(ikincimax);

         */
        /* TASK :
         * write a method that accepts a 2 dimensional array and finds the max value
         * (2 boyutlu bir diziyi kabul eden ve maksimum degeri bulan bir method yazin )
         * Input : {{1,2,-3},{41,55},{-61,-17,80}}
         * Output : 80

        int arr[][]={{1,2,-3},{41,55},{-61,-17,80}};
        System.out.println(maxDeger(arr));


    }

    private static int maxDeger(int[][] arr) {
        int maxDeger =0;
        for (int[] w: arr) {
            for (int a:w) {
                maxDeger= Math.max(maxDeger, a);
            }

        }
        return maxDeger;

         *//*
		 TASK :
		 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran java code create ediniz.

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        String arr[]=str.split(" ");
        System.out.println("dolar iceren sayilarin toplami :"+dolarIceren(arr));
        System.out.println("sterlin iceren eurolarin toplami :"+poundIceren(arr));


    }

    private static int poundIceren(String[] arr) {
        int toplam=0;
        for (String w:arr) {
            if (w.contains("£")){
                w= w.replace("£", "");
                toplam+=Integer.valueOf(w);
            }

        }return toplam;
    }

    private static int dolarIceren(String[] arr) {
        int toplam=0;
        for (String w:arr) {
            if (w.contains("$")){
               w= w.replace("$", "");
               toplam+=Integer.valueOf(w);
            }

        }return toplam;

        /* TASK :
        given an int array and find the squares of the elements
        (Verilen bir int dizisi icin elemanlarin karelerini bulun )
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}


        int arr[] = {2, 6, 4, 5, 8, 9};
        int a=0;
        for (int w:arr) {
            arr[a]=w*w;
            a++;
        }            System.out.println("sayinin karesi :"+Arrays.toString(arr));

        /*
         TASK:
         you have a string "GayetBasarılı"
         with arrays change it to "CoookBasarılı" and write changing array
         (String iniz: "GayetBasarılı"  Diziyi "CoookBasarılı" ye cevirin )


        String str = "GayetBasarili";
       str= str.replace("Gayet", "Coook");

        String str1[]=str.split("");
        System.out.println(Arrays.toString(str1));

        /* TASK :
        arr1 = { {1,2}, {3,4,5}, {6} }  ve  arr2 = { {7,8,9}, {10,11}, {12} }  veriliyor.
        Bu iki array'in tum elemanlarinin toplamini bulan programi yaziniz.

        int arr1[][] = {{1, 2}, {3, 4, 5}, {6}};
        int arr2[][] = {{7, 8, 9}, {10, 11}, {13}};
        int toplam = 0;
        for (int[] w : arr1) {
            for (int a : w) {
                toplam += a;
            }
        }
        for (int[] w : arr2) {
            for (int a : w) {
                toplam += a;
            }
        }

        System.out.println(toplam);

        //Aşağıdaki multi dimensional array’in iç array’lerindeki tum elemanların
        //toplamını birer birer bulan ve herbir sonucu yeni bir array’in elemanı yapan
        // ve yeni array’i ekrana yazdıran bir program yazınız
        // Ornegin; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6  4+5=9  6+7=13 ==> output: {6, 9, 13}
        int arr[][] = {{1, 2, 3}, {4, 5}, {6, 7}};
        int idx[]=new int[arr.length];
        int toplam1=0;
        int ab=0;
        for (int[] w:arr) {
            toplam=0;
            for (int a:w) {
                toplam += a;
            }
            idx[ab]=toplam;
            ab++;
        }
        System.out.println(Arrays.toString(idx));
        /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini yazdıran java code create ediniz (negatif sayilar da dahil olsun)


        int arr[]={1,3,5,8,9,12,15,18};
        int count=0;
        for (int w:arr) {
            if (w%3== 0){
                count++;
                System.out.print(w+" ");
            }

        }
        System.out.println("sayi adedi :"+ count);

        //Soru 5) Kullanicidan 100’den kucuk bir tamsayi isteyin.
        // 1’den baslayarak girilen sayiya kadar 3’un veya 5”in kati olan sayilari yazdirin.
        System.out.println("lutfen 100'den kucuk bir sayi giriniz");
        int sayi = scan.nextInt();

        for (int i = 1; i <= sayi; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        //Soru 4) Kullanicidan 100’den kucuk bir tamsayi isteyin.
        // 1’den baslayarak girilen sayiya kadar 3’un kati olan sayilari yazdirin.

        // Kullanıcıdan 100den küçük bir tamsayı isteyin. 1 den başlayarak girilen sayiya kadar 3ün katı olanları yazdırın


        // Kullanıcıdan 100den küçük bir tamsayı isteyin. 1 den başlayarak girilen sayiya kadar 3ün katı olanları yazdırın

        System.out.println();
        for (int i = 1; i <= sayi; i++) {

            if (sayi>100) {
                System.out.println(" 100den kucuk bir tam sayı gir. program kapanıyor.");
                break;

            }else if(i%3==0){

                System.out.print(i + " ");
            }
        }
        //Soru 6)
        // Interview Question Kullanicidan 100’den kucuk bir tamsayi isteyin.
        // 1’den baslayarak girilen sayiya kadar tum sayilari yazdirin. Ancak;
        //- Sayi 3’un kati ise sayi yerine “Java” yazdirin.
        //- Sayi 5’in kati ise sayi yerine “Guzeldir” yazdirin.
        //- Sayi hem 3’un hem 5’in kati ise sayi yerine “Java Guzeldir” yazdirin.


        //Soru 10 ) Kullanicidan iki sayi isteyin.
        // Girilen sayilar ve aralarindaki tum tamsayilari toplayip, sonucu yazdiran bir program yaziniz

        //Soru 11 ) Interview Question Kullanicidan 10’dan kucuk bir tamsayi isteyin
        // ve girilen sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)

        System.out.println("10 dan kucuk bir tamsayi giriniz");
        int fakt=scan.nextInt();
        int carpim=1;




        for (int i = fakt; i >0 ; i--) {
            carpim*=i;
            System.out.print(i+"*");
        }
        System.out.println("="+carpim);
        */

/*

        for (int i = 0; i <6 ; i++) {;//satir kontrolü

            for (int j =0; j <i ; j++) {//bosluk kontrolu
                System.out.print(" ");

            }

            for (int k = i; k < 6 ; k++) {//sutun kontrolu
                System.out.print("*"+" ");
            }

            System.out.println();
        }
        //toplamlari verilen bir sayiya esit olan Array elemnet ciftlerini yazdiran bir method olusturunuz:
        int arr[]={4,6,5,-10,8,5,20};
        int instenen=10;

        for (int i=0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]+arr[j]==instenen){
                    System.out.println(arr[i]+"+"+arr[j]+"="+instenen);

                }

            }

        }





        String arr1[]={ "java","python","c#"};

        String newArr[]=new String[arr1.length];

        String n="";
        int idx=0;
        for (String w:arr1) {
            n="";
            for (int i = w.length()-1; i >-1  ; i--) {
                n+=w.charAt(i);
            }
            newArr[idx]=n;
            idx++;
        }
        System.out.println(Arrays.toString(newArr));

 */

        //3. Given the following arrays:
        //        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        //        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        //        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};
        //
        //
        //        1. find out the first index number of "Gloves"
        //
        //        2. find out if "iPad" is contained in the item list
        //
        //        3. Print the report of each shopping item
        //            name - price - #ID

        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
               double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
                int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};
        int index=0;
        for (int i=0;i< items.length;i++) {
            String itemsNAme=items[i];
            double priceses=prices[i];
            int itemIDss=itemIDs[i];

            if (items[i].equals("Gloves")){
                index=i;

                }

        }
        System.out.println(index);

        index=0;
        for (String iP : items) {

            if (iP.equals("iPad")){
                System.out.println("vardir :"+index);
                break;
            }
            index++;
        }

        //4. given the following arrays:
        //		     	String [] names = {"Anna", "Nancy", "Sarah"};
        //		        int [] scores = {90, 75, 80};
        //		        char [] grades = new char[names.length];
        //
        //         1. write a program that can store the grades of the students in the array named grades
        //         2. print the grade report of each students in separate lines
        //         		Ex:
        //         			Anna's score is 90, and grade is A

                    String [] names = {"Anna", "Nancy", "Sarah"};
        	        int [] scores = {90, 75, 80};
        		    char [] grades = new char[names.length];



    }

}

