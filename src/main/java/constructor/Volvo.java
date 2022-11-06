package constructor;

public class Volvo {
    String marka="Volvo";
    String mensei="Isvec";
    String model;
    boolean elektrikliMi;
    int yil;
    String yakit;
    boolean otomatikPilot=otomatikPilotSorgusu(elektrikliMi);
    int maxHiz=maxHizAta();


    public Volvo(String mdl, boolean enk, int yl, String ykt) {
        model=mdl;
        elektrikliMi=enk;
        yil=yl;
        yakit=ykt;
    }

    public Volvo(){

    }



    private int maxHizAta() {
        int maxHiz=0;
        if (elektrikliMi){
            maxHiz=160;
        }else {
            maxHiz=240;
        }
        return maxHiz ;
    }

    private boolean otomatikPilotSorgusu(boolean elektrikliMi) {
        boolean sonuc =false;
        if(elektrikliMi){
            sonuc=true;
        }
   return sonuc;
    }
    public String toString(){
        String arabaOzellikleri="model :"+model +
                                " yakit :"+yakit +
                                " Max hiz :"+maxHiz    ;



        return arabaOzellikleri;
    }
}
