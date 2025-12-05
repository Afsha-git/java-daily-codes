package JAVACODES;

public class Loops {
    public static void main(String[] args) {
        System.out.println(" for Loop");
        for (int n = 0; n < 4 ; n = n + 1){
            System.out.print("hello" + " ");
        }
        System.out.println("\n");
        System.out.println("While loop");
        int i = 0;
        while(i<=5){
            System.out.print(i + " ");
            i++;
        }
        System.out.println("\n");
        System.out.println("do- while loop");
        int z =0;
        do{
            System.out.print(z + " ");
            z++;
        }while(z<=5);
        System.out.println("\n");
        int y=13;
        do{
            System.out.println("print hehehe");
            y++;
        }
        while(y<=2);
        System.out.println("print after while ");
    }
}

