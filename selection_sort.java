public class selection_sort {
    static void selectionsort(int arr[]){
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            int idx = 0;
            for(int j=1; j<n-i; j++){
                if(arr[j]>arr[idx]){
                    idx = j;
                }
            }
            int temp = arr[idx];
            arr[idx] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
    }
    public static void main(String[] args) {
        int morb[] = {1,5,2,0,34,21,22,33};
        selectionsort(morb);
        for(int i = 0; i<morb.length; i++){
            System.out.print(morb[i] + " ");
        }
    }
}
