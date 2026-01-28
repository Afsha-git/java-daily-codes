package JAVATOPCODES.practise.arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 6, 7};
        int target = 4;

        boolean found = false;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found = true;
                index = i;
                break; // stop once found
            }
        }

        if (found) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
