package classes.streams;

import classes.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class maxAndMinEx {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional<Integer> maxNum = list.stream().max(Integer::compareTo);
        Optional<Integer> minNum = list.stream().min(Integer::compareTo);
        System.out.println(maxNum.get());
        System.out.println(minNum.get());
        Optional<Integer> max = list.stream().max((a, b) -> a.compareTo(b));
        System.out.println(max.get());
    }
}
