package java8way.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class DemoToReturnNAmesWithMoreThanFiveCharacterInStream {

    public static void main(String[] args) {
        List<String> listNames = new ArrayList<>();
        listNames.add("Arnav");
        listNames.add("babunu");
        listNames.add("ArnavNayak");
        listNames.add("Neil");
        listNames.add("NeilArnav");

        List<String> modifiedNameList = listNames.stream().filter(n->n.length() > 5).collect(Collectors.toList());
        System.out.println(modifiedNameList);

        List<String> modifiedNAmeListWIthMap = listNames.stream().map(s->s.toUpperCase(Locale.ROOT)).collect(Collectors.toList());
        System.out.println(modifiedNAmeListWIthMap);

        List<String> modifiedNAmeListWIthMapAndFilter = listNames.stream().filter(i->i.length()>5).map(s->s.toUpperCase(Locale.ROOT)).collect(Collectors.toList());
        System.out.println(modifiedNAmeListWIthMapAndFilter);

    }
}
