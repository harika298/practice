import classes.Dell;

public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.setName("Jack");
        emp1.setAge(23);

        Employee emp3 = new Employee("Anil",25);

        System.out.println(emp1.getAge());

        Employee emp2 = new Employee();
        emp2.setName("Jack");
        emp2.setAge(25);

        String s = emp2.getName();

        System.out.println(emp2.getAge());
    }
}