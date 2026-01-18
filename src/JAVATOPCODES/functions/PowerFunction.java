package JAVATOPCODES.functions;

public class PowerFunction {

   static int powerFunction(int x, int n){
        int result = 1;
        for (int i = 1; i <=n ; i++) {
         result = result * x;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(powerFunction(2,6));
    }
}
