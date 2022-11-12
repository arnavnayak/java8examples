package java8way.collections;

public class Employee {

    private Integer eno;
    private String ename;

    public Employee(Integer eno, String ename) {
        this.eno = eno;
        this.ename = ename;
    }

    public Integer getEno() {
        return eno;
    }

    public String getEname() {
        return ename;
    }

    public void setEno(Integer eno) {
        this.eno = eno;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    @Override
    public String toString() {
        return eno+":"+ename;
    }
}
