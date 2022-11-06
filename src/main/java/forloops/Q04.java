package forloops;

public class Q04 {
    public static void main(String[] args) {
       /*
        //1) 120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen
        // tüm tam sayıları aynı satırda iki ardışık tam sayı arasında boşluk bırakarak yazınız.
        String s="" ;
        for (int i = 120; i >10 ; i--) {
            if (i%4==0&&i%6==0){
                s=s+i+" ";
            }

        }
        System.out.println(s);


        //Bir String’de tekrarlanan karakterleri yazdırmak için kod yazınız.
        // Örneğin; accessories  ́ ces
        String tekrar="accessories";
        String d="";
        for (int i =0;i<tekrar.length();i++){
            String c=tekrar.substring(i,i+1);
            if (tekrar.indexOf(c)!=tekrar.lastIndexOf(c)){
                if (!d.contains(c))
                d+=c;
            }
        }
        System.out.println(d);


        //3) Bir String ‘ in palindrom olup olmadığını kontrol etmek için kod yazınız.
        // Bir String, tersi ile aynıysa, buna palindrom denir. Örneğin; “anna”, “123321” palindromlardır.
        String str="sieteis";
        String d="";

        for (int i = str.length()-1; i >=0; i--) {
            d=d+str.charAt(i);
        }
        if (d.equals(str)) {
            System.out.println("palindrome");
        }else {
            System.out.println("degil");
        }

        //Benzersiz (Tekrarsız) rakamları bir tamsayı olarak yazdırmak için kod yazınız.
        // Örnek; 223878 ==>37

        int rakam=223878;
        String numS=String.valueOf(rakam);
        String s="";

        for (int i = 0; i <numS.length() ; i++) {
            String c=numS.substring(i,i+1);
            if (numS.indexOf(c)== numS.lastIndexOf(c)){
                s=s+c;
            }

        }System.out.println(s);
            //5) Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
            //A A A A A
            //A A A A A
            //A A A A A
        for (int i = 1; i <4 ; i++) {
            for (int j = 1; j < 6; j++) {
                System.out.print("A ");

            }
            System.out.println();
        }
        //6:
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("A");
            }
            System.out.println();
        }


        //7) Aşağıdaki çarpım tablosunu oluşturmak için kod yazınız.
        //3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30

        int num=3;
        for (int i = 1; i <11 ; i++) {
            System.out.println(num+"x"+i+"="+(num*i));
            }


        //8) 20'den 3'e kadar olan tek tamsayıları
        // aynı satırda ardışık olacak şekilde aralarında boşluk bırakarak yazdırmak için gereken kodu yazınız.
        for (int i = 20; i >2 ; i--) {
            if(i%2==1){
                System.out.print(i+" ");
            }

        }


       // 9) String içindeki tüm küçük harfleri yıldız işaretiyle yazdırmak için gereken kodu yazınız.
        // Örneğin; 'Ali Can?' ==> l*i*a*n*

        String kelime="Ali Can?";
        String s=kelime.replaceAll("[^a-z]","");
        String a="";
        for (int i = 0; i < s.length(); i++) {

            a=a+s.charAt(i)+"*";

        }
        System.out.println(a);


        //10) Verilen ondalık sayının sadece ondalık kısmındaki rakamlarını, kendisinden önce bir yıldız işaretiyle yazdırmak için gereken kodu yazınız.
            //Örneğin; 75.4238  ́ *4*2*3*8
        double sayi1=75.4238;
        String a=String.valueOf(sayi1);
        a=a.split("\\.")[1];
       String b="";
        System.out.println(a);
        for (int i = 0; i < a.length(); i++) {
            b=b+"*"+a.charAt(i);
        }
        System.out.println(b);


        //11) Bir String’ i tersine çevirmek için kod yazınız. Örnek; Mark ==> kraM
        String a="Bakma";
        String tersa="";
        for (int i = a.length()-1; i >-1 ; i--) {
            tersa=tersa+a.charAt(i);

        }
        System.out.println(tersa);


        // 12) Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        // A A A A A A A A
        // A X X X X X X A
        // A X X X X X X A
        // A X X X X X X A
        int rows = 4, columns = 8;
        for (int i = 1; i <=rows; i++) {
            String s = "";
            if (i == 1 || i == rows) {
                for (int j = 1; j <= columns; j++) {
                    s = s + "a ";
                }
                System.out.println(s);
            } else {
                s = s+"a ";
                for (int j = 2; j <columns ; j++) {
                    s=s+"x ";
                }
                s=s+"a ";
                System.out.println(s);

            }

        }


        //13) 3 ile 14 arasındaki tam sayıların toplamını bulmak için kodu yazınız.
       int toplam=0;
        for (int i = 3; i <15 ; i++) {
            toplam+=i;
            System.out.println(toplam);
        }

        */
        //14) 3 ile 9 arasındaki tam sayıların çarpımını bulmak için kodu yazınız.
       int m=1;
        for (int i = 3; i <10 ; i++) {
            m=m*i;
            System.out.println(m+"*"+i);
        }



    }
}
