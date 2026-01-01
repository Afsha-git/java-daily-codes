package JAVATOPCODES.loops;
import java.util.*;
//pattern 1
public class CountFirstnNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =0;
        for (int i = 1; i <=n; i++) {
            count += 1;
        }
        System.out.println(count);
    }
}
