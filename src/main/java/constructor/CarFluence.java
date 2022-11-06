package constructor;

public class CarFluence {

    String model;
    int km ;
    int tekerSayisi=4;
    boolean motorVarmi;

    public CarFluence(String Model,int Km){
        model=Model;
        km=Km;
    }
    public CarFluence(String model,int km,int tekerSayisi){
        this.model=model;
        this.km=km;
        this.tekerSayisi=tekerSayisi;

    }
    public CarFluence(String model,int km,int tekerSayisi,boolean motorVarmi){
        this.model=model;
        this.km=km;
        this.tekerSayisi=tekerSayisi;
        this.motorVarmi=motorVarmi;

    }

}
