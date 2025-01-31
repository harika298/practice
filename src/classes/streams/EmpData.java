package classes.streams;

public class EmpData {
    private String empName;
    private Double salary;

    public EmpData() {
    }

    public EmpData(String empName, Double salary) {
        this.empName = empName;
        this.salary = salary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmpData{" +
                "empName='" + empName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
