package java.Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOfNumbers {
    public static void main(String args[]){
        List<Integer> numbers = Arrays.asList(2,3,5,8,7,6,9,1,4);

        List<Integer> SquaredIntegers = numbers.stream().map(number-> number * number).collect(Collectors.toList());
        System.out.println("Original numbers "+ numbers);
        System.out.println("Sqaured numbers "+ SquaredIntegers);
    }
}
