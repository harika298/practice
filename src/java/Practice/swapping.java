package java.Practice;

public class swapping {
    public static void main(String[] args) {
        int a = 8;
        int b = 9;

        a = a + b ;
        b = a - b ;
        a =  a - b ;
        System.out.println( "a = "+ a + "," + "b = " + b);

        String s1 = "harika";
        String s2 = "Hello";
        //hihello  s2-> hi  s1-> hello
        s1 = s1 + s2 ;
        s2 = s1.substring(0,s1.length()-s2.length());
        s1 = s1.substring(s2.length());
        System.out.println("s1 = " + s1 + "\n" + "s2 = " + s2 );
    }
}
