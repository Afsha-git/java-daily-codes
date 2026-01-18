/*
GCD (Greatest Common Divisor)
→ The largest number that divides both numbers completely.
  Core Rule (MEMORIZE THIS)

GCD(a, b) = GCD(b, a % b)

Repeat until b == 0.

“I’ll use Euclid’s algorithm because it’s efficient and widely used for GCD.”
 */

package JAVATOPCODES.whileloops;

public class GCD {
    public static void main(String[] args) {
        int a = 12, b = 18;
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("gcd" + ":" + a);
    }
}
