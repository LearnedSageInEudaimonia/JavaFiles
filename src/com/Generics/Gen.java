package Generics;

public class Gen<X> {
    X ob;

    public Gen(X ob) {
        this.ob = ob;
    }
    X getOb(){
        return ob;
    }

    void showtype(){
        System.out.println("Type of X is " + ob.getClass().getName());
    }


}
