package java.org.cars.example;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {

    public static void main(String[] args) {
        String[] str = {"hello", "this", "say", "no", "this", "even", "hello", "said", "yes", "this", "hello"};
//        String temp = "hello";
        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        for(int i=0; i< str.length; i++){
           if(!list.contains(str[i])){
              list.add(str[i]);
           }else{
               if(!list1.contains(str[i])){
                   list1.add(str[i]);
                   System.out.println(str[i]);
               }
           }
        }
        System.out.println(list);


//        for (int i = 0; i < str.length; i++){
//            List<String> list = new ArrayList<>();
//            if(temp!=str[i]){
//                list.add(str[i]);
//                System.out.println(list);
//        }
//
//        }
    }
}
