package java8way.predefinedfunctionalinterfaces.function.bifunction;

import java8way.predefinedfunctionalinterfaces.function.studentgrade.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class DemoBiFunctionForCreatingStudentObjects {

    public static void main(String[] args) {

        List<Student> students =  new ArrayList<>();
        BiFunction<String,Integer, Student> biFunction = (name,mark) -> new Student(name,mark);
        students.add(biFunction.apply("Arnav",100));
        students.add(biFunction.apply("Neil",60));
        students.add(biFunction.apply("NeilArnav",30));

        students.stream().forEach(System.out::println);

    }
}
