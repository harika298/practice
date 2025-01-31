package java.Practice;

import java.util.ArrayList;
import java.util.List;

public class example {
    public static void main(String[] args) {
        String str1 = "29876543110"; // 29,876,543,110
        String output = result(str1);
        System.out.println(output);

        String str = "9876";
        String finalResult = multiplyEvenPlaces(str);
        System.out.println(finalResult);
    }
    public static String result(String str){
        StringBuilder sb = new StringBuilder();
        for(int i = str.length()-1; i >= 0; i--){
            sb.append(str.charAt(i)); // Add characters in reverse order
           /* if ((str.length()- i) % 3 == 0 && i != 0) {
                sb.append(',');
           }*/
        }
        return sb.toString();
    }


    //999 //9189 //99189
    private static String multiplyEvenPlaces(String str){
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < str.length() ; i++){
            if (i % 2 == 0 && i != 0){
                int h = Integer.parseInt(String.valueOf(str.charAt(i)));
                sb.append(h*2);
                continue;
            }
            sb.append(str.charAt(i));

        }

        return sb.toString();
    }
}
