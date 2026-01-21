package JAVATOPCODES.arrays.basicsArraysPrograms;


/*
 PROGRAM:
 Find the minimum element in an integer array

 LOGIC / THINKING:
 - Any element in the array can be the minimum
 - So we must compare all elements
 - Use a variable to keep track of the smallest value found so far

 ALGORITHM USED:
 Linear Scan (Traverse the array once and compare elements)
*/

public class MinElementInArray {

    public static void main(String[] args) {

        int[] arr = {34, 32, 2, 5, 9};     // input array
        int min = Integer.MAX_VALUE;      // stores minimum value

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];             // update min when smaller element found
            }
        }

        System.out.println("Min value is " + min);  // prints the minimum element
    }
}

/*
 TIME COMPLEXITY:
 O(n) — array is traversed once

 SPACE COMPLEXITY:
 O(1) — no extra space used

 HOW TO EXPLAIN IN INTERVIEW:
 "I initialize a variable with the maximum possible integer value.
 Then I traverse the array and compare each element with the current minimum.
 If a smaller element is found, I update the minimum.
 Since the array is scanned once, the time complexity is O(n)
 and the space complexity is O(1)."

 COMMON INTERVIEW FOLLOW-UP QUESTIONS:
 Q1: Why did you use Integer.MAX_VALUE?
 A1: To correctly handle arrays that may contain large or negative values.

 Q2: Can this be done without scanning the entire array?
 A2: No, because any element could be the minimum.

 Q3: What if the array is empty?
 A3: We should handle it using a condition before the loop.
*/
