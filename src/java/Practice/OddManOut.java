package java.Practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OddManOut {
    //check if list of integers has any odd value, if so return false else return true


    public static void main(String[] args) {

        Map<Character, Integer> map = new HashMap<>();
//        Map<Integer, Character> revisedMap = new TreeMap<>();
        map.put('C',100);
        map.put('M',1000);
        map.put('I',1);
        map.put('V',5);
        map.put('L',500);
       /* for(Map.Entry<Character,Integer> entry : map.entrySet()){
           revisedMap.put(entry.getValue(),entry.getKey());
        }*/

//        System.out.println(revisedMap);

        Map<Integer, Character> revisedMap = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey, (e1, e2)-> e1,LinkedHashMap::new));

        System.out.println(revisedMap);

        List<Integer> list1 = List.of(2, 2, 2, 2);
//        System.out.println(oddNum(list1));


        System.out.println(checkPrime(5));

        String str = "10071982739817239871023801823192837";

        int count = 3;

        calculateDiscount(str, count);

        //Take substring of count chars from str, calculate discount of each substring and get 4th highest discounted substring;
        //1. make substrings of count length.
        //2. calculate the discount of each substring and store it in a map(key=discounted price, value = substring)
        //3. get 4th highest discount
        List<String> stringList = List.of("ball","horse","girafee","zombie","yolk","yolk","yolk","yolk","yolk");

        Map<String,Integer> map1 = stringList.stream()
                .distinct()
                .collect(Collectors.toMap(Function.identity(), String::length));
        System.out.println(map1);

        Map<String,Integer> map2 = stringList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, m-> m.getValue().intValue()));

        System.out.println(map2);

//       Set<String> set = stringList.stream().collect(Collectors.toCollection(LinkedHashSet::new));
//        System.out.println(set);

//        covertListToSet(stringList);
    }

   private static Set<String> covertListToSet(List<String> stringList){
      return stringList.stream().collect(Collectors.toSet());
   }


    public static Map<Integer, String> calculateDiscount(String str, int count) {
        int j = 0;
        String str1 = "";
        Map<Integer, String> discountedMap = new TreeMap<>();

//        Stream.of(str.toCharArray())

        for (int i = 0; i <= str.length(); i++) {
            if (i != 0 && i % count == 0) {
                str1 = str.substring(count * j, i);
                discountedMap = calculateDiscountOfSubString(str1, discountedMap);
                j++;
            }
        }
        str1 = str.substring(count * j);
        if (!str1.isEmpty()) {
            discountedMap = calculateDiscountOfSubString(str1, discountedMap);
        }
        System.out.println(discountedMap);


        int l = 0;
        int h = discountedMap.size()-4;
        for (Map.Entry<Integer, String> eachVal : discountedMap.entrySet()) {
            if (l++ == h) System.out.println(eachVal);
        }
        Optional<Integer> fourthHighestDiscount = discountedMap.keySet().stream()
                .sorted(Comparator.reverseOrder())
                .skip(3)
                .findFirst();



        fourthHighestDiscount.ifPresent(key -> System.out.println("fourth Highest Discount is " + key));
        return Map.of();
    }

    private static Map<Integer, String> calculateDiscountOfSubString(String str1, Map<Integer, String> discountedMap) {
        if (str1 != null) {
            int actualPrice = Integer.parseInt(str1);
            int discount = (int) (actualPrice * 0.4);
            discountedMap.put(actualPrice - discount, str1);
        }
        return discountedMap;
    }


    /*public static boolean oddNum(List<Integer> list){
        for(int numbers: list){
            if(numbers % 2 != 0){
                return false;
            }
        }
        return true;
    }*/
    //if a number is divisable by 1 and iteself
    //7 => 2, 7.. 2,3,4,5,6
    public static boolean checkPrime(int num) {
        if (num == 0) return false;

        if (num == 1 || num == 2) {
            return true;
        }
        for (int i = 3; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
