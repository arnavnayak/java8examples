package normalway;

public class DemoRunnable {
    //main thread
    public static void main(String args[]){
        Runnable r = new InterfRunnableImpl();
        //child thread
        Thread thread = new Thread(r);
        thread.start();
        for (int j=0;j<10;j++){
            System.out.println("main thread from Normal way");
        }
    }
}
