package Generics;

public class NonGen {
   Object ob;

    public NonGen(Object ob) {
        this.ob = ob;
    }

    public Object getOb() {
        return ob;
    }

    void showtype(){
        System.out.println("Type of object is : " + ob.getClass().getName());
    }
}
