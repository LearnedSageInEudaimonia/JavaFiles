package Generics;

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iob;

        iob = new Gen<>(88);

        iob.showtype();

        int v = iob.getOb();

        System.out.println("value:"+ v);

        System.out.println();

        Gen<String> strob = new Gen<String>("Generics Test");

        strob.showtype();

        String str = strob.getOb();

        System.out.println("Value:"+ str);
    }
}
