package java8way.projectsinvovlingjava8.employeemanagementapp.employeesalarymgmt;

public class TimeSheet {

    private int empId;
    private int days;

    public TimeSheet(int empId, int days) {
        this.empId = empId;
        this.days = days;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
