package java8way.predefinedfunctionalinterfaces.consumer.biconsumer;

import java.util.function.BiConsumer;

public class DemoBiConsumerTakeTwoStringValuesAndConcatenate {

    public static void main(String[] args) {
        BiConsumer<String,String> biConsumer = (a,b)-> System.out.println(a+b);
        biConsumer.accept("Hello ","Arnav!!");
    }
}
