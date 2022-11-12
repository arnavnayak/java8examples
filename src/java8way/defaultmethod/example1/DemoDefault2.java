package java8way.defaultmethod.example1;

public class DemoDefault2 implements Interf{

    @Override
    public void m1(){
        System.out.println("overriding the default method with customer method");
    }

    public static void main(String args[]){
        DemoDefault2 d = new DemoDefault2();
        d.m1();
        Interf i = new DemoDefault2();
        i.m1();
    }
}
