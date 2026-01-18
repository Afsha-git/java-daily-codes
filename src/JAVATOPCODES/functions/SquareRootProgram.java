package JAVATOPCODES.functions;

public class SquareRootProgram {
static int squareRoot(int n){
    int res = 0;
    for (int i = 1; i*i<=n ; i++) {
        res = i;
    }
    return res;
}

static int square(int n){
    return n * n;
}
    public static void main(String[] args) {
        System.out.println(squareRoot(64));
        int ans = square(9);
        System.out.println(ans);
    }
}
