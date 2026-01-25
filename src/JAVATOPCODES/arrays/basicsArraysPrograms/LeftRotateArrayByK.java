package JAVATOPCODES.arrays.basicsArraysPrograms;

/*
PROGRAM: Left Rotate Array by K

WHAT IT DOES:
Rotates an array to the left by K positions.

APPROACH (INTERVIEW EXPLANATION):
"I rotate the array one position at a time.
In each rotation, I store the first element,
shift remaining elements left,
and place the first element at the end."

TIME COMPLEXITY:
O(n × k)

SPACE COMPLEXITY:
O(1)

COMMON INTERVIEW FOLLOW-UP:
Q: Can this be optimized?
A: Yes, using reversal algorithm (later).
*/

public class LeftRotateArrayByK {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        int n = arr.length;

        for (int r = 1; r <= k; r++) {

            int first = arr[0];   // store first element

            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];   // shift left
            }

            arr[n - 1] = first;   // put first at end
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
