package java8way.mutithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DemoExecutorServiceFetchingThreadName{


    public static void main(String[] args) {
        //implementing ExecutorService
        ExecutorService executorService1 = Executors.newSingleThreadExecutor(); //Creates //a ExecutorService object having a single thread.

        ExecutorService executorService2 = Executors.newFixedThreadPool(10);  // Creates a //ExecutorService object having a pool of 10 threads.

        ExecutorService executorService3 = Executors.newScheduledThreadPool(10); //Creates a scheduled thread pool executor with 10 threads. In scheduled thread //pool, we can schedule tasks of the threads.
        executorService1.submit(() -> {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName);

        });
        executorService1.shutdown();

        executorService2.submit(() -> {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName);

        });
        executorService2.shutdown();

        executorService3.submit(() -> {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName);

        });
        executorService3.shutdown();
    }
}
