import java.util.*;

public class check {
    public boolean checkIfExists(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : arr) {
            if (set.contains(x * 2) || (x % 2 == 0 && set.contains(x / 2))) {
                return true;
            }
            set.add(x);
        }
        return false;
    }
}
