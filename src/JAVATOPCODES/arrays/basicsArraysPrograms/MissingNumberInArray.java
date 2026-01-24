package JAVATOPCODES.arrays.basicsArraysPrograms;

/*
PROGRAM: Find Missing Number in Array

WHAT IT DOES:
Finds the missing number from a sequence of 1 to n+1
using sum difference approach.

APPROACH (INTERVIEW EXPLANATION):
"I calculate the expected sum of numbers from 1 to n+1.
Then I subtract the actual sum of array elements.
The difference gives the missing number."

TIME COMPLEXITY:
O(n) – single traversal

SPACE COMPLEXITY:
O(1) – no extra space used

COMMON INTERVIEW FOLLOW-UPS:
Q: Can this be done without sorting?
A: Yes, using sum formula.

Q: What if numbers are large?
A: Use long instead of int.
*/

public class MissingNumberInArray {
    public static void main(String[] args) {

        int[] arr = {1,3,4,5};
        int n = arr.length + 1;     // total numbers including missing

        int expectedSum = n * (n + 1) / 2;   // sum from 1 to n
        int actualSum = 0;

        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];    // add array values
        }

        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing number is: " + missingNumber);
    }
}
