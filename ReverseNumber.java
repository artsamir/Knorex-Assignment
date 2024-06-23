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