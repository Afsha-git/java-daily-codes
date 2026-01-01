package JAVATOPCODES.loops;

import java.util.Scanner;

public class PrintFirstnEvenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int even =0;
        for (int i = 1; i <=n; i++) {
            even = 2*i;
            System.out.println(even);
        }
    }
}
