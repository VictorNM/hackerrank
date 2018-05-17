import java.io.*;
import java.util.*;

public class Solution {
    static boolean isAnagram(String s1, String s2) {
        // Complete the function
        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();

        char[] s1CharArray = s1.toLowerCase().toCharArray();
        char[] s2CharArray = s2.toLowerCase().toCharArray();

        // create frequency table for s1
        for (char c : s1CharArray) {
            if (!map1.containsKey(c)) {
                map1.put(c, 1);
            }
            else {
                int count = map1.get(c);
                map1.replace(c, count + 1);
            }
        }

        // create frequency table for s2
        for (char c : s2CharArray) {
            if (!map2.containsKey(c)) {
                map2.put(c, 1);
            }
            else {
                int count = map2.get(c);
                map2.replace(c, count + 1);
            }
        }

        // compare 2 tables
        return map1.equals(map2);
    }
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
} 
     
          
              

      
     
          
                
            

      