package HOMEWORKS;
import java.util.*;

public class Practise2 {
    public static void main(String[] args) {
        // odd even program
        Scanner sc = new Scanner(System.in);
        System.out.println("even and odd program");
        System.out.print("ENTER A NUMBER : ");
        int n = sc.nextInt();
        if (n%2==0){
            System.out.println("IT IS EVEN");
        }
        else{
            System.out.println("it is odd");
        }
        //  take input of 2 from user
        System.out.println("finding largest in 2 numbers prgm");
        System.out.print("enter a number :");
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

        // Simple calculator
        System.out.println("simple calculator");
        System.out.println("enter first number");
        int x= sc.nextInt();
        System.out.println("enter second number");
        int y = sc.nextInt();
        System.out.println("enter a operation");
        System.out.println("1.Add");
        System.out.println("2.Sub");
        System.out.println("3.mul");
        System.out.println("4.div");
        System.out.println("5.mod");
        int z = sc.nextInt();
        switch(z){
            case 1:
                System.out.println(x+y);
                break;
            case 2:
                System.out.println(x-y);
                break;
            case 3:
                System.out.println(x*y);
                break;
            case 4:
                System.out.println(x/y);
                break;
            case 5:
                System.out.println(x%y);
                break;
            default:
                System.out.println("enter valid option");
        }
// print the month
        System.out.println("enter the number of month");
        int m= sc.nextInt();
        switch(m){
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("apr");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("Jul");
                break;
            case 8:
                System.out.println("aug");
                break;
            case 9:
                System.out.println("Sep");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;
            default:
                System.out.println("enter 1-12 only");
                break;

        }

    }
}
