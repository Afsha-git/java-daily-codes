package JAVACODES;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        //int[] marks = new int[3];// defining an array method 1
        int marks[] = {97,93,95}; // defining an array method 2
//        marks[0] = 97; // subject 1
//        marks[1] = 93; // subject 2
//        marks[2] = 95; // subject 3
        System.out.println(marks + " ");// o/p: [I@7b23ec81 will print some jargon(garbage value)
        for (int i = 0; i <3 ; i++) {
            System.out.print(marks[i]); // will print all marks value
        }
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter n for array : ");
        int n = sc.nextInt();
        int numbers[] = new int[n];
        //input
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        //output
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i]); // will gives 0's only
        }
    }

}
