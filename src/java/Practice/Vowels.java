package java.Practice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Vowels {
    public static void main(String[] args) {
        List<Character> list = List.of('A','E','I','O','U');
        String input = "Anaerr".toUpperCase();

        Map<Character,Integer> map = new HashMap<>();
        for (char ch : input.toCharArray()){
            if(list.contains(ch)) {
                if(!map.containsKey(ch)){
                    map.put(ch,1);
                }else{
                    int val = map.get(ch);
                    map.put(ch,val+1);
                }

            }

        }
        System.out.println(map);
    }

    public static class CharacterCount {
        public static void main(String[] args) {
            String input = "hello world";
            Map<Character, Long> charCount = getCharacterCount(input);
            charCount.forEach((character, count)-> System.out.println(character + ":" + count));
        }

        private static Map<Character, Long> getCharacterCount(String input) {

            return input.chars()
                    .mapToObj(c -> (char)c)
                    .filter(Character::isLetterOrDigit)
                    .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        }
    }

}
