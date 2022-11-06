package stringmanipulations;

public class C04_Problems {
    public static void main(String[] args) {
        /*
		name1 ve name2 degiskenlerini olusturun.
		name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
		name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirin.
		          e.g:
		         name1= mehmet
		         name2= ahmet
		         Print ==> mehahmetmet
		*/
        String name1="yusuffsefa";
        String name2="ahmet";
        if (name1.length()%2==0){
            System.out.println(name1.substring(0,name1.length()/2)+name2+name1.substring(name1.length()/2));
        }else System.out.println("name1 cift sayili olmadigi icin ortasina yerlestiremedik");

        /*
		Kullanicidan bir kelime girmesini isteyin.
		* Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
		* kelimenin ortasindaki karakteri yazdirin.
		*/
        String kelime = "bayindirs";

        if (kelime.length()%2==1&&kelime.length()>2){
            System.out.println(kelime.substring(kelime.length()/2,(kelime.length()/2)+1));
        }else System.out.println("hatali girdiniz");


        // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
        // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

        String str1="";

        if (str1.contains(" ")){
            System.out.println("bosluk var");
        }else System.out.println("bosluk yok");

        if (str1.isEmpty()){
            System.out.println("bostur");
        }else System.out.println("bos degildir");


        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin

        String dortHarfli="sela";

        String yeniDortHarfli=dortHarfli.toUpperCase().substring(3)+dortHarfli.substring(2,3)+dortHarfli.substring(1,2)+dortHarfli.substring(0,1);
        System.out.println(yeniDortHarfli);
    }
}
