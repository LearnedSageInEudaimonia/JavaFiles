package Interfaces.Nested;

public class NestedIfDemo {
    public static void main(String[] args) {
        A.NestedIf nif = new B();
        if(nif.isNotNegative(7)){
            System.out.println("it is not negative");
        }
        if(nif.isNotNegative(-7)){
            System.out.println("No Display");
        }
    }
}
