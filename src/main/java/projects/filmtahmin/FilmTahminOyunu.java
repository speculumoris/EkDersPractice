package projects.filmtahmin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FilmTahminOyunu {
    static List<String> filmler = new ArrayList<>(Arrays.asList("JOKER", "INCEPTION", "PIYANIST", "GREENMILE", "LEON", "GODFATHER", "JURASSICPARK", "TITANIC"));

    /*
     TASK :
      yukarıdaki film listinde bulunan filmlerden herhangi birisini kullanıcının film ismini  görmeden
      filmin index nosuna göre sectiriniz
      seçilen filmin  ismini filmin harf saysının 2 katı kadar hak tanıyarak tahmin etmesini
      sağlayan method create ediniz...
      Ahanda TRICK...
      kullanıcının sectiği filmin harf sayısını  console yazdırınız.
      kullanıcının sectiği film için tahmin hakkını  console yazdırınız.
      kullanıcının her tahmininde kalan hak sayısını console yazdırınız.
      kullanıcının her tahmininde doğru ve yanlış tahmin  sayısını console yazdırınız.
      kullanıcının kaybedip veya kazandığını ve tahmin etmesi gereken filmin ismini  console yazdırınız.

     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("--FILM TAHMIN OYUNUNA HOSGELDINIZ--");

        System.out.println("1 ile "+filmler.size()+" arasinda bir sayi seciniz");
        int secilenFilmIndex= scan.nextInt();
        filmGetir(filmler,secilenFilmIndex-1);

    }

    private static void filmGetir(List<String> film, int index) {

        StringBuilder tahminEdilecekFilm=new StringBuilder(FilmTahminOyunu.filmler.get(index).replaceAll("\\w","-"));
        System.out.println(tahminEdilecekFilm);
        System.out.println(film.get(index).length()+" harfli filmi sectiniz.Filmi tahmin etmek icin "+film.get(index).length()+" hakkiniz vardir.");
        int tahminSayisi=0;

    }
}
