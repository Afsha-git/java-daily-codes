/* this program is for checking 3-digit number is an Armstrong

An Armstrong number is a number equal to the sum of its digits raised to the power of the total number of digits.

*/

package JAVATOPCODES.functions;
import java.util.*;
public class PrintArmstrong {
    static Boolean isArmstrong(int n){
        int temp = n, sum = 0;
        // temp to store original value
        while (n > 0 ){
            int rem = n % 10 ; // extracting digits
            sum = sum + rem* rem* rem; // cube of digit
            n = n/10; // removing last digit
        }
        return sum == temp; // is armstrong
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter a number ");
        int n = sc.nextInt();
        if(isArmstrong(n)){
            System.out.println(" number is Armstrong");
        }
        else{
            System.out.println(" number is not Armstrong");
        }

        // printing 3- digit armstrong series
        for (int i = 100; i <=999 ; i++) {
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
    }
}
