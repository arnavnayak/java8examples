package normalway;

public class InterfRunnableImpl implements Runnable{

    public void run(){
        //runnable method to be called by child thread
        for(int i=0;i<10;i++){
            System.out.println("child thread from Normal way");
        }
    }
}
