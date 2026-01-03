package JAVATOPCODES.patterns;
import java.util.*;

//This is a pattern printing problem using nested loops.
//The outer loop controls the number of rows, which is 4.
//The inner loop controls the number of columns, which is 5, and prints a star using print.
//After completing one row, println is used to move to the next line.

public class SolidRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        //outer loop
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=m ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
