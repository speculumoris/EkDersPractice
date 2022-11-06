package datetimeclass;

import javax.swing.text.DateFormatter;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Q01 {
    public static void main(String[] args) {
        //1) Ali'nin kaç gün yaşadığını bulan kodu yazınız.
        // Ali'nin doğum tarihi 12 Mayıs 2002'dir.
        LocalDate dobAli=LocalDate.of(2002, Month.APRIL,12);
        LocalDate fark=LocalDate.now();
        Long tamFark= ChronoUnit.DAYS.between(fark,dobAli);
        System.out.println(tamFark);



        //2) Ali'nin kaç ay yaşadığını bulan kodu yazınız.
        // Ali'nin doğum tarihi 4 Haziran 1997'dir.
        LocalDate dobAli1=LocalDate.of(1997,Month.JUNE,4);
        LocalDate bugun=LocalDate.now();

        Long fark1=ChronoUnit.MONTHS.between(dobAli1,bugun);
        System.out.println(fark1);

        //3) Ali'nin doğum tarihi 4 Haziran 1997'dir.
        // Ali'nin doğum tarihinden 2 yıl, 3 ay ve 12 gün sonraki tam tarihi bulmak için kodu yazınız.
        LocalDate dobAli2=LocalDate.of(1997,Month.JUNE,4);
        LocalDate yeniTarih=dobAli2.plusYears(2).plusMonths(3).plusDays(12);
        DateTimeFormatter pattern=DateTimeFormatter.ofPattern("dd/MM/yy");

        System.out.println(pattern.format(yeniTarih));

        //4) Ali, 29 Ekim 1923'ten 45 yıl 8 ay 5 gün sonra doğmuştur.
        //Veli, 15 Eylül 1993'ten 24 yıl 2 ay 11 gün önce doğmuştur.
        //Ali ve Veli'nin kesin doğum tarihini hesaplamak için kodu yazınız.
        //Ali ve Veli'nin doğum tarihinin aynı olup olmadığını kontrol etmek için kodu yazınız.
        LocalDate cmhryt=LocalDate.of(1923,10,29);
        LocalDate dobAli3=cmhryt.plusDays(5).plusMonths(8).plusYears(45);
        System.out.println(dobAli3);
        LocalDate kesinDg=LocalDate.of(1993,9,15);
        LocalDate dobVeli=kesinDg.plusDays(11).plusMonths(2).plusYears(24);
        System.out.println(dobVeli);
        if (dobAli3.equals(dobVeli)){
            System.out.println("dogum tarihleri aynidir");
        }else System.out.println("dogum Tarihleri ayni degildir");


        //5) Veli, Ali'den 3 yıl 11 gün sonra doğmuştur.
        //Ali size doğum tarihi bilgisini 24 Kasım 2012 olarak vermiştir.
        //Veli'nin doğum tarihini hesaplamak için gerekli kodu yazınız

        LocalDate dobAli4=LocalDate.of(2012,11,24);
        LocalDate dobVeli1=dobAli4.plusYears(3).plusDays(11);
        System.out.println(dobVeli1);


        //6) Kendinizin ve çocuğunuzun doğum tarihi için Tarih Değerleri oluşturup,
        // ardından farkı gün olarak hesaplayınız.
        LocalDate kendim=LocalDate.of(2000,07,23);
        LocalDate cocum=LocalDate.of(2025,05,19);
        Long cocumlaFark=ChronoUnit.DAYS.between(kendim,cocum);
        System.out.println(cocumlaFark);

        //7) Belirli bir tarihte yılın son 2 hanesini alınız.
        int sonIki=cocum.getYear()%100;
        System.out.println(sonIki);

        //8) Belirli bir yılın "Artık yıl" olup olmadığını kontrol etmek için kodu yazınız.
        //i) Bir yıl 100'e ve 400'e tam bölünüyorsa buna artık yıl denir. Örneğin; 2000 artık yıl, 1900 değildir.
        //ii) Bir yıl 100'e ve 4'e tam bölünemiyorsa artık yıl olarak adlandırılır. Örneğin; 2004 artık yıl, 2007 değildir.
        boolean artikYil=kendim.isLeapYear();
        System.out.println(artikYil);

        //9) İki farklı tarihin ay numaralarının toplamını bulunuz.
        String toplam=kendim.getMonthValue()+cocum.getMonthValue()+"";
        System.out.println("iki tarihin ay toplamlari :" +toplam);

        //10) İki farklı tarih için saat farkını bulunuz.
        LocalDate tarih1 = LocalDate.of(1996, 8, 21);
        LocalDate tarih2 = LocalDate.of(2015, 3, 12);

       // long tarihFarki=ChronoUnit.HOURS.between(tarih1,tarih2);
       // System.out.println(tarihFarki);

        //1) Eğer saat
        //i) 24:00 ile 05:00 arasında ise konsola 'Uyku zamanı' yazdırınız.
        //ii) 08:00 ile 16:00 arasında ise konsola 'Çalışma zamanı' yazdırınız.
        //iii) 19:00 ile 22:00 arasında ise konsola 'Aile zamanı' yazdırınız.
        // iv) Diğerleri için konsolda 'Kişisel zaman' yazdırınız.

        LocalTime fark2=LocalTime.now();
        int saat=fark2.getHour();

        if (0<saat && saat<5){
            System.out.println("uyku vakti");
        }else if(8<saat&&saat<16){
            System.out.println("calisma zamani");
        } else if (19<saat&&saat<22) {
            System.out.println("aile zamani");

        }else System.out.println("kisisel zaman");

        //2) Japonya saat dilimi ile Almanya saat dilimi arasındaki saat farkını bulmak için kodu yazınız.
        LocalTime jpn=LocalTime.now(ZoneId.of("Asia/Tokyo"));
        LocalTime grm=LocalTime.now(ZoneId.of("Europe/Berlin"));

        Long zamanFarki=ChronoUnit.HOURS.between(grm,jpn);
        System.out.println(zamanFarki);

        //3) Ali 5 Şubat 2015 TRT 10:00'da İstanbul' da,
        // Mark 5 Şubat 2015 12:00 EST' de ABD' de doğmuştur.
        // Ali'nin doğum saati ile Mark'ın doğum saati arasındaki saat cinsinden fark nedir?

        LocalDateTime dobSaatiAli=LocalDateTime.of(2015,02,05,10,0,0);
        ZonedDateTime dobSaatiAliZ=dobSaatiAli.atZone(ZoneId.of("Europe/Istanbul"));
        LocalDateTime dobSaatiMark=LocalDateTime.of(2015,02,05,12,0,0);
        ZonedDateTime dobSaatiMArkZ=dobSaatiMark.atZone(ZoneId.of("America/New_York"));
        Long saatFarki=ChronoUnit.HOURS.between(dobSaatiAliZ,dobSaatiMArkZ);
        System.out.println(saatFarki);

        LocalDateTime dogumTrhAli = LocalDateTime.of(2015, 2, 5, 10, 0, 0);
        ZonedDateTime yerelDogumTrhAli = dogumTrhAli.atZone(ZoneId.of("Europe/Istanbul"));
        LocalDateTime dogumTrhVeli = LocalDateTime.of(2015, 2, 5, 12, 0, 0);
        ZonedDateTime yerelDogumTrhVeli = dogumTrhVeli.atZone(ZoneId.of("America/New_York"));
        long saatFarki1 = ChronoUnit.HOURS.between(yerelDogumTrhAli, yerelDogumTrhVeli);
        System.out.println("Saatler arasi fark : " + saatFarki1);


        //4) Ali 5 Şubat 2015 saat 10:15 EST'de doğmuştur, Veli 6 Mart 2015 saat 12:25 EST'de doğmuştur. Ali ve Veli'nin doğum süreleri arasındaki fark nedir?
        LocalDateTime dobTimeAli=LocalDateTime.of(2015,02,05,10,0,0);
        LocalDateTime dobTimeVeli=LocalDateTime.of(2015,03,06,12,25,0);
        Long farki=ChronoUnit.MINUTES.between(dobTimeAli,dobTimeVeli);
        System.out.println(farki);







        String dah  = "12345" ;
        System.out.println(reverse1(dah));


    }
    public static String reverse1(String dah){

        String b="";
        for(int i=dah.length()-1;i>-1;i--){
            b=""+b+dah.charAt(i);

        }
        return b;
    }



}
