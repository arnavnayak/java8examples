package java8way.predefinedfunctionalinterfaces.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class DemoPredicateExampleSixToRemoveNullOrEmptyString {

    public static void main(String[] args){
        String[] stringOfNames = {"Arnav","Neil","","Nayak",null,"Kiran"};
        Predicate<String> removeNullEmptyValuePredicate = s->s == null || s.isEmpty();
        removeNullOrEmptyString(removeNullEmptyValuePredicate,stringOfNames);
    }
    public static void removeNullOrEmptyString(Predicate<String> p,String[] stringOfNames){

        List<String> listOfNames = new ArrayList<>();
        for(String s:stringOfNames){
            if(!(p.test(s))){
                listOfNames.add(s);
            }
        }
        System.out.println(listOfNames);
    }
}
