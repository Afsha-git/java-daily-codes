package JAVACODES;
import java.util.*;
public class function {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static int calculateSum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static int multiplyNumbs(int c , int d){
        return c * d;
    }
    public  static int fatorial(int f){
        if(f < 0){
            System.out.println(" invalid number");
            return 0;
        }
        int fact = 1;
        for (int i = 1; i <=f ; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        System.out.println(" 1. print my name function");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine(); // paste full name
        printMyName(name); // fuction call

        System.out.println(" enter a and b values");
        int a = sc.nextInt();
        int  b= sc.nextInt();
        int sum = calculateSum(a, b);
        System.out.println(" sum of two number is " + sum);

        System.out.println(" enter two values for multiplycation");
        int c = sc.nextInt();
        int d = sc.nextInt();
        multiplyNumbs(c,d);
        System.out.println("multipication of two numbers is " + multiplyNumbs(c,d));

        System.out.println(" enter a number to find factorial");
        int f = sc.nextInt();
        System.out.println(" factorial of the number is " + fatorial(f));
    }
}
