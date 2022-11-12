package java8way.predefinedfunctionalinterfaces.predicate;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

public class DemoPredicateExampleOne {

    public static void main(String[] args){

        Predicate<Integer> p = i -> i>50;
        System.out.println("result is : "+p.test(100));
        System.out.println("result is : "+p.test(10));

        //using IntPredicate
        IntPredicate ip = i->i>50;
        System.out.println("result is : "+ip.test(60));
        System.out.println("result is : "+ip.test(30));

        //using LongPredicate
        LongPredicate lp = i->i>50;
        System.out.println("result is : "+lp.test(60));
        System.out.println("result is : "+lp.test(30));

        //using doublePredicate
        DoublePredicate dp = i->i>50;
        System.out.println("result is : "+dp.test(60));
        System.out.println("result is : "+dp.test(30));
    }
}
