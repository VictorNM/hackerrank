import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
    static boolean isValidPattern(String pattern) {
        try {
            Pattern.compile(pattern);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
          	//Write your code
            System.out.println(isValidPattern(pattern) ? "Valid" : "Invalid");
            testCases--;
		}
	}
}