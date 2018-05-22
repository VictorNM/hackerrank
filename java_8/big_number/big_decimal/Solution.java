import java.math.BigDecimal;
import java.util.*;

class Solution {
    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();
        // Write your code here
        // Insertion sort
        for (int i = 1; i < n; ++i) {
            BigDecimal key = new BigDecimal(s[i]);
            String keyStr = s[i];
            int j = i - 1;

            while (j >= 0 && (new BigDecimal(s[j]).compareTo(key) < 0)) {
                s[j + 1] = s[j];
                j = j - 1;
            }
            s[j + 1] = keyStr;
        }
        // Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}