import java.util.*;
import java.io.*;
import java.lang.Math;

class Solution{
    public static int[] getResult(int a, int b, int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int sum = a;
            for (int j = 0; j <= i; j++) {
                sum += (int) Math.pow(2,j) * b;
            }
            result[i] = sum;
        }
        return result;
    }
    
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int[] result = getResult(a, b, n);
            for (int j = 0; j < n; j++) {
                System.out.print(result[j]+ " ");
            }
            System.out.println();
        }
        in.close();
    }
}
