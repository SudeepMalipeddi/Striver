public class max_min_freq {
    public static void main(String[] args) {
        int arr[] = {10, 5, 10, 15, 10, 5};
        int n = arr.length;
        countFreq(arr,n);
    }
    public static void countFreq(int[] arr, int n){
        boolean visited[] = new boolean[n];
        int maxFreq=0,minFreq=n;
        int maxElem=0,minElem=0;
        for(int i = 0; i<n; i++){
            if(visited[i] == true){
                continue;
            }
            int count = 1;
            for(int j = i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    visited[j] = true;
                    count++;
                }
            }
            if(count > maxFreq){
                maxElem = arr[i];
                maxFreq = count;
            }
            if(count < minFreq){
                minElem = arr[i];
                minFreq = count;
            }
        }
        System.out.println("The highest frequency element is: " + maxElem + " with frequency: " + maxFreq);
        System.out.println("The lowest frequency element is: " + minElem + " with frequency: " + minFreq);
    }
}
