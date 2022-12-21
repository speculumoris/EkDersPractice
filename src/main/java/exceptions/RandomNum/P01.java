package exceptions.RandomNum;

import java.util.Scanner;

public class P01 {
   /* randomSayi isminde static void bir method create ediniz.
    Bu method içerisinde iki int random sayı oluştursun. (0'dan 10 a kadar)
    Bu iki random sayının toplamını yazdırın.
    Eğer bu iki random sayının toplamı 12 den küçükse "Exception" versin ve mesaj olarak
            ("Sayı 12'den küçük ise hata verir") print edin.

    */
   public static void main(String[] args) {
       double a=Math.random()*10;
       System.out.println(a);
       double b=Math.random()*10;
       System.out.println(b);
       randomVar(a,b);
   }
   public static void randomVar(double a,double b){

       try {
           double toplam=a+b;
           System.out.println(toplam);
           if (toplam<12){
               throw new RuntimeException();
           }
       } catch (Exception e) {
           System.out.println("Sayı 12'den küçük ise hata verir");
           throw new RuntimeException(e);
       }
   }

}
