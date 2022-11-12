package java8way.predefinedfunctionalinterfaces.function.studentgrade;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class DemoFunctionExampleFourStudentGradeCalc {

    public static void main(String[] args){

        List<Student> studentList = new ArrayList<>();
        populateStudents(studentList);
        Function<Student,String> sf = s-> {
          if(s.getMark()>=90){
              return "Distinct";
          }else if(s.getMark()>=80) {
              return "First class";
          }else if(s.getMark()>=70){
                  return "Second class";
          }else if(s.getMark()>=60){
              return "Third class";
          }else{
              return "Failed";
          }
        };

        for (Student student:studentList) {
            System.out.println("name : "+student.getName());
            System.out.println("grade : "+sf.apply(student));
        }

    }

    private static void populateStudents(List<Student> studentList) {

        Student student1 = new Student("Arnav",55);

        Student student2 = new Student("Neil",25);

        Student student3 = new Student("ArnavNayak",75);

        Student student4 = new Student("NayakArnav",65);

        Student student5 = new Student("ArnavNayakNeil",85);

        Student student6 = new Student("Babunu",95);

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
    }
}
