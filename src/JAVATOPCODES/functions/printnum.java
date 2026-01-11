package JAVATOPCODES.functions;

public class printnum {
    static void printNum(int n){
        for (int i = 1; i <=n ; i++) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        // n is not accessible in main coz method parameter have local scope
        int n = 5;
        System.out.println(" here are number from 1 to " + n);
        printNum(n);
    }
}
