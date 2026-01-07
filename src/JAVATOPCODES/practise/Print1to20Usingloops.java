package JAVATOPCODES.practise;
/*For loop is used when the number of iterations is known. While loop checks the condition first, and do-while executes at least once*/
public class Print1to20Usingloops {
    public static void main(String[] args) {
        int n = 20;
        // for loop
        System.out.println("for loop : ");
        for (int i = 1; i <=n; i++) {
            System.out.print(i + " ");
        }
        // while loop
          int w = 1;
        System.out.println("\nwhile loop ");
        while(w <= n){
            System.out.print(w + " ");
            w++;
        }

        //do -while loop
        int d= 1;
        System.out.println("\ndo-while loop");
        do{
            System.out.print(d + " ");
            d++;
        }
        while(d<=n);
    }

}
