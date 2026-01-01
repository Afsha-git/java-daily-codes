package JAVATOPCODES.loops;
import java.util.*;
//pattern 1
public class PrintFirstnNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            System.out.println(i);
        }
    }
}
