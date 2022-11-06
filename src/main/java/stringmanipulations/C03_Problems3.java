package stringmanipulations;

public class C03_Problems3 {
    public static void main(String[] args) {
        //Soru 6) Kullanicidan bir sifre girmesini isteyin.
        // Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        // sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        //- Ilk harf buyuk harf olmali
        //- Son harf kucuk harf olmali
        //- Sifre bosluk icermemeli
        //- Sifre uzunlugu en az 8 karakter olmali
        String sifre = "Apalılalar";
        boolean ilkHarf = false;
        if (sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z') {
            ilkHarf = true;
        } else System.out.println("ilkharf buyuk olmali");

        boolean sonHarf = false;
        if (sifre.charAt(sifre.length() - 1) >= 'a' && sifre.charAt(sifre.length() - 1) <= 'z') {
            sonHarf = true;
        } else System.out.println("sonharf kucuk olmali");

        boolean bosluk = false;
        if (!sifre.contains(" ")) {
            bosluk = true;
        } else System.out.println("bosluk icermemeli");
        boolean krkterSayisi = false;
        if (sifre.length() > 8) {
            krkterSayisi = true;
        } else System.out.println("uzunlugu 8 veya daha fazlasi olmali");

        if (ilkHarf && sonHarf && bosluk && krkterSayisi) {
            System.out.println("sifre basari ile tanimlandi");
        } else System.out.println("islem basarisiz tekrar deneyiniz");

        /*
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */
        String input = "kelime";
        if (input.length() >= 3) {
            System.out.println(input.substring(input.length() - 2) + input.substring(input.length() - 2) + input.substring(input.length() - 2));
        } else System.out.println("hatali giris yaptiniz");


        /*
         * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
         *
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
         *
         */

        String dortKelime = "cesaret, insana, sinirlarini, ogretir";

        String dortKelime1 = dortKelime.toUpperCase().substring(0, 1) + dortKelime.substring(1).replaceAll(",", "");
        System.out.println(dortKelime1 + ".");

        /* String girildiginde ilk iki karakteri haric string return eden java programi yaziniz
           Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin (gh  -  g  -  h   : 3 durum var)

          ORNEK:          INPUT     OUTPUT
                          goat        gat
                         photo        hoto
                         ghost        ghost
                         kalem        lem
		 */

        String ozelKelime = "kalem";
        if (ozelKelime.startsWith("gh")) {
            System.out.println(ozelKelime);
        } else if (ozelKelime.startsWith("g")) {
            System.out.println(ozelKelime.charAt(0) + ozelKelime.substring(2));
        } else if (ozelKelime.charAt(1) == 'h') {
            System.out.println(ozelKelime.substring(1));
        } else System.out.println(ozelKelime.substring(2));
        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */
        String xyz = "xy.z.lk";
        System.out.println(xyz(xyz));
    }

    private static boolean xyz(String xyz) {
        boolean kinteyns = true;
        if (xyz.contains("xyz")) {
            kinteyns = true;

        } else
            kinteyns = false;

        return kinteyns;


    }
}
