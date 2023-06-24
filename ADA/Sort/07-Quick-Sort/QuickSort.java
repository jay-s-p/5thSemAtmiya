class QuickSort {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int arr[], int first, int last) {

        int pivot = arr[last];
        int i = (first - 1);
        int temp;

        for (int j = first; j <= last - 1; j++) {
            if (arr[j] < pivot) {
                ++i;
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        temp = arr[i + 1];
        arr[i + 1] = arr[last];
        arr[last] = temp;

        return (i + 1);
    }

    static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String args[]) {
        int arr[] = { 10, 7, 8, 9, 1, 5 };
        System.out.print("Original array	: ");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.print("\n\nSorted array	: ");
        printArray(arr);
    }
}