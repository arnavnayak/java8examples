package java8way.mutithread;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DemoRunnable {

    //main thread
    public static void main(String args []){
        Runnable r = ()->{
          for (int j =0;j<10;j++){
              System.out.println("Child thread run with lambda");
          }
        };
        //child thread
        Thread thread =  new Thread(r);
        thread.start();
        for (int i=0;i<10;i++){
            System.out.println("Main thread run with lambda");
        }
    }

}
