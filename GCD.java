public class GCD {
    static int gcd(int a, int b) {
        if (b == 0) {
          return a;
        }
        return gcd(b, a % b);
    }
    public static void main(String[] args) {    
        int a=3,b=6;
        System.out.println(gcd(5,10));
    }
}
