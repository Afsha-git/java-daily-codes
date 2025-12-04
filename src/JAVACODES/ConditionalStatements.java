package JAVACODES;
import java.util.*;

public class ConditionalStatements {
public static void main(String[] args){
    // if,elseif,else
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your age : ");
    int age = sc.nextInt();
    if(age>=18){
        System.out.println("you are a adult");
    }
    else {
        System.out.println("you are not an adult: BABY");
    }
//Switch
    System.out.println("enter a button number ");
int button = sc.nextInt();
    switch (button){
        case 1:
            System.out.println("hello");
            break;
        case 2:
            System.out.println("hello2");
            break;
        case 3:
            System.out.println("hello3");
            break;
        default:
            System.out.println("invalid");
            break;
    }


}




}
