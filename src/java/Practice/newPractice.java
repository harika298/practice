package java.Practice;

public class newPractice {
    public static void main (String args[]){
        StringBuffer s1 = new StringBuffer("Hello");
        StringBuffer s2 = new StringBuffer(" Hello");
        s1.append(s2);
        System.out.println(s1);


    }
}
