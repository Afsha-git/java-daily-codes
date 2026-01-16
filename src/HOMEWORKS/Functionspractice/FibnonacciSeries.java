package HOMEWORKS.Functionspractice;

public class FibnonacciSeries {
     // fibnoci of nth term
    static int fibnocciNth(int n){
        if(n <=1) return n;
        int a = 0, b= 1;
        for (int i = 2; i <=n ; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    static void fibnocciSeries(int n){
        int a = 0, b= 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i <=n ; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
            }
    public static void main(String[] args)
    {
         int res = fibnocciNth(3);
        System.out.println(res);
        fibnocciSeries(7);
    }
}
