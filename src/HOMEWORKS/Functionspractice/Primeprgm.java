package HOMEWORKS.Functionspractice;

public class Primeprgm {
    static boolean isPrime(int n){
           if(n <= 1)
               return false;
        for (int i = 2; i < n; i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    static void primeNum(int n){
        for (int i = 2; i <=n ; i++) {
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        int n = 1;
        System.out.print(isPrime(n));
        primeNum(30);
    }
}
