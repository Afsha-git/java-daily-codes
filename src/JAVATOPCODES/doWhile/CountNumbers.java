package JAVATOPCODES.doWhile;
import java.util.*;
public class CountNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos = 0,neg =0,z=0;
        int choice = 0;
        do {
            System.out.println(" enter numbers");
            int num = sc.nextInt();
            if (num > 0) {
                pos++;
            } else if (num < 0) {
                neg++;
            } else {
                z++;
            }
            System.out.println(" choose y or n");
            choice = sc.next().charAt(0);
        } while(choice == 'y');

        System.out.println(" positive " + pos);
        System.out.println(" negative " + neg);
        System.out.println(" zero " + z);
    }
}
