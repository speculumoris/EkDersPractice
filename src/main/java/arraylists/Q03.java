package arraylists;

import javax.naming.PartialResultException;
import java.util.*;

public class Q03 {
    public static void main(String[] args) {
        /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.

        List<Integer> toplami=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int toplam=0;
        for (Integer w:toplami) {
            int karelers=w*w;
            toplam+=karelers;
            System.out.println(toplam);
        }
        //*************************************************

         /*

*** BMI - Vucut Kitle Indeksi ***
kilo/(boy*boy)  --- boy metre cinsinden hesaplamaya dahil edilecek


*** Bazal Metabolizma Hizi Hesaplama ***

Kadin = (10*kilo) + (6.25*boy)-(5*yas)-161
Erkek = (10*kilo) + (6.25)-(5*yas)+5
    Note : boy cantimetre cinsinden hesaplamaya dahil edilecek


*** Hareket / Aktuvute seviyeleri ***
1 - Masa basi is / cak az - Hareketsiz  = 1.2
2 - Az Aktif / haftada 1-2 egzersiz     = 1.3
3 - Orta Aktif / haftada 3-5 egzersiz   = 1.55
4 - Cok aktif / haftada 6-7agir egzersiz= 1.7
5 - Cok agir egzesiz agir is            = 1.9

*** Alinmasi gerekli kalori miktari hesaplama ---

*** Zayif ve normaller icin ***
BMI < 25 ise = Bazal Metabolizma Hizi * Hareket Seviyesi

**** Zayiflamak icin ****
BMI > 25 ise
A = Bazal Metabolizma Hizi * Haretet Seviyesi - 500
B = Bazal Metabolizma Hizi * Haretet Seviyesi - 750

Kisi gunluk olarak "Bazal metabolizma" hizindan dusuk kalori alamaz
Yani A ve B  Bazal Meytabolizma Hizindan kucuk ise = gunluk Bazal Meytabolizma Hizi kadar kalori almali
Yani A ve B  Bazal Meytabolizma Hizindan buyuk ise = gunluk A ve B degerleri arasinda kalori almali
B kBazal Meytabolizma Hizindan kucuk ise = gunluk Bazal Meytabolizma Hizi ile A degeri arasinda kalori almali

Kullanicidan alinacak input datalar
1-Cinsiye   2-Yas   3-Boy   4  -kilo    5-Hareket seviyesi

 */




        /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen notlari giriniz,\n cikmak icin Q harfine basiniz");
        int toplam=0;
        String a="";
        List<String>notlar=new ArrayList<>();
        while (!a.equalsIgnoreCase("q")){
            System.out.print("sayilari giriniz :");
            a= scan.next();
            notlar.add(a);
        }

        notlar.remove(notlar.size()-1);//Q harfini listten silmek icin
        System.out.println(notlar);
        for (String w:notlar) {
            toplam+=Integer.parseInt(w);
        }
        int ortalama=toplam/notlar.size();
        int count=0;
        for (String w:notlar) {
            if (ortalama>=Integer.parseInt(w)){
                count++;
            }

        }
        System.out.println("ortalamayi gecen ogrenci sayisi :"+count);

         */
         /* TASK :
        Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir metodda atayarak
         yazdırınız.


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen Array'in elemanlarini giriniz");
        int arr[]=new int[6];
        int i=0;
        do {
            int ekleme= scan.nextInt();
            arr[i]=ekleme;
            i++;

        }while (i<6);
        System.out.println(Arrays.toString(arr));
        System.out.println(tekElemanlar(arr));


    }

    private static List tekElemanlar(int[] arr) {
        List<Integer> list=new ArrayList<>();
        for (int w:arr) {
            if (w%2==1){
                list.add(w);
            }
        }
       return list;


          */ /* TASK :
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir code create ediniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]


        int arr[]={1,2,2,3,1,4,2,5,6,8,7,5,9,1};
        List<Integer> newArr=new ArrayList<>();
        for (int w:arr) {
            if (!newArr.contains(w)){
                newArr.add(w);
            }

        }
        System.out.println(newArr);
        Collections.sort(newArr);
        int tekrarsizArr[]=new int[newArr.size()];
        int idx=0;
        for (int i:newArr) {
            tekrarsizArr[idx]=i;
            idx++;
        }
        System.out.println(Arrays.toString(tekrarsizArr));

        /* TASK :
		ayna check sorusu:
		 input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
		 output : verilen array simetriktir
		 */
        //Write a Java program to get a String from user as input and find the maximum occurring character in that string. (Ignore case sensitivity)
        //input :
        //Learning java is easy
        //output:
        //maximum occurring character is : a
        String a="Learning java is easy";
        String b[]=a.replace(" ","").split("");
        List<String> ch=new ArrayList<>();
        for (String w:b) {
            ch.add(w);
        }
        Collections.sort(ch);
        int count=0;
        int maxKrts=0;
        int sayac=0;
        for (int i=1;i<ch.size();i++) {
            count=0;
            if (ch.get(i-1).equalsIgnoreCase(ch.get(i))){
                count++;
                maxKrts=Math.max(count,maxKrts);
            }else {
                count=0;
            }
        }
        for (int i = 1; i <ch.size() ; i++) {
            if (ch.get(i-1).equalsIgnoreCase(ch.get(i))){
                sayac++;
                if (sayac==maxKrts){
                    System.out.println(ch.get(i-1));
                }
            }
        }



/*
        String r="java is a easy";
        String ak="a";
        int say=0;
        for (int j = 0; j < r.length(); j++) {
            if (ak.equalsIgnoreCase(String.valueOf(r.charAt(j)))) {
                say++;
            }else {
                continue;
            }
        }
        System.out.println(say);

 */




    }
}

