package Interfaces.InterfaceTest;

public class AnotherClient implements Callback {
    @Override
    public void callback(int p) {
        System.out.println("In Another client" + p*p);
    }
}
