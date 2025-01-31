/*
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        */
/*String name = "Anil Kumar Saladi";
        List<Character> list = new ArrayList<>();
        for (char ch : name.toCharArray()) {
            list.add(ch);
        }

        Map<Character, Long> map =
                list.stream()
                        .filter(n -> !n.toString().isBlank())
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);

        map.entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .forEach(System.out::print);



        System.out.println();*//*

        //2 unordered lists
        //remove duplicates
        //collect unique elements as list
        List<String> list2 = Arrays.asList("a", "d", "d", "c");
        List<String> list3 = Arrays.asList("e", "b", "f", "e", "a");
        String[] arr1 = {"a", "a", "d"};
        String[] arr2 = {"c", "b", "c"};
        String[] arr3 = new String[arr1.length+arr2.length];
        arr3[0] = arr1[0];

        for (int i = 1; i < arr1.length; i++) {
            int j = i+1;
            if()
        }
        for (int i = 0; i < arr2.length; i++) {
            if(!Objects.equals(arr3[i], arr2[i])) {
                arr3[i] = arr1[i];
            }
        }

        Stream.of(list2, list3)
                .flatMap(Collection::stream)
                .distinct()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toCollection(ArrayList::new))
                .forEach(System.out::print);
    }
}
*/
