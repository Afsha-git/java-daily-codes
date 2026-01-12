package JAVATOPCODES.functions;
/* I reverse the number using modulo and division, then compare it with the original number to check if it is a palindrome.”*/
public class Palindrome {
    static boolean isPalindrome(int n){
        int temp = n, rev = 0;
        while(n > 0){
            int rem = n % 10; // Extract last digit.
            rev = rev * 10 + rem; // Build reverse number.
            n = n/10; // Remove last digit.
        }
        if(temp == rev){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n = 101;
       boolean res = isPalindrome(n);
        System.out.println(res);
    }
}
