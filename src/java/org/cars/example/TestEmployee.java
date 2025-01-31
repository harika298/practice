package java.org.cars.example;/*
package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class TestEmployee {
    public static void main(String[] args) {
        Bank bank = new HDFCBank();
        float roiRes = bank.calculateInterest(123.76f);
//        System.out.println(roiRes);

        Employee obj = new Employee();
        double hikeRes = obj.calculateHike(33.89);
//        System.out.println(hikeRes);

        Bank bank1 = new SBIBank();
//        System.out.println(bank1.calculateInterest(2234.56F));

        List<Employee> employees = Arrays.asList(
                new Employee(1,"Harika",20000,2013),
                new Employee(2,"Anil",30000,1994),
                new Employee(3,"Minnu",40000,2003),
                new Employee(4,"Akd",60000,2024),
                new Employee(3,"kasdjl",40000,2003),
                new Employee(4,"Abhay",50000,2024)
        );


        //name starts with 'A' and YOJ between 2000-2024, return empName and sal*5;
        //<2000 -2024>  x>=2000 && x<=2024
        Map<Double,String>  finalEmployees = employees.stream()
                .filter(n -> n.getEmpName().startsWith("A"))
                .filter(m -> m.getYearOfJoining()>=2000 && m.getYearOfJoining()<=2024)
                .collect(Collectors.toMap(n1 -> n1.getEmpSalary()*5, Employee::getEmpName));
//        System.out.println(finalEmployees);

      List<EmployeeDetails> empData = employees.stream()
                .filter(n -> n.getEmpName().startsWith("A"))
                .filter(m -> m.getYearOfJoining()>=2000 && m.getYearOfJoining()<=2024)
                .map(employee -> {
                    EmployeeDetails employeeDetails = new EmployeeDetails();
                    employeeDetails.setEmpName(employee.getEmpName());
                    employeeDetails.setEmpSal(employee.getEmpSalary()*5);
                    return employeeDetails;
                }).toList();
        System.out.println(empData);



        int specificYear = 2024;

       List<Employee> employeeList = employees.stream()
               .filter(employee -> employee.getYearOfJoining() == specificYear)
               .collect(Collectors.toList());
//        System.out.println(employeeList);

       List<Double> employees1 = employees.stream()
                .map(Employee::getEmpSalary).toList();
       employees1.add("ksjd");
       employees1.add(125712);
       employees1.add(12.23232);


//        System.out.println(employees1);

    }
}
class EmployeeDetails {

    private String empName;
    private Double empSal;

    public EmployeeDetails() {
    }

    public EmployeeDetails(String empName, Double empSal) {
        this.empName = empName;
        this.empSal = empSal;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Double getEmpSal() {
        return empSal;
    }

    public void setEmpSal(Double empSal) {
        this.empSal = empSal;
    }

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "empName='" + empName + '\'' +
                ", empSal=" + empSal +
                '}';
    }
}
*/
