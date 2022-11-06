package konuanlatim;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {
        /*
        ArrayList'ler*****

         Lenght i esnek olan bir Arraydir
         Array olsuturmak icin eleman sayisini yazmamiz gerek(fixed) fakat
         Arraylist icin öyle bir zorunluluk yok o yuzden (flexible dir)
         Array'lerin icine primitive ve non-prmitive "reference'lar konabilir.
        * Arraylist'lerin icine sadece "non-primitive" ler konulur.
         * Array'ler super fast,cok hizlidir. Arrayler memory'i cok az kullanir.
         */
        //ArrayList'ler nasil olsuturulur?
        ArrayList<Integer> list=new ArrayList<Integer>();
        ArrayList<Integer> list1=new ArrayList<>();
        List<Integer> list2= new ArrayList<>(); // ==> Genellikle bu kullanilir

        //Add() list'e eleman eklemek icin kullanilir
        //add() her zaman elemani sona ekler.(insertion order)
        list2.add(2);
        list2.add(3);
        list2.add(4);
        System.out.println(list2);
        list2.add(0,4);
        list2.add(1,5);
        System.out.println(list2);
        list2.add(6);
        System.out.println(list2);

        //size() ==> kac eleman oldugunu yazdirir.

        System.out.println("eleman sayisi :"+list2.size());

        //get() methodu istedigimiz indexteki elemani getirir.

        System.out.println("3.indexteki eleman :"+list2.get(3));//3

        //isEmpty() list bos olup olmadigini kontrol eder bos ise true dondurur.
        System.out.println("list bos mu dolu mu :"+list2.isEmpty());//false

        //remove() ArrayList'te belli elemani silmek icin kullanilir.
        //1) removu indexle kullanabiliriz o indexteki elemani siler
        list2.remove(5);
        System.out.println(list2.remove(4));
        System.out.println(list2);//[4, 5, 2, 3]
        //remove(eleman) yazarak o elemanin ilk kullanildigi yeri List'ten siler.

        List<String> lst=new ArrayList<>();
        lst.add("kural");
        lst.add("hatasi");
        lst.remove("hatasi");
        System.out.println(lst);

        //Contains ==> Contains( ) methodu ArrayList’de bir elemanin var olup olmadigini kontrol eder.
        //istedigimizeleman varsa true,yoksa false dondurur
        System.out.println(list2.contains(5));//true

        Collections.sort(list2);
        System.out.println(list2);//[2, 3, 4, 5]

        //equals iki list biribirine es deger olup olmadigini kontrol eder.Elemanlar ayni mi degil mi?
        //ayni indexteki elemanlar ayni ise true dondurur,degilse false dondurur
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println("list1 ve list2 equal mu? :"+list1.equals(list2));//

        //Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
        //            toplamını bulan code create ediniz.

        List<Integer>karelerT=new ArrayList<>();
        karelerT.addAll(list1);

        System.out.println(karelerT);

        List<Integer>newKareler=new ArrayList<>();


        for (int i = 0; i < karelerT.size(); i++) {
            newKareler.add(karelerT.get(i)*karelerT.get(i));

        }
        System.out.println(newKareler);






    }
}
