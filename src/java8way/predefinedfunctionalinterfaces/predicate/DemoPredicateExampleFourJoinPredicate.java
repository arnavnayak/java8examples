package java8way.predefinedfunctionalinterfaces.predicate;

import java.util.function.Predicate;

public class DemoPredicateExampleFourJoinPredicate {

    public static void main(String[] args){

        int[] x = {0,5,10,15,20,25,30};
        Predicate<Integer> p1 = i->i>10;
        Predicate<Integer> p2 = i->i%2 == 0;
        System.out.println("the number greater than 10 are:--");
        m1(p1,x);
        System.out.println("the number less than 10 are:--");
        m1(p1.negate(),x);
        System.out.println("the even numbers are:--");
        m1(p2,x);
        System.out.println("the odd numbers are:--");
        m1(p2.negate(),x);
        System.out.println("the number greater than 10 and even numbers are:--");
        m1(p1.and(p2),x);
        System.out.println("the number greater than 10 and odd numbers are:--");
        m1(p1.and(p2.negate()),x);
        System.out.println("the number greater than 10 or even numbers are:--");
        m1(p1.or(p2),x);
        System.out.println("the number greater than 10 or odd numbers are:--");
        m1(p1.or(p2.negate()),x);
    }

    public static void m1(Predicate<Integer> p,int[] x){

        for(int x1:x){
            if(p.test(x1)){
                System.out.println(x1);
            }
        }
    }

}
