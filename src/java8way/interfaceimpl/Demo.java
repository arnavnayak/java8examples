package java8way.interfaceimpl;

public class Demo {

    public static void main(String [] args){
        Interf i = x->x*x;
        System.out.println("square in java8 way : "+ i.squareIt(2));
    }


}
