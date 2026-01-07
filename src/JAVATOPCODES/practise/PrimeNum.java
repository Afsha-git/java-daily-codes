package JAVATOPCODES.practise;
/*“A number is prime if it has exactly two factors*/
public class PrimeNum {
    public static void main(String[] args) {
        int n = 7;
        int count = 0;
        for (int i = 1; i <=n ; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if(count == 2){
            System.out.println(" prime number" + n);
        }
        else{
            System.out.println(" not a prime number" + n);
        }
    }
}
