package java.org.cars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Contagious {
    public static void main(String[] args) {

        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= arr.length-k; i++) {
            List<Integer> subArray = new ArrayList<>();
            subArray.add(arr[i]);
            for (int j = i+1; j < k+i ; j++) {
                subArray.add(arr[j]);
            }
            list.add(subArray);
        }

        List<Integer> list1 = new ArrayList<>();
        for(int i=0; i< list.size(); i++){
            List<Integer> tempList = list.get(i);
            int temp = tempList.get(0);
            for (int j = 1; j < tempList.size(); j++) {
                if(temp < tempList.get(j)) {
                    temp = tempList.get(j);
                }
            }
            list1.add(temp);
        }
        System.out.print(list1);
    }
}

        /*int a1=2,a2=5,a3=1;
        int temp = a1;
        if(temp < a2){
            temp = a2;
            if(temp < a3) temp = a3;
        }*/
//        System.out.println(temp);



/*
* int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        System.out.println("The subarrays are-");
        int k = 3;
        int[][] ints = new int[arr.length][k];
        // For loop for start index
        for (int i = 0; i <= arr.length-k; i++) {
            int[] subArray = new int[k];
            subArray[0]=arr[i];
            for (int j = i+1; j < k+i ; j++) {
                subArray[k-j]=arr[j];
            }
            ints[i]=subArray;
        }
    }*/