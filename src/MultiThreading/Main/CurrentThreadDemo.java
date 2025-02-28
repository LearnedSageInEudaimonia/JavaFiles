package MultiThreading.Main;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = new Thread();
        System.out.println("Current Thread: " + t);
        t.setName("My Thread");
        System.out.println("After Name Changed: "+ t);
        try{
            for(int i = 5 ; i>0 ; i--){
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted");
        }
    }
}
