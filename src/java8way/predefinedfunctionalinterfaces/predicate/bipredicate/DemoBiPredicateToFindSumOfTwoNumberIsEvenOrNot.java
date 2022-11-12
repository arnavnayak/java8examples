package java8way.predefinedfunctionalinterfaces.predicate.bipredicate;

import java.util.function.BiPredicate;

public class DemoBiPredicateToFindSumOfTwoNumberIsEvenOrNot {

    public static void main(String[] args) {

        BiPredicate<Integer,Integer> biPredicate = (a,b)-> (a+b)%2 == 0;
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);
        if(biPredicate.test(a,b)){
            System.out.printf("Sum is even number : %d",a+b);
        }else{
            System.out.printf("Sum is odd number : %d",a+b);
        }
    }
}
