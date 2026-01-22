package JAVATOPCODES.arrays.basicsArraysPrograms;

/*
 PROGRAM:
 Find the 2nd largest element in an integer array

 LOGIC / THINKING:
 - 2nd largest means the largest element smaller than the maximum
 - Both largest and second largest must come from the array
 - Use two variables to track values while traversing

 ALGORITHM USED:
 Linear Scan with two tracking variables
*/

public class SecondLargestElement {

    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 5, 10};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Second largest element does not exist");
        } else {
            System.out.println("Second largest element is " + secondLargest);
        }
    }
}

/*
 TIME COMPLEXITY:
 O(n) — single traversal

 SPACE COMPLEXITY:
 O(1)

 HOW TO EXPLAIN IN INTERVIEW:
 "I traverse the array once while maintaining two variables:
 one for the largest and one for the 2nd largest element.
 When a larger value is found, I update both variables accordingly.
 This ensures the 2nd largest element is derived from the array itself."

 COMMON INTERVIEW FOLLOW-UP QUESTIONS:
 Q1: Why not use sorting?
 A1: Sorting takes O(n log n); this solution works in O(n).

 Q2: What about duplicate largest values?
 A2: The condition ensures second largest is distinct.

 Q3: What if array size is less than 2?
 A3: Second largest does not exist and should be handled separately.
*/
