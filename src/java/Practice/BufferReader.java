package java.Practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


class Customer {
    private int id;
    private String name;
    private int age;
    private double sal;
    private Date doj;

    private Address address;
    private Department department;

    public Customer() {
    }

    public Customer(int id, String name, int age, double sal, Date doj, Address address, Department department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sal = sal;
        this.address = address;
        this.doj = doj;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sal=" + sal +
                ", doj=" + doj +
                ", address=" + address +
                ", department=" + department +
                '}';
    }
}

class Department {

    private int deptId;
    private String deptName;

    public Department() {
    }

    public Department(int deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}

class Address {
    private String address;
    private String pin;

    public Address() {
    }

    public Address(String address, String pin) {
        this.address = address;
        this.pin = pin;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                ", pin='" + pin + '\'' +
                '}';
    }
}

public class BufferReader {

    public static void main(String[] args) throws IOException, ParseException {

        List<Customer> customerList = readFile("C:\\Users\\ADMIN\\IdeaProjects\\untitled\\src\\main\\java\\Practice\\FileReader.txt");

        List<Double> filteredSalaries = customerList.stream()
                .filter(eachCustomer -> eachCustomer.getSal() >= 40000 && eachCustomer.getSal() <= 70000)
                .map(Customer::getSal)
                .toList();

        System.out.println(filteredSalaries);

        Map<Integer, List<Customer>> groupedCustomers = groupCustomers(customerList);

        Map<Integer, Double> averageSal = avgSalary(groupedCustomers);

        System.out.println(averageSal);

        List<String> customerDataRes = getCustomerNameAndAge(customerList);

        System.out.println(customerDataRes);

    }
    private static List<String> getCustomerNameAndAge (List<Customer> customerList){
        List<String> list = new ArrayList<>();
        for(int i = 0 ; i < customerList.size() ; i++){
            Customer customer = customerList.get(i);
            if(customer.getAge() < 40){
                String str = customer.getName() + " => " + customer.getAge();
                list.add(str);
            }else{
                System.out.println("customer "  + customer.getName() + " age is greater than 40");
            }
        }
        List<String> custList = customerList.stream().filter(customer -> customer.getAge() < 40)
                .map(customerDetails -> customerDetails.getName() + " => " + customerDetails.getAge())
                .collect(Collectors.toList());

        System.out.println(custList);

        return list;
    }

    private static Map<Integer, Double> avgSalary(Map<Integer, List<Customer>> groupedCustomers) {
        Map<Integer, Double> map = new HashMap<>();
        for (Map.Entry<Integer, List<Customer>> eachGroup : groupedCustomers.entrySet()) {
            double totSal=0;
            Integer group = eachGroup.getKey();
            List<Customer> eachCustomer = eachGroup.getValue();
            for (Customer customerList : eachCustomer) {
                double sal = customerList.getSal();
                totSal = totSal + sal;
            }
            map.put(group, totSal/eachCustomer.size());
        }
        /*groupedCustomers.entrySet().stream().map(customer -> {

        })*/
        return map;
    }

    private static List<Customer> readFile(String fileName) throws IOException, ParseException {
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        String line;
        int i = 0;
        List<Customer> customerList = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            if (i == 0) {
                i++;
                continue;
            }
            Customer customer = new Customer();
            String[] str = line.split("\\s+");
            customer.setId(Integer.parseInt(str[0]));
            customer.setName(str[1]);
            customer.setAge(Integer.parseInt(str[2]));
            customer.setSal(Double.parseDouble(str[3]));
            customer.setDoj(covertStringToDate(str[5]));
            customer.setAddress(new Address(str[6], str[7]));
            customer.setDepartment(new Department(Integer.parseInt(str[4]), str[8]));
            customerList.add(customer);
        }
        return customerList;
    }

    private static Map<Integer, List<Customer>> groupCustomers(List<Customer> customerList) {
        List<Customer> itList = new ArrayList<>();
        List<Customer> devopsList = new ArrayList<>();
        List<Customer> qaList = new ArrayList<>();
        Map<Integer, List<Customer>> map = new HashMap<>();



        for (Customer customer : customerList) {
            int deptId = customer.getDepartment().getDeptId();
            if (deptId == 201) {
                itList.add(customer);
                map.put(deptId, itList);
            } else if (deptId == 567) {
                devopsList.add(customer);
                map.put(deptId, devopsList);
            } else {
                qaList.add(customer);
                map.put(deptId, qaList);
            }
        }
        return map;
    }

    public static Date covertStringToDate(String str) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        return formatter.parse(str);
    }

}