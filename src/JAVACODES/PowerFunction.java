package JAVACODES;

public class PowerFunction {

    // Function to calculate x^n
    static int power(int x, int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * x;
        }
        return result;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int res = power(x, n);
        System.out.println(res);
    }
}
