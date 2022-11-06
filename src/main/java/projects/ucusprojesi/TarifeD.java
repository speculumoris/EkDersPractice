package projects.ucusprojesi;

public class TarifeD extends Yolcu {
    public TarifeD(Long yas, String gidisDonus, double normalFiyatD) {
        if (gidisDonus.equalsIgnoreCase("1")) {//gidis donus bilet kontrolu
            if (yas < 13) {//12 yasindan kucuk olma kontrolu
                normalFiyatD = (normalFiyatD - (normalFiyatD * (0.50)));
                normalFiyatD = (normalFiyatD - (normalFiyatD * 0.20)) * 2;
                System.out.println("bilet fiyatiniz  cocuk indirimi birlikte :" + normalFiyatD);
            } else if (yas < 24) {//12 ve 24 yas arasinda olma kontrolu
                normalFiyatD = (normalFiyatD - (normalFiyatD * (0.10)));
                normalFiyatD = (normalFiyatD - (normalFiyatD * 0.20)) * 2;
                System.out.println("bilet fiyatiniz genc indirimi ile birlikte :" + normalFiyatD);

            } else if (yas >= 65) {//65 yas ve ustu kontrolu
                normalFiyatD = (normalFiyatD - (normalFiyatD * (0.30)));
                normalFiyatD = (normalFiyatD - (normalFiyatD * 0.20)) * 2;
                System.out.println("bilet fiyatiniz 65 yas indirimi ile birlikte :" + normalFiyatD);

            } else {//24 yasi ve 64 yas araligi kontrolu ve gidis donus bilet indirim kontrolu
                normalFiyatD = (normalFiyatD - (normalFiyatD * 0.20)) * 2;
                System.out.println("gidis donus indirimi haricinde herhangi indiriminiz yoktur" + normalFiyatD);
            }

        } else if (gidisDonus.equalsIgnoreCase("2")) {//gidis donus bileti almama kontrolu
            if (yas < 12) {
                normalFiyatD = normalFiyatD - (normalFiyatD * (0.50));
                System.out.println("bilet fiyatiniz  cocuk indirimi birlikte :" + normalFiyatD);
            } else if (yas < 24) {
                normalFiyatD = normalFiyatD - (normalFiyatD * (0.10));
                System.out.println("bilet fiyatiniz genc indirimi ile birlikte :" + normalFiyatD);
            } else if (yas > 65) {
                normalFiyatD = normalFiyatD - (normalFiyatD * (0.30));
                System.out.println("bilet fiyatiniz 65 yas indirimi ile birlikte :" + normalFiyatD);
            } else {
                System.out.println("herhangi indiriminiz yoktur" + normalFiyatD);
            }
        } else System.out.println("hatali giris yaptiniz");
    }


}
