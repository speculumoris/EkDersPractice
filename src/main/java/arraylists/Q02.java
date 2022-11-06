package arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q02 {
    public static void main(String[] args) {
        //7) Bir tamsayı listesinde en yakın 2 tamsayıyı bulunuz.
        // Örnek: (12, 31, 15, 13, 54) ==> Çıktı 12 ve 13'tür

        List<Integer> newList=new ArrayList<>();
        newList.add(12);
        newList.add(31);
        newList.add(15);
        newList.add(13);
        newList.add(54);

        Collections.sort(newList);
        int diff=newList.get(2)-newList.get(1);

        for (int i = 1; i < newList.size() ; i++ ) {
            diff=Math.min(diff,newList.get(i)-newList.get(i-1));
        }
        for (int i = 1; i <newList.size() ; i++) {
            if (newList.get(i)-newList.get(i-1)==diff){
                System.out.println(newList.get(i)+" ve "+ newList.get(i-1));
            }

        }
        //8) Listedeki 7 ve 10 dışındaki her öğenin değerini 2'şer artırınız.
        // Örnek: (12, 31, 7, 13, 10) ==> Çıktı (14, 33, 7, 15, 10)

        List<Integer> yss=new ArrayList<>();
        yss.add(12);
        yss.add(31);
        yss.add(7);
        yss.add(10);
        yss.add(13);
        for (int w:yss) {
            if (w==7||w==10){
                continue;
            }
            yss.set(yss.indexOf(w),w+2);
        }
        System.out.println(yss);

        //9) String bir listede verilen tüm fiyatların toplamını bulunuz.
        //Örnek: List<String> myList = new List<String>{'$12.99', '$23.60', '$54.45'}; ==> 91.04
        List<String> myList = new ArrayList<String>();
        myList.add("$12.99");
        myList.add("$23.60");
        myList.add("$54.45");
        List<Double> newMyList=new ArrayList<>();
        for (String w:myList) {
            newMyList.add(Double.valueOf(w.replace("$","")));
        }
        System.out.println(newMyList);
double toplam=0;
        for (Double w:newMyList) {

            toplam+=w;
        }
        System.out.println(toplam);

        //10) Bir String listesinde verilen en düşük ve en büyük fiyatın toplamını bulunuz.
        //Örnek: List<String> myList = new List<String>{'$12.99', '$8.25', '$23.60', '$54.45'}; ==> 62.70

        List<String> myLiz = new ArrayList<String>();
        myLiz.add("$12.99");
        myLiz.add("$23.60");
        myLiz.add("$8.25");
        myLiz.add("$54.45");
        List<Double>newLiz= new ArrayList<>();
        for (String w:myLiz) {
            newLiz.add(Double.valueOf(w.replace("$","")));
        }
        System.out.println(newLiz);
        Collections.sort(newLiz);
        double toplam1=newLiz.get(0)+newLiz.get(newLiz.size()-1);
        System.out.println(toplam1);

        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */
        //asList()--> String olarak verilen ifadelerin hepsini ArrayList!'in içine atar.
        // Yani list oluşturur. tek tek add demek zorunda kalmayiz

        List<String> str=new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));

        List<String >olmayan=new ArrayList<>();

        for (String w:str) {
            if (!w.toLowerCase().contains("a")){
                olmayan.add(w);
            }
        }
        System.out.println(olmayan);
        str.clear();
        str.addAll(olmayan);
        System.out.println(str);

        /*TASK :
        2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
        listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
        Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
           Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]

         */

        String isim[][] = {{"Ali", "Veli", "Ayse"}, {"Hasan", "Can"}, {"Suzan"}};
        yeniListIsim(isim);





    }

    private static void yeniListIsim(String[][] isim) {
        List<String> listIsim=new ArrayList<>();
        for (String[] w:isim) {
            for (String a :w) {
                listIsim.add(a);
            }
        }
        System.out.println(listIsim);
        Collections.sort(listIsim);
        System.out.println(listIsim);
    }
}
