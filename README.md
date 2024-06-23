Given a signed 32-bit integer x, return x with its digits
reversed.
§ Cannot convert x to a string and reverse the string.
§ -231 <= x <= 231 – 1
§ Examples:
o x=123, return 321
o x=-123, return -321
o x=120, return 21

*Solution:*
import java.util.Scanner;

public class ReverseNumber{
    public static int reverse(int num){
        int rev = 0;
        
        while (num != 0){
            int remainder = num % 10;
            
            // extracting last number
            rev = rev * 10 + remainder;
            num = num / 10;
        }
        return rev;
        
    }
    public static void main(String[] args){
        //  int x = 123;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = sc.nextInt();
         System.out.println("After reverse the Number is: " + reverse(input));
    }
}
