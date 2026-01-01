package JAVATOPCODES.loops;
import java.util.*;
//pattern 1
public class SquareOfFirstnNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sqr =0;
        for (int i = 1; i <=n; i++) {
            sqr = i*i;
            System.out.print(sqr);
        }
    }
}
