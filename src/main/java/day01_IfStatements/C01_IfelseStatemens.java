package day01_IfStatements;

import java.util.Scanner;

public class C01_IfelseStatemens {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");
        char karakter =scan.next().charAt(0);

        if ((karakter >='A' && karakter <='Z') || (karakter >='a' && karakter <= 'z')){
            System.out.println("girdiginiz karakter bir harftir");
        }else System.out.println("girdiginiz karakter harf degil");
    }
}
