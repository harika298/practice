package classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class FileReader {
    private static final String name = "Ayaan";

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\ADMIN\\IdeaProjects\\prac\\practice\\src\\classes\\abc.text");

        BufferedReader br = new BufferedReader(new java.io.FileReader(file));

        String line;
        List<String> list = new ArrayList<>();
        Set<String> set = new LinkedHashSet<>();
        Map<String,Integer> map = new HashMap<>();

        while ((line = br.readLine()) != null) {
            String str[] = line.split(" ");
            map.put(str[1], Integer.valueOf(str[2]));
//            set.add(str[1] + " " + str[2]);
            /*if(line.contains(name)) {
               String sal = line.substring(line.indexOf(name)).replace(name+" ","");
                System.out.println(sal);
            }*/


           /* if (name.equals(str[1])) {
                System.out.println(name + "-" + str[2]);
            }*/
          /*  if(!str[1].equals(name)) {
                System.out.println(str[1] + "-" + str[2]);
            }*/



            /*list.add(str[0]);
            list.add(str[1]);
            list.add(str[2]);
            System.out.println(list);*/
           }
        System.out.println(map);
        /*
        for (String str1 : set) {
            System.out.println(str1);
        }*/
    }
}
