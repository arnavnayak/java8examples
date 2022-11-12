package java8way.predefinedfunctionalinterfaces.consumer;

import java.util.function.Consumer;

public class DemoConsumerExampleOne {

    public static void main(String[] args){

        Consumer<String> c = s->System.out.println(s);
        Consumer<String> c1 = s->System.out.println(s.length());
        c.accept("Hello");
        c1.accept("Hello");

    }
}
