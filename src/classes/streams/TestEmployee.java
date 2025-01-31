package classes.streams;

import java.util.*;
import java.util.stream.Collectors;

public class TestEmployee {
    public static void main(String[] args) {
        List<EmpData> employeeList = Arrays.asList(
                new EmpData("Harika", 70000.00),
                new EmpData("ramya", 80000.00),
                new EmpData("vinod", 100000.00),
                new EmpData("teja", 50000.00));

       Map<String,Double> finalResult = employeeList.stream().collect(Collectors.toMap(EmpData::getEmpName, EmpData::getSalary));
        System.out.println(finalResult);

       Map<String,String> highestsal = employeeList.stream()
                .collect(Collectors.groupingBy(EmpData::getEmpName,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingDouble(EmpData::getSalary)),
                                emp -> emp.map(EmpData::getEmpName).orElse(null))));
        System.out.println(highestsal);

        List<EmpData> empDataList = employeeList.stream().sorted(Comparator.comparing(EmpData::getSalary)).toList();
        System.out.println(empDataList);


        Optional<EmpData> highestEmpSalary = employeeList.stream().max(Comparator.comparingDouble(EmpData::getSalary));
        highestEmpSalary.ifPresent(System.out::println);

        List<String> words = Arrays.asList("harika", "ramya", "vinod", "teja");
        String result = words.stream().collect(Collectors.joining(","));
        System.out.println(result);//returns string concetenating list of string

        //group by even or odd using streams
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, List<Integer>> groupedResult = numbers.stream().collect(Collectors.groupingBy(n -> n % 2 == 0));
        System.out.println(groupedResult);

        List<Empdata1> employeesByDesignation = Arrays.asList(
                new Empdata1("Harika", "Developer"),
                new Empdata1("ramya", "Manager"),
                new Empdata1("anudeep", "Developer"),
                new Empdata1("vaayu", "Developer"),
                new Empdata1("vedhansh", "Manager"));

        Map<String, List<Empdata1>> resultByDesignation = employeesByDesignation.stream()
                .collect(Collectors.groupingBy(Empdata1::getDesignation));
        System.out.println(resultByDesignation);

        List<String> words1 = Arrays.asList("harika", "ramya", "vinod", "teja");
        long res = words1.stream().filter(d -> d.length() > 4).count();
        System.out.println(res);

        List<String> sortedWordsReverse = words1.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(sortedWordsReverse);

        List<Integer> numb = Arrays.asList(2, 3, 3, 4, 5, 3, 4, 4, 6, 7, 7);
        List<Integer> numRes = numb.stream().distinct().toList();
        System.out.println(numRes);

        List<Integer> num1 = Arrays.asList(1, 2, 3, 4, 5);
        boolean allPositive = num1.stream().allMatch(n -> n > 0);
        System.out.println(allPositive);

        //Anagrams
        List<String> wordsForAnagrams = Arrays.asList("listen", "silent", "enlist", "rat", "tar", "god", "dog", "evil", "vile", "veil");
       Map<String,List<String>> anagrams = wordsForAnagrams.stream().collect(Collectors.groupingBy(word -> {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            return new String(chars);
        }));
       anagrams.values().stream().filter(group -> group.size()>1).forEach(System.out::println);
    }
}
