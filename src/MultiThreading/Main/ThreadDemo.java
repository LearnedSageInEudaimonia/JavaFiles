package MultiThreading.Main;

public class ThreadDemo {
    public static void main(String[] args) {
        NewThread nt = new NewThread();
        nt.t.start();
        try{
            for(int i = 5; i>0;i--){
                System.out.println("Main Thread: "+ i);
                Thread.sleep(1000);

            }
        }
        catch (InterruptedException e){
            System.out.println("Main Thread Interrupted");
        }
        System.out.println("Main Thread Existing");
    }
}
