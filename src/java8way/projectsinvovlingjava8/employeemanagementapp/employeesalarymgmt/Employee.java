package java8way.projectsinvovlingjava8.employeemanagementapp.employeesalarymgmt;

public class Employee {

    private int empId;
    private String name;
    private double dailyWage;

    public Employee(int empId, String name, double dailyWage) {
        this.empId = empId;
        this.name = name;
        this.dailyWage = dailyWage;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDailyWage() {
        return dailyWage;
    }

    public void setDailyWage(double dailyWage) {
        this.dailyWage = dailyWage;
    }
}
