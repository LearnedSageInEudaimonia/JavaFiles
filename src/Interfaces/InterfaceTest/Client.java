package Interfaces.InterfaceTest;

public class Client implements Callback {

    @Override
    public void callback(int p) {
        System.out.println("CallBack called with "+ p);
    }
}
