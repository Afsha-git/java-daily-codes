package JAVATOPCODES.arrays.basicsArraysPrograms;

/*
 PROGRAM:
 Count even and odd elements in an integer array

 LOGIC:
 - Traverse the array once
 - Use modulo operator to check even or odd
 - Maintain two counters

 ALGORITHM:
 Linear Scan
*/

public class CountEvenOddInArray {

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 3, 5, 7, 5, 8};
        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Even numbers:");
        System.out.println("Odd numbers:");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
                System.out.println(arr[i]);
            } else {
                oddCount++;
                System.out.println(arr[i]);
            }
        }

        System.out.println("\nCount of even numbers: " + evenCount);
        System.out.println("Count of odd numbers: " + oddCount);
    }
}

/*
 TIME COMPLEXITY:
 O(n) — single traversal

 SPACE COMPLEXITY:
 O(1)

 HOW TO EXPLAIN IN INTERVIEW:
 "I traverse the array once and check each element using modulo 2.
 If the element is even, I increment the even counter; otherwise,
 I increment the odd counter. This solves the problem in one pass."

 COMMON FOLLOW-UP:
 Q: Why single loop is better?
 A: It avoids unnecessary traversal and is more efficient.
*/
