package arraylists;

import java.util.*;


public class Q01 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
         *  1. Kullanicidan ismini isteyelim
         *  2. Kullanici adindaki bosluklari silelim.
         *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
         *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
         *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.



        List<String> veritabaniIsimler=new ArrayList<>();
        veritabaniIsimler.add("arife");
        veritabaniIsimler.add("selim");
        veritabaniIsimler.add("bektaş");
        veritabaniIsimler.add("kahraman");
        veritabaniIsimler.add("korkmaz");
        veritabaniIsimler.add("buyuk");


        System.out.println("lutfen isminizi giriniz");
        String nickname=scan.nextLine();
        nickname=nickname.replace(" ","");

        boolean varMi=veritabaniIsimler.contains(nickname);

        if (varMi){
            System.out.println("isim zaten alinmis");
        }else System.out.println("bu kullanici adini alabilirsiniz");

        if (varMi){
            int rastgeleSayi=new Random().nextInt(100);
            nickname=nickname+""+rastgeleSayi;
            System.out.println("yeniadinizi :"+nickname);
        }else System.out.println("isminiz kullanilabilir");


         * Kullanicidan int  list uzunlugunu isteyin
         * Listin uzunlugu kadar kullanicidan list elemanlarini girmesini isteyin
         * Tekrarli list elemanlarindan yeni bir list olusturan ve  yazdiran metod yazin
         *
         * n = 5 icin (listin uzunlugu);
         * input { 1 , 2 , 2 , 3 , 4}
         * output {2}
         *

        System.out.println("lutfen list sayisini giriniz");
        int uzunluk=scan.nextInt();
        List<Integer> sayi=new ArrayList<>();
        int count = 0;
        int i=0;
        while(i<uzunluk){
            System.out.println("elemanlari giriniz");
            int ekle=scan.nextInt();
            sayi.add(ekle);
            i++;
        }
        System.out.println(sayi);
        List<Integer> yeniArr=new ArrayList<>();
        for (int w:sayi) {
            if (sayi.indexOf(w)!=sayi.lastIndexOf(w)){
                if (!yeniArr.contains(w)){
                    yeniArr.add(w);
                }

                count++;
            }
        }
        System.out.println("tekrarlanan sayi miktari "+count);
        System.out.println(yeniArr);

         */
        /*
         * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
         * not kisa metodlar kullamayiniz
         * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8////****************************


        int arr[]={1,2,3,4,5,6,7,8};

        List<Integer> arrList=new ArrayList<>();

        for (int w:arr) {
            arrList.add(w);
        }

        //1) Bir tamsayı listesindeki tüm öğelerinin toplamını bulunuz.

        List<Integer>toplam=new ArrayList<>();
        toplam.add(1);
        toplam.add(2);
        toplam.add(3);
        toplam.add(4);
        toplam.add(5);
        toplam.add(13);
        toplam.add(7);
        toplam.add(8);

        int topalm=0;
        for (int w:toplam) {
            topalm+= w;

        }
        System.out.println(topalm);

       // 2) Bir tamsayı listesinde 13 öğesinden önceki tüm liste öğelerinin toplamını bulunuz.
        int toplam1=0;
        for (int w:toplam){
            if (w==13){
                break;
            }
            toplam1+=w;
        }
        System.out.println(toplam1);

        //3) Bir tamsayı listesindeki tüm çift sayıların çarpımını bulunuz.
        int carpim=1;
        for (int w:toplam){
            if (w%2==0){
                carpim*=w;
            }
        }
        System.out.println(carpim);

        //4) Bir listedeki öğelerin azalan sırada olup olmadığını kontrol ediniz.
        // Örnek: (Sarı, Mavi, Kırmızı, Yeşil) ==> Çıktı: Azalan sırada değil
        //(Sarı, Kırmızı, Yeşil, Mavi) ==> Çıktı: Azalan sıradadır

        //List<String>azalan=new ArrayList<>();
        //azalan.add("Sari");
        //azalan.add("Mavi");
        //azalan.add("Kirmizi");
        //azalan.add("Yesil");
        //List<String>f=new ArrayList<>();
        //f.addAll(azalan);
        //System.out.println(azalan);
        //Collections.sort(f);
        //System.out.println(f);

        List<String> e = new ArrayList<>();
        e.add("Yellow");
        e.add("Red");
        e.add("Green");
        e.add("Blue");
        List<String> f = new ArrayList<>(); f.addAll(e);
        Collections.sort(f );
        System.out.println(e);
        System.out.println(f );
        int size = e.size();
        int flag = 0;
        for(int i=0; i<size; i++){
            if(f.get(i).equals(e.get(size-1-i))){ flag++;
            } }
        if(flag == size){
            System.out.println("Azalan siradadir");
        }else{
            System.out.println("Azalan sirada degil");
        }



        //5) Listede eleman olarak 15 varsa, tüm 15'leri 51 olarak değiştiriniz.
        // Örnek: (12, 11, 15, 34, 43) ==> Çıktı (12, 11, 51, 34, 43)

        List<Integer>degisim=new ArrayList<>();
        degisim.add(12);
        degisim.add(13);
        degisim.add(15);
        degisim.add(34);
        degisim.add(43);
        degisim.add(15);

        if (degisim.contains(15)){
            for (int w:degisim) {
                if (w==15){
                    int idx=degisim.indexOf(15);
                    degisim.set(idx,51);
                }

            }
        }else System.out.println("15 diye eleman yoktur");
        System.out.println(degisim);



        //6) Listede 15 veya 13 varsa, bu elemanları kaldırınız.
        // Örnek: (10, 31, 15, 13, 54) ==> Çıktı (10, 31, 54)

        List<Integer>list1=new ArrayList<>();
        list1.add(10);
        list1.add(31);
        list1.add(15);
        list1.add(13);
        list1.add(54);
        int idx=0;

        if (!list1.contains(13)|| !list1.contains(15)){
            System.out.println("13 veya 15 ıcermiyor");
        }else {
            for (int w = 0; w < list1.size(); w++) {

                if (list1.get(w)==15){
                    int idx1=list1.indexOf(15);
                    list1.remove(idx1);
                }
                if (list1.get(w)==13){
                    int idx2=list1.indexOf(13);
                    list1.remove(idx2);
                }

            }
            System.out.println(list1);
        }


        //7) Bir tamsayı listesinde en yakın 2 tamsayıyı bulunuz.
        // Örnek: (12, 31, 15, 13, 54) ==> Çıktı 12 ve 13'tür

        List<Integer>list2=new ArrayList<>();
        list2.add(12);
        list2.add(31);
        list2.add(15);
        list2.add(13);
        list2.add(54);
        Collections.sort(list2);
        int fark=list2.get(2)-list2.get(1);
        for (int i = 1; i < list2.size(); i++) {
            fark=Math.min(fark,list2.get(i)-list2.get(i-1));
        }
        for (int i = 1; i <list2.size() ; i++) {
            if (list2.get(i)-list2.get(i-1)==fark){
                System.out.println(list2.get(i) + " and " + list2.get(i-1));
            }
        }

        //8) Listedeki 7 ve 10 dışındaki her öğenin değerini 2'şer artırınız.
        // Örnek: (12, 31, 7, 13, 10) ==> Çıktı (14, 33, 7, 15, 10)
        List<Integer> list3=new ArrayList<>();
        list3.add(12);
        list3.add(31);
        list3.add(7);
        list3.add(13);
        list3.add(10);
        for (int w:list3) {
            if (w==7||w==10){
                continue;
            }
            list3.set(list3.indexOf(w),w+2);
        }
        System.out.println(list3);

         */
        //9) String bir listede verilen tüm fiyatların toplamını bulunuz.
        //Örnek: List<String> myList = new List<String>{'$12.99', '$23.60', '$54.45'}; ==> 91.04
        List<String> myList = new ArrayList<String>();
        myList.add("$12.99");
        myList.add("$23.60");
        myList.add("$54.45");
        double toplam=0;
        for (String w:myList) {
            Double a=Double.valueOf(w.replace("$",""));
            toplam=toplam+a;
        }
        System.out.println(toplam);

        //10) Bir String listesinde verilen en düşük ve en büyük fiyatın toplamını bulunuz.
        //Örnek: List<String> myList = new List<String>{'$12.99', '$8.25', '$23.60', '$54.45'}; ==> 62.70

        List<String> myList1 = new ArrayList<String>();
        myList1.add("$12.99");
        myList1.add("$8.25");
        myList1.add("$23.60");
        myList1.add("$54.45");

        List<Double>kral=new ArrayList<>();
        for (String w :myList1) {
            Double price=Double.valueOf(w.replace("$", ""));
            kral.add(price);
        }
        Collections.sort(kral);
        double toplam1=kral.get(0)+ kral.get(kral.size()-1);
        System.out.println(toplam1);












    }
}
