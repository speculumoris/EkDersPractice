package exceptions.SchoolPro;

import java.util.ArrayList;
import java.util.Scanner;

public class SchoolMain {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {



        ArrayList<OgrenciPojo>schoolList=new ArrayList<>();

        SchoolPojo school=new SchoolPojo("Bayindir",5,schoolList);
        stdAdd(school);
    }
    public static void stdAdd(SchoolPojo school){
        do {
            OgrenciPojo ogrenciPojo1=new OgrenciPojo();

            System.out.println("lutfen ogrenci ismini giriniz");
            ogrenciPojo1.setAd(scan.nextLine());
            System.out.println("lutfen ogrenci soyadını giriniz");
            ogrenciPojo1.setSoyAd(scan.nextLine());


            try {
                System.out.println("ogrenci yasini giriniz");
                ogrenciPojo1.setYas(scan.nextInt());scan.nextLine();
                if (ogrenciPojo1.getYas() < 8 || ogrenciPojo1.getYas() > 15)
                    throw new Exception();


            } catch (Exception e) {
                System.err.println("ogrencinin yasi 15 in ustu ve 8'in altı olamaz altında olamaz");
                System.err.println("tekrar deneyiniz");
                System.out.println("ogrenci yasini giriniz");
                ogrenciPojo1.setYas(scan.nextInt());scan.nextLine();

            }
           // OgrenciPojo ogrenci=new OgrenciPojo(stdName,stdSurname,stdYas);

            school.getOgrenciler().add(ogrenciPojo1);
            System.out.println(school.getOgrenciler());

            if (school.getOgrenciler().size()>(school.getMaxOgrenciSayisi())-1){
                System.out.println("macx ogrenci sayisina ulastiniz");
                System.out.println("cikisiniz yapılıyor");
                break;
            }

        }while (true);
    }
}
