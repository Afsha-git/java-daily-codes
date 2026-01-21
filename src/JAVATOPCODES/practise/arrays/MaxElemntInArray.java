/* my thinking : input i will be taking,and i have to find max elemnt in array,
so here the solution i came up is with integer.min value
from which i can get the max elemnt of array and with condition
arr[i] > max){max = arr[i] i could get the max value and also
i took a little peek from yesterday's program for syntax and condition
*
*
* */

package JAVATOPCODES.practise.arrays;

public class MaxElemntInArray {
    public static void main(String[] args) {
     int arr[] ={8,5,6,7};
     int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
         if(arr[i] > max){
             //arr[i] = max; at first i did this but ouptput was totally wrong then i took a little peek and made condition correct
             // so i didnt actually solve the program but just the idea came up with
             max = arr[i];

         }
        }
        System.out.println(max); // -2147483648
    }

}
