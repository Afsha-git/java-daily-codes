package JAVATOPCODES.practise.arrays;

public class MinElementInArray {
    public static void main(String[] args) {
        int arr[] = {34, 32, 2, 5, 9};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println( " min value is " + min);
    }
}
// same approach like pervious here only msx value is taken also make notes for this now