package java8way.mutithread.methodreference;

public class DemoMethodReferenceRunnable {

        //an alternative to lambda
        public static void main(String[] args) {
            Runnable r = DemoMethodReferenceRunnable::m1;
            Thread thread = new Thread(r);
            thread.start();
            DemoMethodReferenceRunnable demoMethodReferenceRunnable = new DemoMethodReferenceRunnable();
            Runnable r1 =  demoMethodReferenceRunnable::m2;
            Thread thread1= new Thread(r1);
            thread1.start();
            for (int i=0;i<10;i++){
                System.out.println("Main thread");
            }

        }
        //static method
        public static void m1(){
            for(int i=0;i<10;i++){
                System.out.println("Child thread");
            }
        }
        //normal method
        public void m2(){
        for(int i=0;i<10;i++){
            System.out.println("Child another thread");
        }
    }
}
