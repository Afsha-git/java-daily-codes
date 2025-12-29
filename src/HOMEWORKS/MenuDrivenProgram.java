package HOMEWORKS;
import java.util.*;

public class MenuDrivenProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("choose option 1 or 0");
        int i;
        do{
            i = sc.nextInt();
            if(i==1){
                System.out.println("enter marks : ");
                int marks = sc.nextInt();
                if(marks >= 90){
                    System.out.println("this is good");
                }
                else if(marks >= 60){
                    System.out.println("this is also good");
                }
                else{
                    System.out.println("try harder dude");
                }
            }
            else if(i!=0) {
                System.out.println("enter only 1 or 0");
            }
        }
        while(i!=0);
        System.out.println("program end here");
    }

}
