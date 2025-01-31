package java.org.inheritance.example;

public class TestLaptop {
    static int add(int a,int b){return a+b;}
    static int add(int a,int b,int c){return a+b+c;}

    public static void main(String[] args) {
        Laptop dellLaptop = new Dell();
        dellLaptop.setConfiguration("i5","windows","4gb","8gb");

        Laptop dellConfiguration = dellLaptop.getConfiguration();
        System.out.println(dellConfiguration);

        Dell dell1 = new Dell("i5","windows","4gb","8gb");
        System.out.println(dell1.getConfiguration());
    }
}
