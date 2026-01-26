package JAVATOPCODES.practise.arrays;

public class CheckSortedArray {
    public static void main(String[] args) {

        int arr[] = {2, 3, 4, 5, 6};
        boolean isSorted = true;
        for (int i = 0; i <arr.length-1 ; i++) {
            if(arr[i] > arr[i + 1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("arry is sorted");
        }
        else{
            System.out.println(" arry is not sorted ");
        }
    }
}

