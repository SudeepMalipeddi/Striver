public class GCD {
    static int gcd(int a, int b) {
        if (b == 0) {
          return a;
        }
        return gcd(b, a % b);
    }
    public static void main(String[] args) {

        int a=3,b=6;
        for(int i = 1; i<=Math.min(a,b);i++){
            if(a%i==0 && b%i==0){
                gd=i;
            }
        }
        System.out.println(gcd(5,10));
    }
}
