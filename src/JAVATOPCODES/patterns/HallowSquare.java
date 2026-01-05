package JAVATOPCODES.patterns;

/* This is a hollow square pattern.
The number of rows and columns is fixed at n = 4.
The outer loop runs for rows from 1 to n, and the inner loop runs for columns from 1 to n.
In a hollow square, stars are printed only on the boundary.
So, if the current row is the first or last row, we print a star.
Similarly, if the current column is the first or last column, we print a star.
Otherwise, we print a space. ”*/

public class HallowSquare {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j<=n; j++) {
                if(i==1 || i==n || j== 1 || j== n){
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
