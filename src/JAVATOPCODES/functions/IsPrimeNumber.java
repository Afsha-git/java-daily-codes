package JAVATOPCODES.functions;

import java.util.Scanner;

public class IsPrimeNumber
{
    static boolean isPrime(int n){

        if ( n <= 1) return false; //  0 and 1 edge case

        for (int i = 2; i < n ; i++) {
            if( n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     // check single number
        System.out.println(" enter a number : ");
     int n = sc.nextInt();
     if(isPrime(n)){
         System.out.print(" prime number");
     }
     else{
         System.out.print(" not a prime number");
     }

        // print prime numbers  from 1 to 100:
        System.out.println(" printing prime numbers from 1 to 100  ");
        for (int i = 1; i <=100 ; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

