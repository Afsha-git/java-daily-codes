package JAVATOPCODES.patterns;
import java.util.*;

/*This is a hollow rectangle with 4 rows and 5 columns.
I use an outer loop to control rows and an inner loop to control columns.
Since every row has 5 columns, the inner loop runs fixed times.
I print a star only when I am on the border — that is first row, last row, first column, or last column.
For all other positions, I print a space to make it hollow.*/

public class HallowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        //outer loop
        for (int i = 1; i <=n ; i++) {
            //inner loop
            for (int j = 1; j <=m ; j++) {
                if(i==1 || j==1 || i==n || j==m) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
