import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        int c = read.nextInt();
        c= a+b;
        a=b-c;
        c=a*b;
        System.out.println(a +" "+ b+" "+ c);


    }
}
