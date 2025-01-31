package java.Practice;

import java.util.List;

public class Calculator {
    public int addition(int a, int b){
        return a+b;
    }
    public int subtraction(int a, int b){
        if(a>b){
            return a-b;
        }
        return b-a;
    }

    public int multiplication(int a, int b){
        return a*b;
    }

    public int subtraction(int a, int b, int c){
        return a-(b+c);
    }
    public int addition(List<Integer> list ){
        int ref = 0;
        for(int i=0;i<list.size();i++){
            ref = ref + list.get(i);
        }
        return ref;
    }
    public int addition(int[] arr ){
        int ref = 0;
        for(int i=0;i< arr.length;i++){
            ref = ref + arr[i];
        }
        return ref;
    }
}
