/*
PROGRAM: Remove Duplicates from an Array (Unsorted → Sorted → Unique)

PROBLEM STATEMENT:
Given an integer array (not sorted), remove duplicate elements and
print only unique elements.

APPROACH USED:
1. First SORT the array using Arrays.sort()
2. Then apply TWO POINTER technique to remove duplicates

WHY THIS APPROACH:
- Two pointer technique works ONLY on sorted arrays
- Sorting makes duplicates adjacent
- Arrays.sort() is optimized and interview-acceptable

ALGORITHM:
1. Sort the array
2. Initialize j = 0 (index of last unique element)
3. Traverse array from index 1:
   - If arr[i] != arr[j]:
       j++
       arr[j] = arr[i]
4. Print elements from index 0 to j

TIME COMPLEXITY:
- Sorting: O(n log n)
- Removing duplicates: O(n)
- Overall: O(n log n)

SPACE COMPLEXITY:
- O(1) (ignoring internal sort stack)

HOW TO EXPLAIN IN INTERVIEW:
"If the array is unsorted, I first sort it so that duplicates become adjacent.
Then I remove duplicates in-place using two pointers."

COMMON FOLLOW-UP QUESTIONS:
1. Can this be done without sorting? (Yes, using HashSet)
2. Which is better: HashSet or sorting? (Depends on space/time constraints)
3. What if array is already sorted? (Skip sorting step)
*/

package JAVATOPCODES.arrays.basicsArraysPrograms;

import java.util.Arrays;

public class RemoveDuplicatesUsingSorting {
    public static void main(String[] args) {

        int arr[] = {5, 3, 33, 33, 44, 5};

        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Remove duplicates using two pointers
        int j = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        // Step 3: Print unique elements
        for (int i = 0; i <= j; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
