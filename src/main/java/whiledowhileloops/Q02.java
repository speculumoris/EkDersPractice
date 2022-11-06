package whiledowhileloops;

import java.util.Scanner;


public class Q02 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
         /*
         Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil


        System.out.println("bir sayi giriniz");
        int sayi=scan.nextInt();

        while (sayi>0){
            if (sayi%2==1){
                System.out.println(sayi);
            }
            sayi--;
        }

          */
        /*
    Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
    ve x girildiğinde ise "Program bitti" yazan programı yazınız.



        String a="";
        do {
            System.out.println("lutfen harf giriniz");
            a=scan.next();

            System.out.println("program calisiyor");

        }while (!a.equalsIgnoreCase("x"));
        System.out.println("program bitti");

         */
         /* WhileLoop,DoWhile
		Ask user to enter a word. If the word has odd number of characters
		 and has 3 or more characters,
		 print the character in the middle of the word.
		 the word has even number of character print "You entered wrong word."
		     INPUT      :   celik
		     OUTPUT 	:   l
		     INPUT      :   elif
		     OUTPUT 	:   You entered wrong word.
        String a="";
        do {
            System.out.println("lutfen bir kelime giriniz");
            a=scan.next();
            if (a.length()%2==1&&a.length()>2){
                System.out.println(a.substring((a.length()/2),(a.length()/2)+1));
                break;
            }else {
                System.out.println("yanlis karakter girdiniz");
                break;
            }

        }while(true);


        //1) 120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen
        // tüm tam sayıları aynı satırda iki ardışık tam sayı arasında boşluk bırakarak yazınız.
       int sayi=120;
       String s="";
        while (sayi>10){
            if (sayi%4==0&&sayi%6==0){
               s=s+sayi+" ";
            }
            sayi--;
        }
        System.out.println(s);
        String a="";
        sayi=120;
        do {
            if (sayi%4==0&&sayi%6==0){
                a=a+sayi+" ";
            }
            sayi--;

        }while (sayi>10);
        System.out.println(a);


        //2) Bir String’ de tekrarlanan karakterleri yazdırmak için kod yazınız.
        // Örneğin; accessories  ́ ces
        String a = "accessories";
        String b = "";
        int c = 0;
        do {
            String d=a.substring(c,c+1);
            if (a.indexOf(d) != a.lastIndexOf(d)) {
                if (!b.contains(d)) {
                    b = b + d;
                }
            }

            c++;

        } while (a.length() > c);
        System.out.println(b);

        String ab="accessories";
        String k="";
        int i=0;
        while (ab.length()>i){
            String j=ab.substring(i,i+1);
            if (ab.indexOf(j)!=ab.lastIndexOf(j)){
                if (!k.contains(j)){
                    k+=j;
                }
            }
            i++;
        }
        System.out.println(k);


        //3) Bir String ‘ in palindrom olup olmadığını kontrol etmek için kod yazınız.
        // Bir String, tersi ile aynıysa, buna palindrom denir. Örneğin; “anna”, “123321” palindromlardır.
        String pln = "kamal";
        String k = "";
        int i = pln.length()-1;
        while ( i>-1) {
            String a=pln.substring(i,i+1);
            k+=a;
            i--;
        }if (pln.equals(k)){
            System.out.println("palindrome dur");
        }else System.out.println("palindrome degildir");

        String pln1="kamak";
        String t="";
        int j=pln1.length()-1;
        do {
            String c=pln1.substring(j,j+1);
            t+=c;
            j--;

        }while (j>-1);
        if (pln1.equals(t)){
            System.out.println("palindrome dur");
        }else System.out.println("palindrome degildir");


        //4) Benzersiz (Tekrarsız) rakamları bir tamsayı olarak yazdırmak için kod yazınız.
        // Örnek; 223878 ==>37
        int a=223878;
        String b=String.valueOf(a);
        String c="";
        int i=0;
        while (b.length()>i){
            String d=b.substring(i,i+1);
            if (b.indexOf(d) == b.lastIndexOf(d)) {
                   c=c+d;
            }
            i++;


        }System.out.println(c);

        int sayi=223878;
        String s=String.valueOf(sayi);
        String k="";
        int j=0;
        do {
            String w=s.substring(j,j+1);
            if (s.indexOf(w)==s.lastIndexOf(w)){
                k=k+w;
            }
            j++;
        }while (s.length()>j);
        System.out.println(k);


        //5) Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        //A A A A A
        //A A A A A
        //A A A A A
        int i=1;
        while (i<4){
            for (int j = 1; j < 6 ; j++) {
                System.out.print("A ");

            }
            System.out.println();
            i++;
        }
        System.out.println();
        i=1;
        do {
            for (int j = 1; j < 6 ; j++) {
                System.out.print("A ");
            }
            System.out.println();
        i++;
        }while (i<4);


       // 6) Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        // A
        // A A
        // A A A
        // A A A A
        int i=1;
        while (i<5){
            for (int j = 1; j <=i ; j++) {
                System.out.print("A ");
            }
            System.out.println();
            i++;
        }
        System.out.println();

        i=1;
        do {
            for (int j = 1; j <=i ; j++){
                System.out.print("A ");
            }
            System.out.println();
            i++;
        }while (i<5);


        //7) Aşağıdaki çarpım tablosunu oluşturmak için kod yazınız.
        //3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30
        int sayi=3;
        int i=1;
        while (i<11){
            System.out.println(sayi+"x"+i+"="+(sayi*i));
            i++;
        }
        System.out.println("********************");
        i=1;
        do {
            System.out.println(sayi+"x"+i+"="+(sayi*i));
           i++;
        }while (i<11);


        //8) 20'den 3'e kadar olan tek tamsayıları
        // aynı satırda ardışık olacak şekilde aralarında boşluk bırakarak yazdırmak için gereken kodu yazınız.
        int a=20;
        while (a>2){
            if (a%2==1){
                System.out.print(a+" ");
            }
            a--;
        }
        System.out.println("*********");
        int sayi=20;
        do {
            if (sayi%2==1){
                System.out.print(sayi+" ");
            }
            sayi--;
        }while (sayi>2);


        //String içindeki tüm küçük harfleri yıldız işaretiyle yazdırmak için gereken kodu yazınız.
        // Örneğin; 'Ali Can?' ==> l*i*a*n*

        String a = "Ali Can?";
        a = a.replaceAll("[^a-z]", "");
        String b = "";
        int i = 0;
        while (a.length() > i) {
            b = b + a.charAt(i) + "*";

            i++;
        }
        System.out.println(b);

        System.out.println("************");

        String k = "Ali Can?";
        k=k.replaceAll("[^a-z]", "");
        i = 0;
        String c = "";
        do {
            c = c + k.charAt(i) + "*";
        i++;
        } while (k.length() > i);
        System.out.println(c);


        //10) Verilen ondalık sayının sadece ondalık kısmındaki rakamlarını,
        // kendisinden önce bir yıldız işaretiyle yazdırmak için gereken kodu yazınız.
        //Örneğin; 75.4238  ́ *4*2*3*8
        double a=75.4238;
        String b=String.valueOf(a);
        b=b.split("\\.")[1];
        String c="";
        int i=0;
        while (b.length()>i){
            c=c+"*"+b.charAt(i);
            i++;
        }
        System.out.println(c);

        String d=String.valueOf(a);
        d=d.split("\\.")[1];
        String e="";
        int j=0;
        do {
            e=e+"*"+d.charAt(j);
            j++;
        }while (d.length()>j);
        System.out.println(e);


        //11) Bir String’ i tersine çevirmek için kod yazınız. Örnek; Mark ==> kraM
        String k = "kral";
        String tersK = "";
        int i = k.length() - 1;
        while (i > -1) {
            tersK = tersK + k.charAt(i);
            i--;
        }
        System.out.println(tersK);
        System.out.println("*********");

        String c ="lark";
        String tersC = "";
        i=c.length()-1;
        do {
            tersC= tersC +c.charAt(i);
            i--;
        }while (i>-1);
        System.out.println(tersC);


        //12) Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        // A A A A A A A A
        // A X X X X X X A
        // A X X X X X X A
        // A X X X X X X A
        // A A A A A A A A
        int columns=8,rows=4;

        for (int i=1; i <=rows; i++){
            String a="";
            if (i==1||i==rows){
            for (int j = 1; j <=columns ; j++) {
                a=a+"A ";

            }
                System.out.println(a);
            }else {
                a=a+"A ";
                for (int j = 2; j < columns ; j++) {
                    a=a+"X ";
                }
                a=a+"A";
                System.out.println(a);
            }

        }


        //13) 3 ile 14 arasındaki tam sayıların toplamını bulmak için kodu yazınız.
        int i = 3;
        int toplam = 0;
        while (i < 14) {
            toplam += i;
            System.out.println(toplam);
            i++;
        }
        System.out.println(toplam);
        System.out.println("*********");

        int j=3;
        int toplam1=0;
       do{
            toplam1=toplam1+j;
            j++;
        } while (j<14);
        System.out.println(toplam1);


        //14) 3 ile 9 arasındaki tam sayıların çarpımını bulmak için kodu yazınız.
        int i=3;
        int carpim=1;
        while (i<10){
            carpim*=i;
            System.out.println(carpim);
            i++;
        }
        System.out.println("*********");
        int j=3;
        int carpim1 = 1;
        do {
            carpim1 *=j;
            j++;
        }while (j<10);
        System.out.println(carpim1);


       // 15) Do-while döngüsünü kullanarak konsolda 'C' ile 'A' arasındaki karakterleri yazdırmak için kod yazınız.
        int i='C';
        String a=" ";
        do {
            a=a+(char)i+" ";
            i--;

        }while (i>='A');
        System.out.println(a);
        System.out.println("*********");

        char ch='C';
        String b="";
        while (ch>='A'){
            b=b+ch+" ";
            ch--;
        }
        System.out.println(b);


        //16) Bir String de, ilk 'm' karakterinden önceki tüm karakterleri yazınız.
        String str = "enmene";
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            String c = str.substring(i, i + 1);
            if (!c.equalsIgnoreCase("m")) {
                s = s + c;

            } else break;


        }
        System.out.println(s);
        System.out.println("*********");
        String a = "";
        int i = 0;
        while (str.length() > i) {
            String b = str.substring(i, i + 1);
            if (!b.equalsIgnoreCase("m")) {
                a = a + b;
            } else break;
            i++;
        }
        System.out.println(a);
        System.out.println("*********");
        String n = "kasemici";
        int j = 0;
        String k = "";
        do {
            String V = n.substring(j, j + 1);
            if (!V.equalsIgnoreCase("m")) {
                k = k + V;
            } else break;
            j++;
        } while (n.length() > j);
        System.out.println(k);


        // Bir tamsayıdaki rakamların toplamını bulmak için kodu yazınız.
        int a=2138;
        int toplam=0;
        for (int i = a; i >0; i=i/10) {
            toplam=toplam+i%10;
        } System.out.println(toplam);

        int b=223878;
        int toplma1=0;
        int i=b;
        while (i>0){
            toplma1+=i%10;
            i/=10;
        }
        System.out.println(toplma1);

        int c=12345;
        int j=c;
        int toplam1=0;
        do {
            toplam1+=j%10;
            j/=10;
        }while (j>0);
        System.out.println(toplam1);


        //18) Bir String’ de benzersiz(tekrarsız) karakterler yazdırmak için kod yazınız. Örneğin; Hello ==> Heo
        String h="Hello";
        String k="";
        for (int i = 0; i < h.length() ; i++) {
           String s=h.substring(i,i+1);
            if (h.indexOf(s)== h.lastIndexOf(s)){
                k=k+s;
            }
        }
        System.out.println(k);

        String l="";
        int i=0;
        while (h.length()>i){
            String d=h.substring(i,i+1);
            if (h.indexOf(d)== h.lastIndexOf(d)){
                l=l+d;

            }
            i++;
        }System.out.println(l);

        l="";
        i=0;
        do {
            String f=h.substring(i,i+1);
            if (h.indexOf(f)== h.lastIndexOf(f)){
                l=l+f;
            }
            i++;
        }while (h.length()>i);
        System.out.println(l);

          */
        //I spoke to the devil in miami, he said everything would be fine

//Soru 6) Interview Question Kullanicidan 100'den kucuk bir tamsayi isteyin. I'den baslayarak
//girilen sayiya kadar tum sayilari yazdirin. Ancak;
//- Sayi 3'un kati ise sayi yerine "Java"
//" yazdirin.
//- Sayi 5'in kati ise sayi yerine "Guzeldir" yazdirin.
//- Sayi hem 3'un hem 5'in kati ise sayi yerine "Java Guzeldir" yazdirin.

        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen 100 den kucuk bir sayi giriniz");
        int sayi=scan.nextInt();

        for (int i =1;i<=sayi; i++){

            if (i%3==0&&i%5==0){
                System.out.println("Java guzeldir ");
            }else if (i%5==0){
                System.out.println("guzeldir ");
            } else if (i%3==0) {
                System.out.println("Java ");
            }else System.out.println(i+" ");

        }

































    }
}
