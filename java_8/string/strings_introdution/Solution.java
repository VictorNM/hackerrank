import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        sc.close();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(sumLength(A, B));
        System.out.println(isAlphabeticallyLarger(A, B) ? "Yes" : "No");
        System.out.println(capitalizeFirstLetter(A) + " " + capitalizeFirstLetter(B));
    }

    static int sumLength(String s1, String s2) throws NullPointerException {
        return s1.length() + s2.length();
    }

    static boolean isAlphabeticallyLarger(String s1, String s2) throws NullPointerException {
        return s1.compareTo(s2) > 0;
    }

    static String capitalizeFirstLetter(String s) throws NullPointerException {
        return s == "" ? s : s.substring(0,1).toUpperCase() + s.substring(1);
    }
}