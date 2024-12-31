package Basics.Maths;

import java.util.ArrayList;
import java.util.List;

public class countDigits {
    public static void main(String[] args) {
        int n = 23;
        int x = n;
        // String x = Integer.toString(n);

        // for(char a:x.toCharArray()){

        // }
        List<Integer> res = new ArrayList<>();
        while (n > 0) {
            int temp = n % 10;
            if (x % temp == 0)
                res.add(temp);
            n /= 10;
        }
        System.out.println(res);

    }
}
