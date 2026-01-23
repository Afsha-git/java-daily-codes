/*
PROGRAM: Reverse an Array

PROBLEM STATEMENT:
Given an integer array, reverse its elements in-place.

KEY IDEA:
- Arrays are reversed by swapping elements using indices.
- Mathematical digit operations are NOT used for arrays.

ALGORITHM (Two Pointer):
1. Set left = 0, right = arr.length - 1
2. While left < right:
   - Swap arr[left] and arr[right]
   - left++, right--

TIME COMPLEXITY:
- O(n)

SPACE COMPLEXITY:
- O(1)

INTERVIEW EXPLANATION:
"I use two pointers from both ends and swap elements until they meet.
This reverses the array in-place without extra memory."

COMMON FOLLOW-UP:
- Reverse using recursion
- Reverse a subarray
- Reverse array using extra space
*/

package JAVATOPCODES.arrays.basicsArraysPrograms;

public class ReverseAnArray {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5};

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
