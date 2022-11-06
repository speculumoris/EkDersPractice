package projects.ucusprojesi;

public class TarifeC extends Yolcu {

    public TarifeC(Long yas, String gidisDonus, double normalFiyatC) {
        if (gidisDonus.equalsIgnoreCase("1")) {
            if (yas < 12) {
                normalFiyatC = (normalFiyatC - (normalFiyatC * (0.50)));
                normalFiyatC = (normalFiyatC - (normalFiyatC * 0.20)) * 2;
                System.out.println("bilet fiyatiniz  cocuk indirimi birlikte :" + normalFiyatC);
            } else if (yas < 24) {
                normalFiyatC = normalFiyatC - ((normalFiyatC * (0.10)));
                normalFiyatC = (normalFiyatC - (normalFiyatC * 0.20)) * 2;
                System.out.println("bilet fiyatiniz genc indirimi ile birlikte :" + normalFiyatC);

            } else if (yas > 65) {
                normalFiyatC = normalFiyatC - ((normalFiyatC * (0.30)));
                normalFiyatC = (normalFiyatC - (normalFiyatC * 0.20)) * 2;
                System.out.println("bilet fiyatiniz 65 yas indirimi ile birlikte :" + normalFiyatC);

            } else {
                normalFiyatC = (normalFiyatC - (normalFiyatC * 0.20)) * 2;
                System.out.println("gidis donus indirimi haricinde herhangi indiriminiz yoktur" + normalFiyatC);
            }
        } else if (gidisDonus.equalsIgnoreCase("2")) {
            if (yas < 12) {
                normalFiyatC = normalFiyatC - (normalFiyatC * (0.50));
                System.out.println("bilet fiyatiniz  cocuk indirimi birlikte :" + normalFiyatC);
            } else if (yas < 24) {
                normalFiyatC = normalFiyatC - (normalFiyatC * (0.10));
                System.out.println("bilet fiyatiniz genc indirimi ile birlikte :" + normalFiyatC);
            } else if (yas > 65) {
                normalFiyatC = normalFiyatC - (normalFiyatC * (0.30));
                System.out.println("bilet fiyatiniz 65 yas indirimi ile birlikte :" + normalFiyatC);
            } else {
                System.out.println("herhangi indiriminiz yoktur" + normalFiyatC);
            }
        } else System.out.println("hatali giris yaptiniz");
    }

}

