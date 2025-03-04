package MultiThreading.Main;

public class NewThread implements Runnable{

    Thread t;
    NewThread(){
        t = new Thread(this, "Demo");
        System.out.println("Child : "+ t);

    }

    @Override
    public void run() {
        try{
            for(int i = 5; i>0;i--){
                System.out.println("Child Thread: "+ i);
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e){
            System.out.println("Child Interrupted");
        }
        System.out.println("Exiting child Thread");
    }
}
