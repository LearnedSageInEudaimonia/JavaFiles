package Generics;

public class SimpleTwoGen {
    public static void main(String[] args) {
        TwoGen<Integer,String> tgobj = new TwoGen<Integer,String>(88, "Generics");

        tgobj.showtype();

        int v = tgobj.getOb1();

        System.out.println("Value: " + v);

        String t = tgobj.getOb2();

        System.out.println("Value: " + t);


    }
}
