package JAVATOPCODES.functions;

/*“I iterate from 1 to n, check if a number is odd using modulo, and add it to a running sum. Finally, I return the sum.” */
public class SumOfOddNumbers {
    static int sumOfOddNumbs(int n){
        int sum = 0;
        for (int i = 1; i <=n ; i++) {
             if(i % 2 != 0){
                 sum += i; // sum = sum + i;
             }
        }
        return sum;
    }
    public static void main(String[] args) {
          int res = sumOfOddNumbs(9);
        System.out.println(res);
    }
}
