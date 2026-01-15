package JAVATOPCODES.functions;

public class RadiusOfCircle {
    static double radiusOfCircle(double r){
        double pi = 3.14;
        return 2 * pi * r;
    }
    public static void main(String[] args) {
        double res = radiusOfCircle(9);
        System.out.println(res);
    }
}
