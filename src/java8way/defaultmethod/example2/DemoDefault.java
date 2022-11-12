package java8way.defaultmethod.example2;

public class DemoDefault implements Left,Right {

    public void m1(){
        //some custom implementation
        System.out.println("Overriding given impl. with custom impl.!!");

        //Impl. from Left
        Left.super.m1();

        //Impl. from Right
        Right.super.m1();
    }

    public static void main(String [] args){
        DemoDefault d = new DemoDefault();
        d.m1();
    }
}
