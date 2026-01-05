
package JAVATOPCODES.patterns;
import java.util.*;

/*.This is an inverted half pyramid.
The number of rows is fixed, so the outer loop runs for 4 rows.
The number of stars decreases in each row.
In the first row, we print 4 stars, and in each next row one star less.
Therefore, the inner loop runs from 1 to (n − i + 1).*/

public class Invert180HalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        //outer loop
        for (int i = 1; i <=n ; i++) {
            //inner loop
            for (int j = 1; j <=m ; j++) {

            }
            System.out.println();
        }
    }
}
