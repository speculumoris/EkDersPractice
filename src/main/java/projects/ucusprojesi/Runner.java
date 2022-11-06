package projects.ucusprojesi;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen rotanizi belirtiniz");
        String route= scan.next();
        System.out.println("gidis donus bilet almak isterseniz 1'e \n almak istemiyorssaniz 2'ye basiniz.");
        String tekCiff=scan.next();

        double normalFiyatB=500*0.10;
        double normalFiyatC=700*0.10;
        double normalFiyatD=900*0.10;
        Yolcu yolcu=new Yolcu();
        yolcu.yas(2000,07,23);

        if(route.equalsIgnoreCase("B")){
            TarifeB tarifeB=new TarifeB(yolcu.yas, tekCiff,normalFiyatB);

        } else if (route.equalsIgnoreCase("C")) {
            TarifeC tarifeC=new TarifeC(yolcu.yas, tekCiff,normalFiyatC);
        }else if (route.equalsIgnoreCase("D")) {
            TarifeD tarifeD=new TarifeD(yolcu.yas, tekCiff,normalFiyatD);

        }


    }

}
