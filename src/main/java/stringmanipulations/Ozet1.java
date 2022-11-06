package stringmanipulations;

public class Ozet1 {

   /* indexOf()
     char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.

     lastIndexOf()
       String içinde aranan karakter(ler)in sondan itibaren ilk indexini verır
       indexOf un sondan olan hali fakat index numaraları değişmez.

    charAt()
       İstenen noktadaki karakteri verir,
       karakterlerin sırası 0 dan başlar, buna index denir.

      substring()
      Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.

       trim()
       Metnin basinda ve sonunda bulunan bosluklardan kurtulmayi saglar, aralardaki bosluklara dokunmaz. Sonuc String dir.
       replace()
       Metin icerisindeki karakter ya da bir parcasinin, istenilen karakter ya da metinle degistirilmesini saglar. Sonuc String'dir..


       replace()
       Metin icerisindeki karakter ya da bir parcasinin, istenilen karakter ya da metinle degistirilmesini saglar. Sonuc String'dir..


       contains()
       Metin icerisinde arama yapmamizi saglar.
       bir stringin içerisinde karakter(ler)in var olup olmadığını kontrol eder.
       Sonuc boolean dir.

       equals()
       2 String metnin birbirine esit olup olmadigina bakar. büyük küçük harf farkı vardır. Sonuc boolean dir.

       equalsIgnorecase()
       equals() ile ayni islevi gorur, tek farki buyuk kucuk harfe duyarliligi yoktur. Sonuc boolean dir.

        startsWith()
         Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.

        endsWith()
        Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.

        Length()
        length() method'u girilen String'in uzunlugunu verir
        butun karakterlerin adedi (bosluklar da birer karakterdir)

        equals() methodu sadece String'lerin degerlerini karsilastirir

        str.toLowerCase() verilen String'in tamamini kucuk harfe cevirir
        str.toUpperCase() verilen String'in tamamini buyuk harfe cevirir

        StringIsEmpty()
       String tamamen boş mu değil mi onu kontrol ediyor, sonuç true false

       Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
       Stringlerle matematiksel islemler yapabilmemizi sagla

       valueOf() hem Integer wrapper classinin icinde hem de String'in icinde var. Integer wrapper classinin icinde
       olan valueOf() methdou String'i integer'a cevirir. String'in icindeki valueOf() methodu integer'i String'e cevirir.

        parseDouble() veya parseInteger() methodu kullanabiliriz
       ancak primitive data tipleri method'a sahip olmadiklarindan wrapper class kullanmamiz lazim

       (Eski batchlerden olan iki arkadasımdan yardım alarak yaptım :) herkese kolay gelsin)

        /*
                              (BIZIM BATCH)      String Class Methodlari

                1)equals(): i)Iki tane String'in ayni olup olmadigini anlamamiza yarar.
                            ii)equals() method'u "boolean" return eder.

                2)equalsIgnoreCase(): i) Iki tane String'in ayni olup olmadigini buyuk harf kucuk harfe dikkat etmeden anlamamiza yarar.
                                      ii) equalsIgnoreCase() method'u "boolean" return eder.

                3)toLowerCase(): i)Bir String'deki tum harfleri kucuk harfe cevirmek icin kullanilir.
                                 ii) toLowerCase() method'u "String" return eder

                4)toUpperCase(): i)Bir String'deki tum harfleri buyuk harfe cevirmek icin kullanilir.
                                 ii) toUpperCase() method'u "String" return eder

                5)charAt(): i) Bir String'den belli bir index'deki characteri almak icin kullanilir.
                             ii) charAt() method'u "char" return eder.

                6)length(): i) Bir String'de kac tane character kullanildigini ogrenmek icin kullanilir
                            ii) length() method'u "int" return eder.

                7)contains(): i)Bir String'de belli bir characterin veya characterlerin var olup olmadigini anlamak icin kullanilir
                              ii) contains() method'u "boolean" return eder.

                8)split(): i)Bir String'i istedigimiz character'den parcalamaya yarar
                           ii)split() method'u "Array" return eder.
         */
 }
