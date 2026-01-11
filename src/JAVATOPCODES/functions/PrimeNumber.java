package JAVATOPCODES.functions;
import java.util.*;
/*
*->Why does the loop go till < n and not <= n?
Because every number is divisible by itself.
If we check n % n, it will always be 0 and incorrectly mark primes as non-prime.
*
* -> O(n), because we check divisibility up to n.
*  */


public class PrimeNumber {
    static boolean isprime(int n){
        if(n < 1)
            return false;
        for (int i = 2; i < n ; i++) // Because 1 divides every number, so checking from 1 is unnecessary.
        {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
        System.out.println(isprime(n));
    }
}
