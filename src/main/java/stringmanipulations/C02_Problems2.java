package stringmanipulations;

import java.util.Scanner;

public class C02_Problems2 {
    public static void main(String[] args) {
        //Soru 1) String methodlarini kullanarak “ Java ogrenmek123 Cok guzel@ ”
        // String’ini “Java ogrenmek cok guzel.” sekline getirin.
        String cumle = " Java ogrenmek123 Cok guzel@ ";
        String a = cumle.trim().replaceAll("[0-9]", "").
                replace("C", "c").replace("@", ".");
        System.out.println(a);

        //Soru 2) String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        // String str1 = “$13.99”
        //String str2 = “$10.55”
        //ipucu : Double.parseDouble() methodunu kullanabilirsiniz.

        String str1 = "$13.99";
        String str2 = "$10.55";
        String yeniStr1 = str1.replace("$", "");
        String yeniStr2 = str2.replace("$", "");


        double str15 = Double.parseDouble(yeniStr1);
        double str16 = Double.parseDouble(yeniStr2);
        System.out.println("$" + (str15 + str16));

        //Soru 3) Kullanicidan isim isteyin. Eger
        //- isim “a” harfi iceriyorsa “Girdiginiz isim a harfi iceriyor”
        //- isim “Z” harfi iceriyorsa “Girdiginiz isim Z harfi iceriyor”
        //- ikisi de yoksa “Girdiginiz isim a veya Z harfi icermiyor” yazdirin

        String isim = "Zuseba";
        if (isim.contains("a")&&isim.contains("Z")){
            System.out.println("Girdiginiz isim Z ve a  harfi iceriyor");
        }else if (isim.contains("a")){
            System.out.println("Girdiginiz isim a harfi iceriyor");
        }else if (isim.contains("Z")){
            System.out.println("Girdiginiz isim Z harfi iceriyor");
        }else System.out.println("Girdiginiz isim a veya Z harfi icermiyor");


        //Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
        //isim-soyisim : M***** B******* kart no : **** **** **** 1234
        String isim1="Beymen";
        String soyIsim1="TEKLIKE";
        String kkNo="1234 5678 1234 5678";
        String yeniIsim2=isim1.substring(0,1)+isim1.substring(1).replaceAll("[a-zA-Z]","*");
        String yeniSoyIsim1=soyIsim1.substring(0,1)+soyIsim1.substring(1).replaceAll("[a-zA-Z]","*");
        System.out.println(yeniIsim2+" "+yeniSoyIsim1);

        String yeniKkNo="**** **** ****"+" "+(kkNo.substring(kkNo.length()-4));
        System.out.println(yeniKkNo);



    }
}
