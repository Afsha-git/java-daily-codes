/* NOTES
In arrays:
i → index
arr[i] → actual value
*
EXPLANATION:
To find the sum of array elements,I traverse the array using a loop.
For each index, I add the value at that index to a variable called sum.
Since every element is visited once, the time complexity is O(n) and the space complexity is O(1).
The algorithm used is linear scan.

QUESTION : Why can’t we start the loop from i = 1?
ANS:Because arrays in Java are zero-indexed. Starting from 1 would skip the first element
* */

package JAVATOPCODES.arrays.basicsArraysPrograms;

public class SumOFArray {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
           // sum = sum + 1; // this gives me 5
            sum = sum + arr[i] ; // this gives me 10
        }
        System.out.println(sum);
    }
}