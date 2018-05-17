import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex {
    // ([0-1]?[0-9])?[0-9]  : match 0 - 199 (include leading zeros)
    // 2[0-4][0-9]          : match 200 - 249
    // 25[0-5]              : match 250 - 255
    String one = "(([0-1]?[0-9])?[0-9]|2[0-4][0-9]|25[0-5])";
    public String pattern = one + "." + one + "." + one + "." + one;
}