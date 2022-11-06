package projects.ucusprojesi;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Yolcu {



    long yas;
    int year;
    int month;
    int day;


    public void yas(int year,int month,int day) {

        LocalDate now = LocalDate.now();
        LocalDate dg = LocalDate.of(year, month, day);
        yas = ChronoUnit.YEARS.between(dg, now);


    }

}
