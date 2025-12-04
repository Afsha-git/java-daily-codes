package HOMEWORKS;
import java.util.*;
public class Practise1 {
public static void main(String[] args){
//Try to declare meaningful variables of each type. Eg - a variable named age should be a numeric type (int or float) not byte.
String name = "abc";
int age = 22;
float price = 333.5f;
double value = 345.09d;
long number = 999345234l;
char a = 'q';
boolean b= true;
    System.out.println(name+ "\n"+ age +"\n"+ price +"\n"+ value +"\n"+ number +"\n"+ a +"\n"+b);

    //Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.
    // Area = 3.14*r*r
    System.out.println("enter radius : ");
    float p = 3.14f;
    Scanner sc = new Scanner(System.in);
    float r = sc.nextFloat();
    System.out.println(r);
    float area = p*r*r;
    System.out.println(area);

    //Make a program that prints the table of a number that is input by the user.
    System.out.println("enter a number : ");
    int tb = sc.nextInt();
    System.out.println(tb*1);
    System.out.println(tb*2);
    System.out.println(tb*3);
    System.out.println(tb*4);
    System.out.println(tb*5);
    System.out.println(tb*6);
    System.out.println(tb*7);

}

}

