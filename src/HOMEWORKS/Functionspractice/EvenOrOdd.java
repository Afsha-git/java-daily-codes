package HOMEWORKS.Functionspractice;

public class EvenOrOdd {
    static boolean isEvenOrOdd(int n){
        return n % 2 == 0;
    }

    static void evenOrOdd(int n){
        for (int i = 1; i <=n ; i++) {
          if(isEvenOrOdd(i)){
              System.out.print(i + " ");
          }
        }
    }
    public static void main(String[] args) {
        int n = 9;
        System.out.println(isEvenOrOdd(n)); // false
        evenOrOdd(20); // prints even numbers
    }

}
