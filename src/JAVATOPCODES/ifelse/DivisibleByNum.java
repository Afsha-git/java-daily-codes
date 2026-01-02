package JAVATOPCODES.ifelse;
//pattern 4
import java.util.*;
public class DivisibleByNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if( n % 5 == 0){
            System.out.println(n);
            System.out.println("divisible by 5");
        }
        else
            System.out.println("not divisible by 5 ");
    }
}
