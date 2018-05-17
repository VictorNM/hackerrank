import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int B;
    static int H;
    static boolean flag = false;

    static {
        try {
            Scanner in = new Scanner(System.in);
            B = in.nextInt();
            H = in.nextInt();
            in.close();
            if (B > 0 && H > 0) {
                flag = true;
            }
            else {
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception e) {
            System.out.println(e);
        }        
    }

    public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
        }
		
	}//end of main

}//end of class