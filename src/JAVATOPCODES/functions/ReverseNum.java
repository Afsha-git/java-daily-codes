package JAVATOPCODES.functions;
import java.util.*;
/* We repeatedly extract the last digit using modulo, build the reverse by shifting digits left, remove the last digit using division, and return the result from the function*/
public class ReverseNum {
    static int printReverseNum(int n){
        int rev = 0;
        while(n > 0){
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter a number for reversing ");
        int n = sc.nextInt();
        int result = printReverseNum(n); // calling function
        System.out.println(" reverse of the given number is " + result);
    }
}
