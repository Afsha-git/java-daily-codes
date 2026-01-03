package JAVATOPCODES.patterns;

public class Reverse10to1 {
    public static void main(String[] args) {
        int n = 3;
        int m = 6;
        for (int i = 1; i <=n; i++) {
            for (int j = 10; j>=m; j--) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
