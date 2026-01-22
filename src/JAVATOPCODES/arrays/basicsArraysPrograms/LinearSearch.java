/*
PROGRAM: Linear Search in Array

PROBLEM STATEMENT:
Given an integer array and a target element, check whether the target exists in the array.
If found, print its index; otherwise, print that the element is not present.

LOGIC / APPROACH:
- Traverse the array from start to end.
- Compare each element with the target.
- If a match is found, print the index and stop searching.
- If traversal completes without a match, the element is not present.

ALGORITHM:
1. Take an array and a target value.
2. Loop through the array using index i.
3. If arr[i] == target:
   - Print index
   - Exit loop
4. If loop ends without finding target, report not found.

TIME COMPLEXITY:
- Best Case: O(1) → target found at first index
- Worst Case: O(n) → target at last index or not present
- Overall: O(n)

SPACE COMPLEXITY:
- O(1)

HOW TO EXPLAIN IN INTERVIEW:
"I scan the array sequentially and compare each element with the target.
If a match is found, I immediately return the index.
This works because arrays allow direct access but not fast searching unless sorted."

COMMON INTERVIEW FOLLOW-UPS:
1. What if the array is sorted? (→ Binary Search)
2. How to return all occurrences?
3. How to optimize search?
4. Difference between linear and binary search?
*/

package JAVATOPCODES.arrays.basicsArraysPrograms;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {4, 7, 2, 9, 5};
        int target = 9;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}
