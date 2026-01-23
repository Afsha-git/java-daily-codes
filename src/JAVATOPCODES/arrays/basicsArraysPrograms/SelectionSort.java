package JAVATOPCODES.arrays.basicsArraysPrograms;

/*
PROGRAM: Selection Sort

WHAT IT DOES:
Sorts an array in ascending order by repeatedly selecting the smallest element
from the unsorted part and placing it at the correct position.

APPROACH (INTERVIEW EXPLANATION):
"I divide the array into sorted and unsorted parts.
In each iteration, I find the minimum element from the unsorted part
and swap it with the first element of that part."

HOW IT WORKS:
- Fix one index at a time (i)
- Assume current index has the smallest element
- Search remaining array for a smaller element
- Swap the smallest element to its correct position

TIME COMPLEXITY:
Best Case:    O(n²)
Average Case: O(n²)
Worst Case:   O(n²)

SPACE COMPLEXITY:
O(1) – In-place sorting (no extra space)

COMMON INTERVIEW FOLLOW-UPS:
Q: Is Selection Sort stable?
A: No

Q: Is it in-place?
A: Yes

Q: Why not Arrays.sort()?
A: Arrays.sort() is a library method; interviews test sorting logic.
*/

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {5, 3, 4, 1};

        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;          // assume current index has minimum

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;      // update minimum index
                }
            }

            int temp = arr[i];         // swap elements
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
