package JAVATOPCODES.patterns;

public class EvenSolidRectangle {
    public static void main(String[] args) {
        int n = 5;
        int m = 11;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                if(j % 2 ==0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
