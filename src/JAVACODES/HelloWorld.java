package JAVACODES;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
//        System.out.print("Hello world with java ");
//        System.out.println("Hello world with java ");
//        System.out.println("hello \n my day 2 of doing java  ");

        // printing of star pattern
        System.out.println("*\n**\n***\n****\n");
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");

        // DataTypes
        int a = 10;
        int b = 5;
        int sum = ((a*b)/(a-b));
        System.out.println(sum);

        // Input
        Scanner sc = new Scanner(System.in);
//        String name = sc.next(); //
//        prints only starting letter of sentence
        System.out.println("enter name and age");
           String name = sc.nextLine();
           int age = sc.nextInt();
           //nextInt()
        System.out.println(name);
        System.out.println(age);
    }
}
