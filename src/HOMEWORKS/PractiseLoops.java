package HOMEWORKS;
import java.util.*;
public class PractiseLoops {
    public static void main(String[] args) {
       // print 0 to 10 numbers
        System.out.println("print 0 to 10 numbers");
        for (int i =0 ; i <= 10 ; i = i +1){ // i++ is same
            System.out.print(i + " ");
        }
// print sum of first n natural num
        System.out.println("\n");
        System.out.println(" sum of first n natural numbers");
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int a = 1; a <= n; a++){
            sum = sum + a;
        }
     System.out.print(sum + " ");

        // table of a number
        System.out.println("table of a number");
        int num = sc.nextInt();
        for (int t =1 ; t<= 10 ; t++){
            System.out.print(num * t + " ");
        }
//       System.out.println(num * t); // cant do this
        // print even numbers
        System.out.println(" even program");
        System.out.println(" enter a number till you want to check for even number : ");
        int m = sc.nextInt();
        for (int w = 1; w<=m ; w++ ){
            if ( w % 2 == 0 ) {
                System.out.print(w + " ");
            }

            // run this program
            System.out.println("\n");
            for(;;){
                System.out.println(" run");
            }


        }

    }



}
