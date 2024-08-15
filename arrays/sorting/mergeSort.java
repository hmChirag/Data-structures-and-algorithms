package arrays.sorting;

public class mergeSort {

    public static void MergeSort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = (si + ei) / 2;
        MergeSort(arr, si, mid);
        MergeSort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(int[] arr, int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        // Merge the two halves
        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // Copy remaining elements from left half
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // Copy remaining elements from right half
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy sorted temp array back to the original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Given Array:");
        printArray(arr);

        MergeSort(arr, 0, arr.length - 1);

        System.out.println("\nSorted Array:");
        printArray(arr);
    }
}
