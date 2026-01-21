package JAVATOPCODES.arrays.basicsArraysPrograms;

/*
 PROGRAM:
 Find the maximum element in an integer array

 LOGIC / THINKING:
 - Any element in the array can be the maximum
 - So we must check all elements
 - Use a variable to track the largest value found so far

 ALGORITHM USED:
 Linear Scan (Traverse array once and compare elements)
*/

public class MaxElementInArray {

    public static void main(String[] args) {

        int[] arr = {8, 5, 6, 7};          // input array
        int max = Integer.MIN_VALUE;      // stores maximum value

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];             // update max when larger element found
            }
        }

        System.out.println(max);          // prints the maximum element
    }
}

/*
 TIME COMPLEXITY:
 O(n) — array is traversed once

 SPACE COMPLEXITY:
 O(1) — no extra space used

 HOW TO EXPLAIN IN INTERVIEW:
 "I traverse the array once and compare each element with a variable
 that stores the maximum value. If a larger element is found, I update it.
 Since every element is checked once, time complexity is O(n)
 and space complexity is O(1)."

 COMMON INTERVIEW FOLLOW-UP QUESTIONS:
 Q1: Why use Integer.MIN_VALUE?
 A1: To handle arrays that may contain negative numbers.

 Q2: Can we find the maximum without scanning the entire array?
 A2: No, because any element could be the maximum.

 Q3: What if the array is empty?
 A3: We should handle it separately using a condition before the loop.
*/
