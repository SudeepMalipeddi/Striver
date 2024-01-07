import java.util.*;

public class union_of_sorted_arr {
    public int[] findUnion(int[] arr1, int[] arr2) {
        
        // int[] merge = new int[arr1.length + arr2.length];

        // int i = 0, j = 0, k = 0;
        // while (i < arr1.length && j < arr2.length) {
        //     merge[k++] = arr1[i] < arr2[j] ? arr1[i++] : arr2[j++];
        // }
        // while (i < arr1.length) {
        //     merge[k++] = arr1[i++];
        // }
        // while (j < arr2.length) {
        //     merge[k++] = arr2[j++];
        // }

        // int[] union = new int[merge.length];
        // union[0] = merge[0];
        // int l = 1;
        // for (int m = 1; m < merge.length; m++) {
        //     if (merge[m] != merge[m - 1]) {
        //         union[l++] = merge[m];
        //     }
        // }
        // return union;
        
        // n = 5, m = 5


        // using set to solve the problem

        // Set<Integer> set1 = new TreeSet<>();
        // for(int i=0; i<arr1.length; i++){
        //     set1.add(arr1[i]);
        // }
        // for(int i=0; i<arr2.length; i++){
        //     set1.add(arr2[i]);
        // }
        // int[] union = new int[set1.size()];
        // int i = 0;
        // for(int x : set1){
        //     union[i] = x;
        //     i++;
        // }

        // return union;

        // using two pointers to solve the problem

        int[] unions = new int[arr1.length + arr2.length];

        int i = 0, j = 0;

        int k = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] == arr2[j]){
                unions[k++] = arr1[i++];
                j++;
            }else if(arr1[i] < arr2[j]){
                unions[k++] = arr1[i++];

            }else{
                unions[k++] = arr2[j++];
            }
        }
        while(i < arr1.length){
            unions[k++] = arr1[i++];
        }
        while(j < arr2.length){
            unions[k++] = arr2[j++];
        }

        int[] union = new int[k];

        for(int l = 0; l < k; l++){
            union[l] = unions[l];
        }

        return union;


    }
    public static void main(String[] args) {
        union_of_sorted_arr u = new union_of_sorted_arr();
        int[] arr1 = {1, 2, 3, 4, 5,7};
        int[] arr2 = {1, 2, 3,6,8};
        int[] union = u.findUnion(arr1, arr2);
        for (int i = 0; i < union.length; i++) {
            System.out.print(union[i] + " ");
        }
    }
}
