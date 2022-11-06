package constructor;

public class VolvoRunner {
    public static void main(String[] args) {
        Volvo arb1=new Volvo();
        System.out.println(arb1.marka);
        arb1.yakit="Dizel";
        arb1.elektrikliMi=false;
        System.out.println(arb1.maxHiz);//240
        System.out.println(arb1.toString());// model :null yakit :Dizel Max hiz :240

        Volvo arb2=new Volvo();
        arb2.yakit="Elektrikli";
        arb2.elektrikliMi=true;
        arb2.model="XC90";
        System.out.println();
    }
}
