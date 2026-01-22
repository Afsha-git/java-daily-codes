/*
PROGRAM: Check if an Array is Sorted (Ascending Order)

PROBLEM STATEMENT:
Given an integer array, check whether the elements are sorted in non-decreasing (ascending) order.

LOGIC / APPROACH:
- Traverse the array once.
- Compare each element with its next element.
- If at any point arr[i] > arr[i + 1], the array is not sorted.
- Use a boolean flag to track sorted status.
- Exit early using break for efficiency.

WHY arr.length - 1:
- We compare arr[i] with arr[i + 1].
- To avoid IndexOutOfBoundsException, the loop must stop at the second last index.

ALGORITHM:
1. Assume the array is sorted (isSorted = true).
2. Loop from index 0 to arr.length - 2.
3. If any adjacent pair violates sorted order, mark false and break.
4. Print result based on flag.

TIME COMPLEXITY:
- Best Case: O(1) (array not sorted at start)
- Worst Case: O(n)
- Overall: O(n)

SPACE COMPLEXITY:
- O(1) (constant extra space)

HOW TO EXPLAIN IN INTERVIEW:
"I compare each element with the next one. If any element is greater than its next, the array is not sorted.
I stop early when a violation is found to optimize performance."

COMMON INTERVIEW FOLLOW-UPS:
1. How to check descending order?
2. How to check if array is sorted but rotated?
3. Can this be done recursively?
4. What if duplicates are allowed?
*/

package JAVATOPCODES.arrays.basicsArraysPrograms;

public class CheckSortedArray {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6};
        boolean isSorted = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("array is sorted");
        } else {
            System.out.println("array is not sorted");
        }
    }
}
