class MergeSort {

    static void merge(int arr[], int start, int mid, int end) {

        int merged[] = new int[end - start + 1];
        
        int leftPointer = start;
        int rightPointer = mid + 1;
        int x = 0;
        while (leftPointer <= mid && rightPointer <= end) {
            if (arr[leftPointer] <= arr[rightPointer]) {
                merged[x++] = arr[leftPointer++];
            } else {
                merged[x++] = arr[rightPointer++];
            }
        }
        while (leftPointer <= mid) {
            merged[x++] = arr[leftPointer++];
        }
        while (rightPointer <= end) {
            merged[x++] = arr[rightPointer++];
        }
        for (int i = start, j = 0; j < end - start + 1; i++, j++) {
            arr[i] = merged[j];
        }

    }

    static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei)
            return;
        int mid = si + (ei - si) / 2;

        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);

        merge(arr, si, mid, ei);
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String args[]) {
        int arr[] = { 5, 4, 3, 2, 1 };
        System.out.print("Original array	: ");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.print("\n\nSorted array	: ");
        printArray(arr);
    }
}