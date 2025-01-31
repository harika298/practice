package classes.streams;

public class Empdata1 {
    private String empname;
    private String designation;

    public Empdata1() {
    }

    public Empdata1(String empname, String designation) {
        this.empname = empname;
        this.designation = designation;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Empdata1{" +
                "empname='" + empname + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
