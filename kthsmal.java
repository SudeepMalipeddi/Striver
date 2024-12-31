import java.util.*;

public class kthsmal {
    public static int kthsmallest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
            System.out.println(pq.toString());
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        int[] arr = { 7, 10, 4, 3, 20, 15 };

        int k = 3;

        int res = kthsmallest(arr, k);

        System.out.println(res);
    }
}
