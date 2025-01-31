package java.Practice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestEmployee {
    public static void main(String[] args) {
        List<Employee> employeeList = List.of(new Employee(1, "harika", 87, "Female", 60000),
                new Employee(2, "yogesh", 78, "Male", 80000),
                new Employee(3, "pradeep", 23, "Male", 20000),
                new Employee(4, "Amardeep", 65, "Male", 100000),
                new Employee(5, "yathra", 90, "Female", 50000),
                new Employee(6, "sobhita", 35, "Female", 10000),
                new Employee(7, "Abhay", 40, "Male", 45000));

        //group the employees and get the details of employees below 50k and add it to a list
        Map<String, String> fullNameList =
                Map.of("sobhita", " saladi", "Abhay", " lokavarapu", "pradeep", " makireddy", "Amardeep", "tcuk");
        List<Employee> employessBelowFifty = employeeList.stream()
                        .filter(emp -> emp.getSalary() < 50000)
                        .map(n-> {
                            n.setName(n.getName() + fullNameList.get(n.getName()));
                            return n;
                        })
                        .toList();
        System.out.println(employessBelowFifty);



        double minSal = 20000;
        double maxSal = 80000;
        List<Employee> filteredSal = employeeList.stream()
                .filter(employee -> employee.getSalary() >= minSal && employee.getSalary() <= maxSal).toList();
        filteredSal.forEach(employee -> System.out.println(employee.getName() + "->" + employee.getSalary()));

        List<Employee> filteredNames = employeeList.stream().filter(employee -> employee.getName().startsWith("y")).toList();
        filteredNames.forEach(employee -> System.out.println(employee.getName()));

        List<Employee> filteredAges = employeeList.stream().filter(employee -> employee.getAge() < 70).toList();
        filteredAges.forEach(employee -> System.out.println(employee.getName() + " " + employee.getAge()));


        Map<String, Integer> genderCount = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()))
                .entrySet().stream()
                .collect(Collectors.toMap(m -> m.getKey(), n -> n.getValue().intValue()));

        Map<String, Double> averageSal = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));

        Map<String, Double> sumSal = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.summingDouble(Employee::getSalary)));

        System.out.println(genderCount);
        System.out.println(averageSal);
        System.out.println(sumSal);
    }
}
