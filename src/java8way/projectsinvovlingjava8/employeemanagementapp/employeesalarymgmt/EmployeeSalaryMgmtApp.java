package java8way.projectsinvovlingjava8.employeemanagementapp.employeesalarymgmt;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeSalaryMgmtApp {

    public static void main(String[] args) {

        //employee details
        List<Employee> employeeList = new ArrayList<>();
        employeeList = employeeDetails(employeeList);

        //timesheet details
        List<TimeSheet> timesheetList = new ArrayList<>();
        timesheetList = timesheetDetails(timesheetList);

        //bifunction to take the employee timesheet details calculate and return the salary for a months based on timesheet
        BiFunction<Employee,TimeSheet,Double> calcSalBasedOnTimeSheetAndDailyWage = (emp,timesheet)->{
            return emp.getDailyWage()*timesheet.getDays();
        };

        for (Employee emp:employeeList ){
            for(TimeSheet timesheet:timesheetList) {
                if(emp.getEmpId() == timesheet.getEmpId()) {
                    System.out.println("Salary of " + emp.getName() + " in month end : " + calcSalBasedOnTimeSheetAndDailyWage.apply(emp, timesheet));
                }
            }
        }

    }

    private static List<TimeSheet> timesheetDetails(List<TimeSheet> timesheetList) {
        TimeSheet timeSheet1 = new TimeSheet(1,25);
        TimeSheet timeSheet2 = new TimeSheet(2,24);
        TimeSheet timeSheet3 = new TimeSheet(3,30);
        timesheetList.add(timeSheet1);
        timesheetList.add(timeSheet2);
        timesheetList.add(timeSheet3);
        return  timesheetList;
    }

    private static List<Employee> employeeDetails(List<Employee> employeeList) {
        Employee employee1 = new Employee(1,"Arnav Nayak",2200);
        Employee employee2 = new Employee(2,"Ashish Patra",2100);
        Employee employee3 = new Employee(3,"Himanshi Jain",2300);
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        return employeeList;
    }
}
