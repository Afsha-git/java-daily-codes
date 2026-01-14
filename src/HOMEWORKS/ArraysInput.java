package HOMEWORKS;

import java.util.Scanner;

public class ArraysInput {
    public static void main(String[] args) {
        // take an array as input frm user.search for a given number x and print the index at which it occurs
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter array size ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        // input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(" enter x ");
        int x = sc.nextInt();

        //output
        for (int i = 0; i <arr.length; i++) { // size of array
            if(arr[i] == x){
                System.out.println(" x found at index " + i);
            }
//            else {
//                System.out.println(" cant find x ");
//            } // will print at every elemnet if not found imp thing to remebr
        }
    }
}
