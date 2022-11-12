package java8way.predefinedfunctionalinterfaces.function;

import java.util.function.Function;

public class DemoFunctionExampleThreeCountSpaces {

    // to count blank spaces from a given string.
    public static void main(String[] args){
        Function<String, Integer> f= s->s.length() - s.replaceAll(" ","").length();
        String name = "Manoj Kumar Nayak";
        System.out.println("total spaces present : "+f.apply(name));
    }
}
