package JAVATOPCODES.functions;

public class SeriesOfSquareRoot {
      static void seriesOfSquareRoot(int n){
          for (int i = 1; i <=n ; i++) {
              System.out.print(i * i+ " ");
          }
      }
    public static void main(String[] args) {
        seriesOfSquareRoot(9);
    }
}
