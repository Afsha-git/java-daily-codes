package HOMEWORKS.Functionspractice;

public class TableProgram {
    static void tableOfNumber(int n){
        for (int i = 1; i <=10 ; i++) {
            int mul = n*i;
            System.out.println(n + "X" + i + " = " + mul);
        }
    }
    public static void main(String[] args) {
      int n = 9;
      tableOfNumber(9);
      tableOfNumber(7);
    }
}
