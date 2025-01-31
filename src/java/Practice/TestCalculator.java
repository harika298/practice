package java.Practice;

import java.util.*;

public class TestCalculator{
    public static void main(String[] args) {
        String[] sentences = {"This is Harika", "Hello World", "to be in the get", "hq things are moving"};


        String str = "hhhaabbbb";
        char[] strings = str.toCharArray();

        Map<Character,Integer> map1 = new HashMap<>();

        for(int i=0; i<strings.length; i++){
            if(!map1.containsKey(strings[i])){
                map1.put(strings[i],1);
            }else{
                map1.put(strings[i], map1.get(strings[i]) + 1);
            }
        }
        map1.forEach((key1, value1) -> System.out.println(key1 + " " + value1));

        Map<Integer,Character> highestCount = new TreeMap<>();
        for(Map.Entry<Character,Integer> map2: map1.entrySet()){
            highestCount.put(map2.getValue(), map2.getKey());
        }
        System.out.println("highest Count of character " +
                ((TreeMap) highestCount).lastEntry().getValue()
                + " is "
                + ((TreeMap) highestCount).lastEntry().getKey());

//        Employee emp2 = new Employee("harika",2,200000,"Tester",26,"female");
//        Employee emp3 = new Employee("minnu",3,300000,"Manager",25,"female");
//        Employee emp4 = new Employee("abhay",4,400000,"Associate",22,"male");

        Map<Integer,Employee> map = new HashMap<>();
        map.putIfAbsent(1, new Employee("anil",1,100000,"Developer",28,"male"));
        map.putIfAbsent(2, new Employee("harika",2,50000,"Tester",26,"female"));
        map.putIfAbsent(3, new Employee("minnu",3,700000,"Manager",25,"female"));
        map.putIfAbsent(4, new Employee("abhay",4,400000,"Associate",22,"male"));

        Employee employee = new Employee();
        Map<Integer,Integer> finalResult = employee.getHighestSalary(map.values().stream().toList());
//        for(Map.Entry<Integer, Integer> map1 : finalResult.entrySet()) {
//                map1.getKey();
//                map1.getValue();
//        }
        finalResult
                .forEach((key, value) -> System.out.println("Highest salary of employee " + key +" is "+ value));

        Calculator calculator = new Calculator();
        int add = calculator.addition(23,56);
        int multiple = calculator.multiplication(45,87);
        int sub = calculator.subtraction(45,56);
        int sub1 = calculator.subtraction(32,98,55);
        int add1 = calculator.addition(45,56);
        List<Integer> list = new ArrayList<>();
        for(int i=0; i< list.size(); i++){
            System.out.println(list.get(i));
        }
        for(int i=list.size()-1; i<=0; i--){

        }
        for(Integer ref:list){
            System.out.println(ref);
        }


        list.add(67);
        list.add(789);
        list.add(998);
        list.add(889);

       int list1 = calculator.addition(new int[]{1,2,3,4,5});
        System.out.println(add + " " + multiple + " " + sub+ " " + sub1+ " "+ list1);


    }
}
