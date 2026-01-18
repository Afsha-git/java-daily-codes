/*his loop will run infinitely because the condition never becomes false. In real applications, we should use a proper exit condition or a break statement */

package JAVATOPCODES.doWhile;

public class InfiniteLoop {
    public static void main(String[] args) {
        do{
            System.out.println(" hello");// print infinite times
          // break; it will make it print only one time
        }
        while(true);
    }
}