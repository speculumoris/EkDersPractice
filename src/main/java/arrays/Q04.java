package arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        /*
        //1) Tamsayılardan oluşan bir arrayde ortadaki elemanı bulunuz. Örnek: (12, 5, 8) ==> (5, 8, 12) ==> Çıktı =8
        //(12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Çıktı =(8+12)/2 = 10
        int arr[] = {12, 6, 3, 8};
        Arrays.sort(arr);


            if (arr.length%2 != 0) {
                int ortadakiIndex = arr.length / 2;
                System.out.println(arr[ortadakiIndex]);
            } else {
                int ciftIndexi = arr.length / 2;
                int ind = (arr[ciftIndexi] + arr[ciftIndexi - 1]) / 2;
                System.out.println(ind);
            }


        //2) String’ lerden oluşan bir arrayde uzunluğu en küçük olan elemanları bulunuz.
        // Örnek: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli
        String str="Kemal,Jonathan,Mark,Angie,Veli";
        String str1[]=str.split(",");
        int minLength=str1[0].length();
        for (String w:str1){
            minLength=Math.min(minLength,w.length());
        }
        System.out.println(minLength);
        for (String w:str1) {
            if (w.length()==minLength){
                System.out.print(w + " ");
            }
        }
        System.out.println();

        Arrays.sort(str1, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(str1));


        //3) Tamsayılardan oluşan bir arrayde en küçük pozitif elemanı ve en büyük negatif elemanı bulunuz.
        //Örnek:(-12, 18, -5, 23, -2) ==> En küçük pozitif 18, en büyük negatif -2
        int arr[] = {-12, 180, -5, 0, 230, -2};
        Arrays.sort(arr);
        int enkucukPozitif = arr[arr.length - 1];
        int enbuyukNegatif = arr[0];
        for (int w : arr) {
            if (w > 0) {
                enkucukPozitif = Math.min(enkucukPozitif, w);
            } if (w<0){
                enbuyukNegatif = Math.max(enbuyukNegatif, w);
            }
        }
        System.out.println("en buyuk negatif sayi :" + enbuyukNegatif);
        System.out.println("en kucuk pozitif sayi :" + enkucukPozitif);


         //String’ lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini alınız.
           //     Örnek: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Çıktı JMJ

        String str[]={ "Kemal", "Jonathan", "Mark", "Angie", "Veli" };
        for (String w :str) {
            if (w.endsWith("k")|| w.endsWith("n")){
                System.out.print(w.toUpperCase().substring(0,1));
            }
        }
        System.out.println();
        //5) String’ lerden oluşan bir arrayde kullanılan öğelerin toplam karakter sayısını bulunuz.
        // Örnek: { "Kemal", "Jonathan", "Mark", "Angie", "Veli" } ==> Çıktı 26
        int count=0;
        for (String w:str) {

                count+=w.length();

        }
        System.out.println(count);


        //6) Verilen bir String'de 'a' veya 'A' ile başlayan kelimeyi sayısını bulunuz.
        String str="Apex is an object ariented arogramming anguage";
        String str1[] =str.split(" ");
        int count=0;
        for (String w:str1) {
            if (w.startsWith("a")||w.startsWith("A")){
                count++;
            }
        }
        System.out.println("a veya A ile baslyan kelime sayisi :"+count);

        //7) Verilen bir String'deki sesli harf sayısını bulunuz
        String str="Apex is an object ariented arogramming anguage";
        String str1[] =str.toLowerCase().split("");
        int count=0;
        for (String w:str1) {
            switch (w){
                case "a":
                case "e":
                case "u":
                case "o":
                case "i":
                    count++;

            }
        }
        System.out.println(count);


        //8) İlk ve son karakterleri aynı olan array öğelerini bulmak için kod yazınız.
        String[] arr = {"alabama", "pick", "sos", "sets", "pex"};
        //index istedigimiz icin for each kullanmadik
        for (int w= 0; w< arr.length; w++) {
            String ilkHarf=arr[w].substring(0,1);
            String sonHarf=arr[w].substring(arr[w].length()-1);
            if (ilkHarf.equals(sonHarf)){
                System.out.println(arr[w]);
            }
        }


        //9) Verilen bir String arraydeki belirli bir öğenin var olup olmadığını bulmak için kod yazınız.
        String[] arr = new String[]{"Apex", "is", "an", "object", "oriented", "programming", "language"};
        String art="is";
        int count=0;
        for (String w:arr) {
            if (w.equalsIgnoreCase(art)){
                count++;
            }

        }if (count>0){
            System.out.println(art+": Array'de vardir");
        }else System.out.println(art+": Array'de yoktur");


        //10) Verilen bir String arraydeki öğelerin karakterlerinin toplamını bulmak için kod yazınız.
        String[] arr = new String[]{"Apex", "is", "an", "object", "oriented", "programming", "language"};
    int toplam = 0;
        for (String w:arr ) {
                toplam+=w.length();
        }
        System.out.println(toplam);


        //11) Tamsayılardan oluşan arrayde bulunan sıfırları, array sonuna yerleştiren kod yazınız.
        // Örnek: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0)
        int arr[] = {5, 0, 2, 0, 3};
        int yeni[] = new int[arr.length];
        int idx = 0;
        for (int w : arr) {
            if (w != 0) {
                yeni[idx]=w;
                idx++;
            }
        }
        System.out.println(Arrays.toString(yeni));

         */
        //12) Kullanıcıdan aldığınız tamsayılar ile bir array oluşturunuz
        // ve bu arraydeki en küçük ve en büyük öğeler arasındaki farkı konsolda yazdırınız.

        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen kac tane tam sayi gireceginizi belirtiniz\n cikmak icin Q harfina basiniz ");
        int girilecekS=scan.nextInt();

        int i=0;
        int tamSayi =0;
        int arr[]=new int[girilecekS];
        do {
            System.out.println("lutfen tamsayilari giriniz");
            tamSayi = scan.nextInt();
            arr[i]=tamSayi;
            i++;
            if (tamSayi=='Q'||tamSayi=='q'){
                break;
            }

        }while(i<girilecekS);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);

        int enKucukFark =arr[0];
        int enBuyukFark=arr[0];
        for (int w:arr) {
            enKucukFark=Math.min(enKucukFark, w);
            enBuyukFark=Math.max(enBuyukFark,w);
        }
        int arrayFarki=enBuyukFark-enKucukFark;
        System.out.println("en buyuk ve en kucuk elemanin farki :"+arrayFarki);




    }
}
