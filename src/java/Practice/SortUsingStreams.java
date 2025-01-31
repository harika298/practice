package java.Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortUsingStreams {
    public static void main(String args[]){
        List<String> fruits = Arrays.asList("guava","orange","apple","pomegranate");

        List<String> SortedFruits = fruits.stream().sorted().collect(Collectors.toList());
String s =  "Hello";
        System.out.println("list of fruits "+ fruits);
        SortedFruits.forEach(System.out::println);
        System.out.println("list of fruits "+ SortedFruits);
    }
}
class SortAscendingOrder{
    public static void main(String args[]){
        List<String> sports = Arrays.asList("badminton","football","cricket","volleyball");

//        List<String> SortedSports = sports.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());

        List<String> SortedSports = sports.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());

        List<String> SortedSportsReverse = sports.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println("list of sports "+ sports );

        System.out.println("list of sortedSports in ascending order "+ SortedSports);

        SortedSportsReverse.forEach(System.out::println);
    }
}
