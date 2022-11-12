package java8way.predefinedfunctionalinterfaces.function.bifunction;

import java.util.function.BiFunction;

public class DemoBiFunctionProductOfTwoNumberAndReturnIt {

    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> biFunction = (a,b) -> a*b;

        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);
        System.out.printf("product of two number : %d * %d = %d ",a,b,biFunction.apply(a,b));
    }
}
