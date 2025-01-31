package classes;

public class Employee {

    private int epmId;
    private String email;
    private long PhoneNumber;
    private double salary;

    public Employee() {
    }

    public Employee(double salary, long phoneNumber, String email, int epmId) {
        this.salary = salary;
        PhoneNumber = phoneNumber;
        this.email = email;
        this.epmId = epmId;
    }

    public int getEpmId() {
        return epmId;
    }

    public void setEpmId(int epmId) {
        this.epmId = epmId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "epmId='" + epmId + '\'' +
                ", email='" + email + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
