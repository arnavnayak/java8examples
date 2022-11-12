package java8way.projectsinvovlingjava8.employeemanagementapp.employeedatamgmt;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeManagementApp {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        populate(employeeList);
        System.out.println(employeeList);

        //fetching employees with manager designation
        Predicate<Employee> isManagerDesignation = (e) -> e.getDesignation().equalsIgnoreCase("Manager");
        List<Employee> employeeMatchingManageDesignation = employeeList.stream().filter(isManagerDesignation).collect(Collectors.toList());
        System.out.println("Employee with manager as designation");
        System.out.println(employeeMatchingManageDesignation);

        //fetching employees with bengaluru location
        Predicate<Employee> isBengaluruLocation = (e) -> e.getCity().equalsIgnoreCase("Bengaluru");
        List<Employee> employeeMatchingBengaluruLocation = employeeList.stream().filter(isBengaluruLocation).collect(Collectors.toList());
        System.out.println("Employee with Bengaluru as city");
        System.out.println(employeeMatchingBengaluruLocation);

        //fetching employees with salary less than 55000 and give increment of 5000 using FUNCTION
        Predicate<Employee> isSalaryLessThanFiftyFiveKPredicate = e -> {
            if (e.getSalary() <= 55000) {
                e.setSalary(e.getSalary() + 50000);
                return true;
            }
            return false;
        };
        Function<Employee, Employee> incrementSalaryFunction = e -> {
            e.setSalary(e.getSalary() + 5000);
            return e;
        };
        for (Employee e : employeeList) {
            if (isSalaryLessThanFiftyFiveKPredicate.test(e)) {
                incrementSalaryFunction.apply(e);
            }
        }
        System.out.println("salary increment using function :-- ");
        System.out.println(employeeList);


        //fetching employees with salary less than 166000 and give increment of 5000 the calculation is also based on the previous incremented salary
        Predicate<Employee> isSalaryLessThanSixtySixK = e -> {
            if (e.getSalary() <= 166000) {
                return true;
            }
            return false;
        };
        Predicate<Employee> isSalaryLessThan116KPredicate = e -> {
            if (e.getSalary() <= 166000) {
                e.setSalary(e.getSalary() + 50000);
                return true;
            }
            return false;
        };

        List<Employee> employeeMatchingLessThanOneSixtySixKSalaryWithAddedBonus = employeeList.stream().filter(isSalaryLessThanSixtySixK).map(incrementSalaryFunction).collect(Collectors.toList());
        System.out.println("employee with less than 66K salary after getting bonus of 50000");
        System.out.println(employeeMatchingLessThanOneSixtySixKSalaryWithAddedBonus);

        //fetching employee who should be manager and from bengaluru
        //have used conditional here also we can use predicate3 = predicate1.AND(predicate2); similarly we can use for OR condition
        Predicate<Employee> isManagerDesignationAndCityBengaluru = e -> e.getDesignation().equalsIgnoreCase("Manager") && e.getCity().equalsIgnoreCase("Bengaluru");
        List<Employee> employeeMatchingLCityBLRAndDesignationAsManager = employeeList.stream().filter(isManagerDesignationAndCityBengaluru).collect(Collectors.toList());
        System.out.println("Employee with manager as designation and city as Bengaluru");
        System.out.println(employeeMatchingLCityBLRAndDesignationAsManager);


    }
    private static void populate(List<Employee> employeeList) {
        employeeList.add(new Employee("Arnav","Software Engineer",11000,"Rourkela"));
        employeeList.add(new Employee("Saloni","Junior Software Engineer",50000,"Nandurbar"));
        employeeList.add(new Employee("Sahana","Software Engineer",600000,"Udupi"));
        employeeList.add(new Employee("Madhuri","Manager",400000,"Bengaluru"));
        employeeList.add(new Employee("Pavan","Senior Tech Lead",300000,"Bengaluru"));
        employeeList.add(new Employee("Srikanth","Manager",350000,"Bengaluru"));
    }
}