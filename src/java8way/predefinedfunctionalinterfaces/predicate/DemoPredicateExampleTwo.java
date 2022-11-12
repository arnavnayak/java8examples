package java8way.predefinedfunctionalinterfaces.predicate;

import java.util.function.Predicate;

public class DemoPredicateExampleTwo {

    public static void main(String[] args){
        Predicate<String> p = s->s.length()>5;
        System.out.println("result : "+ p.test("abcdefg"));
        System.out.println("result : "+ p.test("abc"));
    }
}
