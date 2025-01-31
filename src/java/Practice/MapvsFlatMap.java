package java.Practice;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class MapvsFlatMap {
    public static void main(String[] args) {
        List<Employee> employees =
                List.of(
                        new Employee(1,30),
                        new Employee(2,36),
                        new Employee(3,33),
                        new Employee(4,34)
                );

        for(int i = employees.size()-1; i>=0; i--){
            int res = 0;//35
            // age > 35 , *5
           int ageRes = employees.get(i).getAge();
           if(ageRes > 35){
               res = ageRes*5;
               employees.get(i).setAge(res);
           }else{
               res = res+5;
               employees.get(i).setAge(res);
           }
        }


        /*for (Employee e : employees) {
            int age  = e.getAge()+5;
            e.setAge(age);
            System.out.println(e);
        }
        employees.stream().map(u-> u.getAge()+5).forEach(System.out::println);*/



        /*List<String> upperCase = List.of("anil","harika","myra");

        for (String s : upperCase) {
            if(s.startsWith("m")) {
                System.out.println(s);
            }
        }


        upperCase.stream().filter(u-> u.startsWith("m")).forEach(System.out::println);

        List<List<String>> upperCase1 = List.of(
                 List.of("anil","harika","myra")
                ,List.of("ramya","pavan","ashok")
                ,List.of("vamsi","ram","reddy")
                ,List.of("jaanu","sri","rohith"));

        for (List<String> s1 : upperCase1){
            for (String s : s1) {
                if(s.startsWith("m")) {
                    System.out.println(s);
                }
            }
        }

        upperCase1.stream().flatMap(Collection::stream).filter(n-> n.startsWith("m")).forEach(System.out::println);

       *//* System.out.println(upperCase.stream().filter(u-> u.startsWith("m")).toString());*//*



        List<String> list = upperCase.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println(list);

         List<String> ress = list.stream().map(String::stripLeading).toList();
        System.out.println(ress);

        List<List<Integer>> list1 = List.of(
                List.of(2,6,8,9),
                List.of(78,90,45),
                List.of(3453,567,893),
                List.of(786,983,667));
       List<Integer> result = list1.stream().flatMap(List::stream).toList();
        System.out.println(result);

        List<String> sentences = List.of("Hello World","Object Oriented Programming","Functional Programming","Exceptional handling");
       List<String> list2 = sentences.stream()
               .flatMap(sentence-> Arrays.stream(sentence.split(" ")))
               .distinct()
               .toList();
        System.out.println(list2);*/
    }

}
