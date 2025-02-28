package Interfaces.InterfaceTest;

public class TestInterface {
    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(90);
        Callback ob = new AnotherClient();
        c= ob;
        c.callback(90);
    }
}
