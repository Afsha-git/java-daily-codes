package JAVATOPCODES.functions;

public class AverageOf3Numbers {
    static double averageOf3Nums(int a,int b, int c){
        double avg = (a+b+c)/3.0;
        return avg;
    }
    public static void main(String[] args) {
        double result = averageOf3Nums(2,5,3);
        System.out.println(result);
    }
}
