import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        if (k == 0) {
            return "";
        }
        
        // welcometojava
        // 0123456789012
        smallest = s.substring(0,k);
        largest = s.substring(0,k);
        for (int i = 1; i <= s.length() - k; i++) {
            String currSubstring = s.substring(i, k+i);
            if (currSubstring.compareTo(smallest) < 0) {
                smallest = currSubstring;
            }
            else if (currSubstring.compareTo(largest) > 0) {
                largest = currSubstring;
            }
        }
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargest(s, k));
    }
}