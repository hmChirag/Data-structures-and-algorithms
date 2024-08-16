package arrays.sorting;

public class inversionSort {
    
    public static int merge(int[] arr, int start, int mid, int end) {
        int size = end - start + 1;
        int[] sortedArr = new int[size];

        int i = start, j = mid + 1;
        int index = 0,ans=0;

        while (i <= mid && j <= end) {
            if (arr[i] > (arr[j])) {
                ans+=(mid-i+1);
                sortedArr[index++] = arr[i++];
            } else {
                sortedArr[index++] = arr[j++];
            }
        }

        // Copy remaining elements from the left half (if any)
        while (i <= mid) {
            sortedArr[index++] = arr[i++];
        }

        // Copy remaining elements from the right half (if any)
        while (j <= end) {
            sortedArr[index++] = arr[j++];
        }

        // Copy the merged sorted array back to the original array
        for (int k = 0; k < size; k++) {
            arr[start + k] = sortedArr[k];
        }
        return ans;
    }
    public static int mergeSort(int[] arr, int start, int end) {
        if (start >= end) {
            return 0;
        }

        int mid = (start + end) / 2;

      
        int leftinversion= mergeSort(arr, start, mid);
        int rightinversion =mergeSort(arr, mid + 1, end);

    
        int crossinversion=merge(arr, start, mid, end);
        return leftinversion+rightinversion+crossinversion;
    }

    
}
