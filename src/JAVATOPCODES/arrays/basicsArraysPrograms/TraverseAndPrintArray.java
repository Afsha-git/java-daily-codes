/*Since arrays in Java are indexed from 0,
I use a loop from index 0 to length minus one and print each element.
 This visits each element exactly once,
  so the time complexity is O(n) and
  space complexity is O(1)

  Algorithm : linear scan


*/

package JAVATOPCODES.arrays.basicsArraysPrograms;

public class TraverseAndPrintArray {

    public static void main(String[] args) {
        int arr[] = {44, 24,35,77,24,56};
        System.out.println(" here is the array : ");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
