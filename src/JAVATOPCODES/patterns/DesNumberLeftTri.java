package JAVATOPCODES.patterns;

/*This is a decreasing left number triangle.
The number of rows is n.
In each row, the count of numbers decreases by 1.
So the inner loop runs from 1 to (n − i + 1).
The value printed is j, starting from 1 every row.”*/

public class DesNumberLeftTri {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();

        }
    }

}
