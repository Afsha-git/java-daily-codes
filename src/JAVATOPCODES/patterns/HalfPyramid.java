package JAVATOPCODES.patterns;
import java.util.*;

/*.This is a half pyramid pattern.
The number of rows is fixed, so I use the outer loop for rows.
The number of stars in each row depends on the row number.
Row 1 prints 1 star, row 2 prints 2 stars, and so on.
Therefore, I run the inner loop from 1 to i so that stars increase row by row.*/

public class HalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        //outer loop
        for (int i = 1; i <=n ; i++) {
            //inner loop
            for (int j = 1; j <=i ; j++) {
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
