package java.Practice;

import java.util.List;

public class RemoveDuplicates {
    //input 10,3
    //output
    /*
    * 1 2 3
    * 4 5 6
    * 7 8 9
    * 10
    * */
    public static void matrix(int count, int breakNumber){
        for(int i = 1; i <= count; i++){
            System.out.print(i + " ");
            if((i%breakNumber) == 0 ){
                System.out.println();
            }

        }
    }

    public static void main(String[] args) {

        matrix(10,3);
        String str = "abbccd";
        List<String> list = List.of("this", "dad", "bob", "is", "to", "make", "mom", "hj", "the");

       int integerList = getPalindromeCount(list);
        System.out.println(integerList);

        String num = "1234567";
        String multipliedOddNumbers = multiplyOddNumbers(num);
        System.out.println(multipliedOddNumbers);

        String s1 = "this";
        String s2 = "the";
        int start = 0;
        int end = 0;
        for(int i =0; i < list.size(); i++){
            if(s1.equals(list.get(i))){
                start = i;
            }if(s2.equals(list.get(i))){
                end = i-1;
            }
        }
        System.out.println("distance is " + (end - start));


        //what is the distance between this and the..

        String str1 = "ui{abcd}";

        String res = str1.substring(str1.indexOf("{") + 1, str1.indexOf("}"));
        System.out.println(res);

        String result = nonRepeatablechar(str);
        System.out.println(result);
    }

    //1. get each word in the list
    //2.reverse that word
    //3.now compare it with the word what u have get firstly
    //
    private static int getPalindromeCount(List<String> list){
        int count = 0;

        for(int i = 0; i < list.size(); i++) {
           String eachString = list.get(i);
           String reverseWord = example.result(eachString);
            if (eachString.equals(reverseWord)) {
                count++;
            }
        }
        return count;
    }
    public static String multiplyOddNumbers(String numbers){
        StringBuilder sb = new StringBuilder();
     for(int i = 1; i <= numbers.length(); i++){
        int val = Integer.parseInt(String.valueOf(i));
         if(i %2 != 0){
             int i1 = val * 5;
             sb.append(i1);
         }else{
             sb.append(val);
         }
     }
        return sb.toString();
    }

    public static String nonRepeatablechar(String str) {
        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char eachChar = chars[i];
            if (!sb.toString().contains(String.valueOf(eachChar))) {
                sb.append(eachChar);
            }
        }
        return sb.toString();
    }
}
