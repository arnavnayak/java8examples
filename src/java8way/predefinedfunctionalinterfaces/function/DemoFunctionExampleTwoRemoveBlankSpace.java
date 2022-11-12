package java8way.predefinedfunctionalinterfaces.function;

import java.util.function.Function;

public class DemoFunctionExampleTwoRemoveBlankSpace {

    // to remove blank spaces from a given string.
    public static void main(String[] args){
        Function<String, String> f= s->s.replaceAll(" ","");
        String name = "Manoj Kumar Nayak";
        System.out.println("After removing spaces : "+f.apply(name));
    }

}
