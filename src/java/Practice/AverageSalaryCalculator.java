package java.Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AverageSalaryCalculator {
    public static void main(String args[]){

        List<Employee> employees = Arrays.asList(
                new Employee("harika",1,20000,"Developer",30,"male"),
                new Employee("anil",2,30000,"Tester",30,"female"),
                new Employee("swapna",3,40000,"Manager",30,"female"),
                new Employee("sai",4,50000,"Senior Software",30,"male"),
                new Employee("viswa",5,60000,"Lead",30,"male"));

//        Double averageSalary = employees.stream().collect(Collectors.averagingDouble(Employee::getSalary));
//
//        System.out.println("The average salary is " + averageSalary);
        try{
            Employee SecondHigh = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst().orElseThrow(()->new Exception("Second Highest Salary not found"));
            System.out.println("Employee with the second highest salary is "+ SecondHigh);
        }catch (Exception e){
            System.out.println(e.getMessage());

        }
    }
}
