import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    
    private static final Scanner scanner = new Scanner(System.in);
    private static int size = 3;
    
    private static int sumHourglass(int[][] matrix, int row, int col) {        
        int sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sum += matrix[row+i][col+j];
            }
        }
        sum = sum - matrix[row+1][col] - matrix[row+1][col+2];
        return sum;
    }
    
    private static int getLargestSumHourglass(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i + size <= matrix.length; i++) {
            for (int j = 0; j + size <= matrix[0].length; j++ ) {
                int sum = sumHourglass(matrix, i, j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();
        
        System.out.println(getLargestSumHourglass(arr));
        
    }
}