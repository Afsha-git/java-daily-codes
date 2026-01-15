package JAVATOPCODES.functions;

public class GreaterOf2Numbers {
    static String graterOf2Numbs(int a,int b){
         if( a == b) return " both are equal";
        if(a >= b){
            return "a " + a;
        }
        return " b " + b;
    }
    // or  return (a > b) ? "a is greater" : "b is greater";
    public static void main(String[] args) {
       String res = graterOf2Numbs(1,10);
        System.out.println(res);
    }
}
