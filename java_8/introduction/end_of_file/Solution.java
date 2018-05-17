import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int count = 0;
        while (in.hasNext()) {
            count++;
            String string = in.nextLine();
            System.out.printf("%d %s\n", count, string);
        }
    }
}