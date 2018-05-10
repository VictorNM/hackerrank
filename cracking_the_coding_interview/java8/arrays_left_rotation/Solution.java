import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        // Read input
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        // Rotate
        a = rotateArrayLeft(a, k);
        
        printArray(a);
    }
    
    static int[] readInputArray() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        return a;
    }

    static int[] rotateArrayLeft(int[] arr, int num_rotation) {
        for (int i = 0; i < num_rotation; i++) {
            arr = rotateArrayLeftOneTime(arr);
        }
        return arr;
    }
    
    static int[] rotateArrayLeftOneTime(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
        return arr;
    }
    
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
