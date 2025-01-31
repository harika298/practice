package java.org.cars.example;

public class Employee{

    private int empId;
    private String empName;
    private double empSalary;
    private int yearOfJoining;

    public Employee() {
    }

    public Employee(int empId, String empName, double empSalary, int yearOfJoining) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
        this.yearOfJoining = yearOfJoining;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                ", yearOfJoining=" + yearOfJoining +
                '}';
    }

    //Method Definition
    public double calculateHike(double empsal){
       double hike= (empsal*10)/100;
       return hike;
    }

}
