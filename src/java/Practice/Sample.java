package java.Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sample {

    public static void main(String[] args) {
        /*String str = "line1\nline2\nline3";
        str.lines().forEach(System.out::println);*/
        //Harika Lokavarapu
        //

        List<Character> chars = List.of('A','E','I','O','U');
        String input = "Harika Lokavarapu".toUpperCase();

        Map<Character, Integer> map = new HashMap<>();
        for (char ch: input.toCharArray()) {
            if(chars.contains(ch)) {
                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch) + 1);
                } else {
                    map.put(ch, 1);
                }
            }
        }
        System.out.println(map);
    }
    }

//second highest sal - dept
//select MAX(Salary) as sal, dept from employee e
// where salary < (Select Max(Salary) from employee e1) group by e.dept;





