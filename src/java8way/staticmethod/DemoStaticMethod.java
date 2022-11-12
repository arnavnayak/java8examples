package java8way.staticmethod;

public class DemoStaticMethod implements Interf{

    public static void main(String[] args){
        DemoStaticMethod d= new DemoStaticMethod();
//        d.m1();  //it will give compile time error we cannot call with object reference the static method
//        DemoStaticMethod.m1(); //it will give compile time error we cannot call with class reference the static method

        //only way we can call a static method is through interface name directly
        Interf.m1();

    }
}
