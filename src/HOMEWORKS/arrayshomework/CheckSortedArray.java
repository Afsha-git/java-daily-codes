package HOMEWORKS.arrayshomework;

import java.util.Scanner;

public class CheckSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter size of array");
        int size = sc.nextInt();
        System.out.println(" elements of array");
        int arr[] = new int[size];

        // input
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt(); // store elements
        }
        boolean isSorted = true;

        // output + condition

        for (int i = 0; i <arr.length-1 ; i++) {
            if(arr[i] > arr[i + 1]){
                isSorted = false;
                break;
            }
        }
 // print result
        if(isSorted){
            System.out.println(" array is sorted");
        }
        else{
            System.out.println(" array is not sorted ");
        }



    }

}
