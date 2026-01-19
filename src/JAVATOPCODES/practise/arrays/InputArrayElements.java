package JAVATOPCODES.practise.arrays;

import java.util.Scanner;

public class InputArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter array size");
        int size = sc.nextInt(); // 7
        System.out.println(" enter arrays elements");
        int arr[] = new int[size]; // dynamic size array

         // input for array
        for (int i = 0; i <size; i++) {
            arr[i] = sc.nextInt();
        }

        // print numbers
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
