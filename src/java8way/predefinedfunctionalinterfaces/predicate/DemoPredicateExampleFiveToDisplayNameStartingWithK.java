package java8way.predefinedfunctionalinterfaces.predicate;

import java.util.function.Predicate;

public class DemoPredicateExampleFiveToDisplayNameStartingWithK {

    public static void main(String[] args){

        String[] names = {"Arnav","Neil","Kiran","Ram","Keshav","kelly"};
        Predicate<String> nameStartsWithK= name->name.startsWith("K") || name.startsWith("k");
        System.out.println("names starts with K:----");
        nameStartsWithK(nameStartsWithK,names);

    }
    public static void nameStartsWithK(Predicate<String> nameStartsWithK,String[] names){
        for(String name:names){
            if(nameStartsWithK.test(name)){
                System.out.println(name);
            }
        }
    }

}
