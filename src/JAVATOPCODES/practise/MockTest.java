package JAVATOPCODES.practise;
/* practice one more time with explaining logic specisally
* even and odd up to n
* prime number
* fibonocii
* and loops programs
* */
public class MockTest {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(" print 1 to n");
        for (int i = 1; i <=n ; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n even or odd up to n");
        for (int i = 1; i <=n ; i++) {
            if(i % 2 == 0){
                System.out.print(i + " is even ");
            }
            else{
                System.out.print(i +" is odd");
            }
        }

        System.out.println("\n factorial ");
        int fact = 1;
        for (int i = 1; i <=n ; i++) {
            fact = fact * i;
        }
        System.out.print("factional of " + n + " is " + fact );

        System.out.println(" \nprime number ");
        for (int i = 2; i <=n; i++) {
            int count = 0;
            for (int j = 1; j <=i ; j++) {
                if(i % j == 0){
                    count++;
                }
                if(count == 2){
                    System.out.print(i + " is prime");
                }
            }
        }
        System.out.println(" \n fibonacci series ");
        int a = 0 , b = 1;
        for (int i = 3; i <=n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b= c ;
        }
        System.out.println(" \n reverse a number");
        int rev = 0;
        int num = 907;
        while( num > 0){
            int digit = num % 10;
            rev = rev * 10 + digit ;
            num = num/10;
        }
        System.out.print(rev);

        System.out.println(" \n sum of digits ");
        int sum = 0;
        int dig = 907;
        while (dig > 0) {
            sum += dig % 10;
            dig /= 10;
        }
        System.out.print(sum);

        System.out.println("\nfirst n even numbers");
        for (int i = 1; i <=n ; i++) {
            System.out.print(2*i + " ");
        }
    }
}
