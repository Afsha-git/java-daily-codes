/*
PROGRAM: Left Rotate Array by 1

PROBLEM STATEMENT:
Given an integer array, rotate the array to the left by one position.

LOGIC / APPROACH:
- Store the first element in a temporary variable.
- Shift all elements one position to the left.
- Place the stored element at the last index.

ALGORITHM:
1. Save arr[0] in temp
2. For i = 1 to n-1:
      arr[i-1] = arr[i]
3. arr[n-1] = temp

TIME COMPLEXITY:
- O(n)

SPACE COMPLEXITY:
- O(1)

HOW TO EXPLAIN IN INTERVIEW:
"I store the first element, shift remaining elements left by one,
and place the stored value at the end. This performs in-place rotation."

COMMON FOLLOW-UP QUESTIONS:
1. Rotate by K positions?
2. Rotate using reversal algorithm?
3. Difference between left and right rotation?
*/

package JAVATOPCODES.arrays.basicsArraysPrograms;

public class LeftRotateByOne {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        int temp = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }

        arr[arr.length - 1] = temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
