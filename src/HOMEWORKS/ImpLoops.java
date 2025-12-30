package HOMEWORKS;
import java.util.*;
public class ImpLoops {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // 1. Print Numbers
        System.out.println("print 1 to n ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
        }
        System.out.println("\n");

        System.out.println("printing n to 1");
        int m = sc.nextInt();
        for (int j = m; j >= 1; j--) {
            System.out.print(j);
        }
        System.out.println("\n");
        System.out.println("print even number 1 to N");
        int e = sc.nextInt();
        for (int k = 1; k <= e; k++) {
            if (k % 2 == 0) {
                System.out.print(k);
            }
        }
        System.out.println("\n");
        System.out.println("print odd number 1 to n");
        int o = sc.nextInt();
        for (int l = 1; l <= o; l++) {
            if (l % 2 != 0) {
                System.out.print(l);
            }
        }
    }
}

