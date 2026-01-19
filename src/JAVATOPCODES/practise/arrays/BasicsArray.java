package JAVATOPCODES.practise.arrays;

public class BasicsArray {
    public static void main(String[] args) {

// creating an array with new keyword
        int[] marks = new int[5];
        marks[0] = 97;
        marks[1] = 93;
        marks[2] = 95;
        marks[3] = 92;
        marks[4] = 90;
        //marks[5] = 93;
        System.out.println(marks); // will print some jaron like [I@7b23ec81
        System.out.println(marks[0]); // 97

        for (int i = 0; i <marks.length ; i++) {
            System.out.print(marks[i] + " ");
        }
        // creating an array with method 2
          int[] marks2 = { 96,95,43,24,23};
        System.out.println(marks2); //jargon
        System.out.println(marks2[2]); // 43

        for (int i = 0; i < marks2.length ; i++) {
            System.out.print(marks2[i] + " ");
        }
    }


}