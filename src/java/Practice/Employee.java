package java.Practice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Employee {

    public int empId;
    public String name;
    public int salary;
    public String role;
    public int age;
    public String gender;

    public Employee(int empId, int age) {
        this.empId = empId;
        this.age = age;
    }
    public Employee(int empId, String name, int age, String gender, int salary){
        this.empId = empId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public Employee() {
    }

    public Employee(String name, int empId, int salary, String role, int age, String gender) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
        this.role = role;
        this.age = age;
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String ffrvtg) {
        this.name = ffrvtg;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }
    Map<Integer,Integer> finalResult = new HashMap<>();
    public Map<Integer,Integer> getHighestSalary(List<Employee> employeesList){
        int highestSal = 0;
        Map<Integer,Integer> finalResult = new HashMap<>();
        for(int i=0; i<employeesList.size(); i++){
            Employee result = employeesList.get(i);
           int currSal = result.getSalary();
           if(highestSal < currSal){
               finalResult = new HashMap<>();
               finalResult.putIfAbsent(result.getEmpId(),currSal);
               highestSal = currSal;
           }

        }
        return finalResult;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", role='" + role + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
