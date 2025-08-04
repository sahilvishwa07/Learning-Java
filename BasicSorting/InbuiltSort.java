package BasicSorting;

import java.lang.reflect.Array;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class InbuiltSort {

     public static void printArr(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int compare(int a, int b){
        //a<b -ve
        //a==b  0
        //a>b +ve
        return b-a;
    }
    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest +1];
        for (int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        //sorting
        int j =0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3,5,9, 2};
        countingSort(arr);
        // Arrays.sort(arr, Collections.reverseOrder());
        printArr(arr);
    }
}
