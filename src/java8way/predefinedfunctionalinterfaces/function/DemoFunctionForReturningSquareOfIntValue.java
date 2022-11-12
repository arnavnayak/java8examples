package java8way.predefinedfunctionalinterfaces.function;

import java.util.function.IntFunction;
import java.util.function.ToLongFunction;

public class DemoFunctionForReturningSquareOfIntValue {

    public static void main(String[] args) {
        IntFunction<Integer> intFunction = i->i*i;
        System.out.println(intFunction.apply(10));

        ToLongFunction<Integer> longFunction = i-> i * i;
        System.out.println(longFunction.applyAsLong(10));

    }
}
