package arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
       /*
        //Example 1:String bir Array olusturunuz ve "Tom ve tomdan onceki" tum elemanlari ekrana yazdiriniz
        String arr[] = {"aramço", "katil", "katana", "tom", "fırkam"};
        for (String w : arr) {
            System.out.println(w + " ");
            if (w == "tom") {
                break;
            }
        }
        //Example 2:String bir Array olusturunuz ve "Tom ve Jane" haric tum elemanlari ekrana yazdiriniz
        String brr[] = {"aramço", "katil", "katana", "tom", "fırkam"};
        for (String w : brr) {
            if (w.equals("tom") || w.equals("katil")) {
                continue;
            }
            System.out.print(w + " ");
        }
        System.out.println();
        //example 3: Kullanici ile beraber bir Array olsuturunuz ve icine data ekleyiniz
        //          Bir ogretmenin sinifindaki ogrencilerin isimlerini application a yuklemesini saglayan kodu yazinin
        Scanner scan = new Scanner(System.in);
        System.out.println("kac ogrenci ismi gireceksiniz");
        int numOfStd = scan.nextInt();

        String names[] = new String[numOfStd];
        System.out.println("cikmak icin Q tusuna basiniz");


        for (int i = 1; i <= numOfStd; i++) {
            System.out.println("lutfen " + i + ". ogrencinin 1. ismini giriniz");
            String stdName = scan.next();


            if (stdName.equalsIgnoreCase("Q")){
                break;
            }
            names[i - 1] = stdName;
        }
        System.out.println(Arrays.toString(names));


        // Example 1: [0, 2, 3, 0, 12, 0] put the zeros to the end
        //            [2, 3, 12, 0,  0,  0]
        int arr[]={0, 2, 3, 0, 12, 0};
        int yeni[] =new int[arr.length] ;

        int idxCounter=0;

        for (int i=0 ; i< arr.length;i++) {

            if (arr[i]!=0){
                yeni[idxCounter]=arr[i];
                idxCounter++;
            }

        }
        System.out.println(Arrays.toString(yeni));


        //Example 2: Bir Array'in icinde herhangi bir elamanin olup olmadigini ve kac kere tekrarlandigini
        // kontrol eden ve gösteren kodu yaziniz
        int element[]={1,1,2,3,4,3,2,1};
        int sayi=3 ;

        int counter=0;

        for (int w:element) {
            if (sayi==w){
                counter++;
            }

        }
        if (counter>0){
            System.out.println( sayi + " sayisi bu Array'de " + counter +" tane  vardir");
        }else System.out.println(sayi+" sayisi bu Array'de yoktur");

        */
        //Example 3: Size verilen cumledeki en uzun verilen kelimeyi bulunuz;
        //          "Java kolaydir calisana, ne kolay ki calismayana" ==>calismayana
        String sentence="Java kolaydir calisanaaaaaaaaa, ne kolay ki calismayana";
        sentence=sentence.replaceAll("\\p{Punct}","");
        String arr[] = sentence.split(" ");
        Arrays.sort(arr, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length-1]);










    }
}
