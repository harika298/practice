package java;

public class Test {
    //abcdewabc

    public static void main(String[] args) {
        System.out.println(longestSuffixAndPrefix("level"));
    }
    public static String longestSuffixAndPrefix(String s){
        int strLength = s.length();
        String res ="";
        for (int i = 1; i < strLength-1; i++) {
            StringBuilder prefix = new StringBuilder();
            StringBuilder suffix = new StringBuilder();
            //a
            for (int j = 0; j < i; j++) {
                prefix.append(s.charAt(j));
            }
            //c
            for (int j = strLength-i; j < strLength; j++) {
                suffix.append(s.charAt(j));
            }

            if(prefix.toString().contentEquals(suffix)){
                res=prefix.toString();
            }
        }
        return res;
    }
}
