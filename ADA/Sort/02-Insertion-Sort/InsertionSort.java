class InsertionSort {
    static void insertionSort(int[] arr) {
        int i, j, key;
        for (i = 1; i < arr.length; i++) {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String args[]) {
        int arr[] = { 2, 5, 4, 1, 3 };
        System.out.print("Original array	: ");
        printArray(arr);

        insertionSort(arr);

        System.out.print("\n\nSorted array	: ");
        printArray(arr);
    }
}