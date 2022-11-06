package projects.ucusprojesi;


public class TarifeB extends Yolcu {
    public TarifeB(Long yas, String gidisDonus, double normalFiyatB) {
        if (gidisDonus.equalsIgnoreCase("1")) {//gidis donus bilet kontrolu
            if (yas < 13) {//12 yasindan kucuk olma kontrolu
                normalFiyatB = (normalFiyatB - (normalFiyatB * (0.50)));
                normalFiyatB = (normalFiyatB - (normalFiyatB * 0.20)) * 2;
                System.out.println("yasiniz " + yas + " oldugu icin cocuk indiriminden faydalanıyorsunuz");
                System.out.println("bilet fiyatiniz  cocuk indirimi birlikte gidis donus :" + normalFiyatB);
            } else if (yas < 24) {//12 ve 24 yas arasinda olma kontrolu
                normalFiyatB = (normalFiyatB - (normalFiyatB * (0.10)));
                normalFiyatB = (normalFiyatB - (normalFiyatB * 0.20)) * 2;
                System.out.println("yasiniz " + yas + " oldugu icin genc indiriminden faydalanıyorsunuz");
                System.out.println("bilet fiyatiniz genc indirimi ile birlikte gidis donus :" + normalFiyatB);
            } else if (yas >= 65) {//65 yas ve ustu kontrolu
                normalFiyatB = (normalFiyatB - (normalFiyatB * (0.30)));
                normalFiyatB = (normalFiyatB - (normalFiyatB * 0.20)) * 2;
                System.out.println("yasiniz " + yas + " oldugu icin 65 yas indiriminden faydalanıyorsunuz");
                System.out.println("bilet fiyatiniz 65 yas indirimi ile birlikte gidis donus :" + normalFiyatB);
            } else {//24 yasi ve 64 yas araligi kontrolu ve gidis donus bilet indirim kontrolu
                normalFiyatB = (normalFiyatB - (normalFiyatB * 0.20)) * 2;
                System.out.println("gidis donus indirimi haricinde herhangi indiriminiz yoktur" + normalFiyatB);
            }
        } else if (gidisDonus.equalsIgnoreCase("2")) {//gidis donus bileti almama kontrolu
            if (yas < 12) {
                normalFiyatB = normalFiyatB - (normalFiyatB * (0.50));
                System.out.println("bilet fiyatiniz  cocuk indirimi birlikte :" + normalFiyatB);
            } else if (yas < 24) {
                normalFiyatB = normalFiyatB - (normalFiyatB * (0.10));
                System.out.println("bilet fiyatiniz genc indirimi ile birlikte :" + normalFiyatB);
            } else if (yas > 65) {
                normalFiyatB = normalFiyatB - (normalFiyatB * (0.30));
                System.out.println("bilet fiyatiniz 65 yas indirimi ile birlikte :" + normalFiyatB);
            } else {
                System.out.println("herhangi indiriminiz yoktur" + normalFiyatB);
            }
        } else System.out.println("hatali giris yaptiniz");
    }


}

