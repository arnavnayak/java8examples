package java8way.predefinedfunctionalinterfaces.predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class DemoPredicateExampleThree {

    public static void main(String[] args){
        Predicate<Collection> p = c->c.isEmpty();
        List list1 = new ArrayList();
        list1.add("Some Value");
        System.out.println("result : " +p.test(list1));
        List list2 = new ArrayList();
        System.out.println("result : " +p.test(list2));
    }
}
