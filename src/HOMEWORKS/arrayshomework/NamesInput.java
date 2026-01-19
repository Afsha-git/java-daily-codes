package HOMEWORKS.arrayshomework;

import java.util.Scanner;

public class NamesInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter size of array");
        int size = sc.nextInt();
        System.out.println(" enter names ");
        String name[] = new String[size];

        // input names
        for (int i = 0; i <size ; i++) {
            name[i]= sc.next();
        }

        // output names

        for (int i = 0; i <name.length ; i++) {
            System.out.print(name[i] + " ");
        }
    }
}
