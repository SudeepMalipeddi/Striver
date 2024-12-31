package BinarySearch;

public class lect2 {
    // lower bound

    public int lowerBound(int[] arr, int k) {
        int l = 0;
        int h = arr.length - 1;
        int ans = h + 1;

        while (l <= h) {
            int mid = (l + h) / 2;

            if (arr[mid] >= k) {
                ans = mid;
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return ans;
    }

    // upper bound

    public int upperBound(int[] arr, int k) {
        int l = 0, r = arr.length - 1;
        int ans = r + 1;
        while (l <= r) {
            int mid = (l + r) / 2;

            if (arr[mid] > k) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return ans;
    }
}
