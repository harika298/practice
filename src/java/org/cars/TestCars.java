package java.org.cars;

import java.util.Arrays;
import java.util.List;

public class TestCars {
    public static void main(String[] args) {

        String str = "1234ABCD";
        List<String> chArray = Arrays.asList("0","1","2","3","4","5","6","7","8","9");


        for(int i=0; i<str.length(); i++){
            Character ch = str.charAt(i);
            try{
                if(chArray.contains(ch.toString())) {
                    throw new IllegalAccessException("This is a number");
                }else {
                    throw new IllegalAccessException("This is an alphabet");
                }
            }catch(IllegalAccessException exception){
                System.out.println(exception.getMessage());
            }
        }

        Cars bmwCars = new BMW();
        bmwCars.setSpecifications(899000);
        System.out.println(bmwCars.getSpecifications());

    }
}
