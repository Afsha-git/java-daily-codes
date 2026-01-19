/*We initialize max with the smallest possible integer and min with the largest possible integer so that any element in the array can correctly update them during comparison
*
*The Core Rule (Remember This Sentence)

To find maximum, start from the smallest possible value
To find minimum, start from the largest possible value
*
* */



package HOMEWORKS.arrayshomework;

import java.util.Scanner;

public class MaxAndMinInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter sixe of array: ");
        int size = sc.nextInt();
        System.out.println(" enter number of array : ");
        int arr[] = new int[size];

        // input for arr
        for (int i = 0; i <size ; i++) {
            arr[i] = sc.nextInt();
        }

        // init max and min values
        int max = Integer.MIN_VALUE; // Integer.MIN_VALUE is the smallest possible integer
        int min = Integer.MAX_VALUE; // Integer.MAX_VALUE is the largest possible integer

        // output + condition

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println(" maximum value is : " + max );
        System.out.println(" minimum value is : " + min );
    }
}
