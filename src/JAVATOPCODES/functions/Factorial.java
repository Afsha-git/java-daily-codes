package JAVATOPCODES.functions;

public class Factorial {
    static int printFactorialNum(int n){
        int fact = 1;
        for (int i = 1; i <=n ; i++) {
           fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
     int n = 5;
     int res = printFactorialNum(n);
        System.out.println(res);
    }
}
