package Generics;

public class NonGenDemo {
    public static void main(String[] args) {

        NonGen iob = new NonGen(88);

        iob.showtype();

        int v = (int) iob.getOb();
        System.out.println("Value :" + v);
        System.out.println();

        NonGen strob = new NonGen("Generics Test");
        strob.showtype();

        String str = (String) strob.getOb();

        System.out.println("Value:" + str);

        iob = strob;

    }
}
