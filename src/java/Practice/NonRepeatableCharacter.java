package java.Practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatableCharacter {
    public static void main(String[] args) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        String input = "pipeline";

        for(char ch : input.toCharArray()) {
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch)+1);
            }else{
                map.put(ch, 1);
            }
        }

       Map.Entry<Character, Integer> entry = map.entrySet().stream()
               .filter(n-> n.getValue()==1)
               .findFirst()
               .orElse(null);

        System.out.println(entry);
    }
}
