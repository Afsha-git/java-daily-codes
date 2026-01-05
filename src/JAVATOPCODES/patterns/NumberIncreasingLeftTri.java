package JAVATOPCODES.patterns;

/*This is a number increasing left triangle.
The number of rows is n = 5, so the outer loop runs from i = 1 to n.
Each row prints numbers starting from 1 up to the row number.
Therefore, the inner loop runs from j = 1 to i.
Inside the inner loop, we print j.
After the inner loop finishes, we print a new line to move to the next row. */
public class NumberIncreasingLeftTri {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    }

