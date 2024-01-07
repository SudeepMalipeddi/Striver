/*Input Format: N = 3, nums[] = {3,2,3}
Result: 3
Explanation: When we just count the occurrences of each number
and compare with half of the size of the array, you will get 3 for the above solution.  */

import java.util.*;

public class Majority_Element {
    // HashMap Approach
    public int majority(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        int max = 0;
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) > max) {
                max = map.get(arr[i]);
                res = arr[i];
            }
        }
        return res;
    }

    // Moore's Voting Algorithm

    public int majority2(int[] arr) {
        int n = arr.length;
        int count = 0;
        int el = 0;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                count = 1;
                el = arr[i];
            } else if (el == arr[i]) {
                count++;
            } else {
                count--;
            }
        }
        return el;
    }
}
