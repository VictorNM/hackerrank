import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = in.nextLine();
        
        for (int i = 0; i < n; i++) {
            str = in.nextLine();
            for (int j = 0; j < str.length(); j += 2) {
                System.out.print(str.charAt(j));
            }
            System.out.print(" ");
            for (int k = 1; k < str.length(); k += 2) {
                System.out.print(str.charAt(k));
            }
            System.out.print("\n");
        }
    }
}