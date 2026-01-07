package JAVATOPCODES.practise;

public class PrintEvenOrOddUpton {
    public static void main(String[] args) {
        int n = 20;
        System.out.println("even numbers : ");
        for (int i = 1; i <=n; i++) {
            if(i % 2 == 0){
                System.out.print(i + "  ");
            }
        }
        System.out.println("\nodd numbers : ");
        for (int i = 1; i <=n; i++) {
            if(i % 2 != 0){
                System.out.print(i + "  ");
            }
        }

    }
    }
