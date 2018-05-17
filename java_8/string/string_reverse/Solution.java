import java.io.*;
import java.util.*;

public class Solution {

    static boolean isPalindrome(String s) {
        String reverse = new StringBuilder(s).reverse().toString();
        return reverse.equals(s);
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(isPalindrome(A) ? "Yes" : "No");
        
    }
}