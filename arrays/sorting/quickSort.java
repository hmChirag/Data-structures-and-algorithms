package arrays.sorting;

public class quickSort {
    public static void QuickSort(int[] arr, int si, int ei) {
        if (si < ei) {
            // Find the partition index
            int pi = partition(arr, si, ei);

            // Recursively sort elements before and after partition
            QuickSort(arr, si, pi - 1);
            QuickSort(arr, pi + 1, ei);
        }
    }

    // Function to partition the array
    public static int partition(int[] arr, int si, int ei) {
        int pivot = arr[ei]; // Select the rightmost element as pivot
        int i = (si - 1); // Index of smaller element

        for (int j = si; j < ei; j++) {
            // If the current element is smaller than or equal to the pivot
            if (arr[j] <= pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        // Swap arr[i + 1] and arr[ei] (or pivot)
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i; // Return the partition index
    }

    // Function to print the array
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Main method to test the QuickSort
    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int n = arr.length;

        System.out.println("Original Array:");
        printArray(arr);

        QuickSort(arr, 0, n - 1);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
