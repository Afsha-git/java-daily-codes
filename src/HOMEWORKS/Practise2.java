package HOMEWORKS;
import java.util.*;

public class Practise2 {
    public static void main(String[] args) {
        // odd even program
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A NUMBER : ");
        int n = sc.nextInt();
        if (n%2==0){
            System.out.println("IT IS EVEN");
        }
        else{
            System.out.println("it is odd");
        }
        //  take input of 2 from user
        System.out.print("enter 2 numbers :");
        int a = sc.nextInt();
        int b= sc.nextInt();
        if(a == b){
            System.out.println("both are equal");
        } else if (a > b) {
            System.out.println("a is greater then b");
        }
        else {
            System.out.println("a is lesser then b");
        }

    }
}
