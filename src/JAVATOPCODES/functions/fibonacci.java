package JAVATOPCODES.functions;

public class fibonacci {
    static void printfibonacci(int n){
        int a = 0, b= 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i <n ; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
    public static void main(String[] args) {
        printfibonacci(7);
    }
}
