package Generics;

public class WildCardDemo {
    public static void main(String[] args) {
        Integer[] inums = { 1,2,3,4,5};
        Stats<Integer> iob = new Stats<>(inums);
        System.out.println("iob average is : " + iob.average());


        Double[] dnums = { 1.0,2.0,3.0,4.0,5.0};
        Stats<Double> dob = new Stats<>(dnums);
        System.out.println("dob average is : " + dob.average());

        System.out.print("Averages of iob and dob ");
        if(iob.sameAvg(dob)){
            System.out.println("are the same");
        }
        else {
            System.out.println("differ");
        }

    }
}
