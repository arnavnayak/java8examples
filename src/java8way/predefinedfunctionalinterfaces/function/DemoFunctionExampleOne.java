package java8way.predefinedfunctionalinterfaces.function;

import java.util.function.Function;
import java.util.function.ToIntFunction;

public class DemoFunctionExampleOne {

    //To find the length of a string and return it using function functional interface
    public static void main(String[] args){
        String name = "Arnav";
        Function<String,Integer> f =  s->s.length();
        lengthOfString(f,name);

        //using ToIntFunction
        ToIntFunction<String> integerToIntFunction = s->s.length();
        System.out.println("Length of the string using integerToIntFunction : "+integerToIntFunction.applyAsInt("HelloWorld"));

    }
    
    public static void lengthOfString(Function<String,Integer> f, String s){
        Integer length = f.apply(s);
        System.out.println("Length of the string : "+length);
    }

}
