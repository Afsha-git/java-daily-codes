package JAVATOPCODES.functions;

import java.util.Scanner;

public class FibonacciPrograms {
static int fibonacciNth(int n){
    if( n<= 1) return n;

    int a = 0, b = 1;

    for (int i = 2; i <=n ; i++) {
        int c = a + b;
        a = b;
        b = c;
    }
    return b;
}

    static void printFibonacciSeries(int n) {
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println(" enter a number : ");
        int n = sc.nextInt();
        int res = fibonacciNth(n);
        System.out.println(" nth fibonacci " + res);
        printFibonacciSeries(6);

    }
}
