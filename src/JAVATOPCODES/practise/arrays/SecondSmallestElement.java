package JAVATOPCODES.practise.arrays;

public class SecondSmallestElement {
    public static void main(String[] args) {
        int arr[] = {5,9,8,2,4};
        int smallest = Integer.MAX_VALUE;
        int SecondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] < smallest){
                SecondSmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i] > smallest && arr[i] < SecondSmallest){
                SecondSmallest = arr[i];
            }
        }
        System.out.println(SecondSmallest);

    }
}
