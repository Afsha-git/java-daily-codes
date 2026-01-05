package JAVATOPCODES.patterns;
/*This is a hollow half pyramid.
The outer loop controls the rows from 1 to n.
The inner loop runs from 1 to i to form a half pyramid shape.
In a hollow half pyramid, stars are printed only on the boundary:
the first column, the last column of each row, and the last row.
All inner positions are spaces.”
                */
public class HallowHalfPyramid {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if( j == 1 || j==i || i ==n ){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
