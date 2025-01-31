package java.Practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ordering {
    public static void main(String[] args) {
        List<Integer> list = List.of(23,45,87,65,90,1,5,6754,889,735);
        /*Map<Integer,Integer> numbers = new HashMap<>();
        for(int num: list){
            numbers.put(num,num);
        }*/
//        System.out.println(numbers);
        Map<Integer, Integer> map = list.stream().collect(Collectors.toMap(n -> n, m -> m, (m,n) -> n, LinkedHashMap::new));
        System.out.println(map);
    }
}
