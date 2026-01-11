package JAVATOPCODES.functions;
/* Why did you pass n as a parameter?”
“So that the method is reusable and works for different inputs*/
public class EvenorOdd {
    static void printEvenorOdd(int n){
        if(n % 2 == 0){
            System.out.println(" even");
        }
        else{
            System.out.println(" odd");
        }
    }
    public static void main(String[] args) {
        int n = 4;
        printEvenorOdd(n);
    }
}
