public class Reverse_array {
    public void reverse(int[] arr){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++; end--;
        }
    }
}
