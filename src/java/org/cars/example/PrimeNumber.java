package java.org.cars.example;

public class PrimeNumber {
   static int[] even = {2,4,6,8,11,13};
    public static void main(String[] args) {
        Integer number = 10;
        System.out.println("Before: " + number); // Output: Before: 10
        modifyNumber(number);
        System.out.println("After: " + number); // Output: After: 10
    }

    public static void modifyNumber(int value) {
        value = value * 2;
        System.out.println("Modified: " + value); // Output: Modified: 20
    }
    /*public static void main(String[] args) {
        int i =0;
        Integer integer = 10;
//        for(int number : even){
//           evenOrOdd(number);
//        }
        primeNumber(1067);
    }*/
        public static void evenOrOdd(int num){
         if(num % 2 == 0){
             System.out.println(num + " is even number");
         }else{
             System.out.println(num + " is odd number");
         }

    }
     public static void primeNumber(int prime){
        boolean flag = false;
        for(int i=2; i<(prime-1); i++){
            if(prime % i == 0){
                flag = true;
                break;
            }
        }
        if(!flag) {
            System.out.println(prime + " is a prime number");
        }else{
            System.out.println(prime + " is not a prime number");
        }

     }

}
