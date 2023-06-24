class SelectionSort {
    static void selectionSort(int arr[]) {
        int n = arr.length;
        int min, temp;
        for (int i = 0; i < n - 1; i++) {
            min = i;
            for (int j = i; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String args[]) {
        int a[] = { 2, 5, 4, 1, 3 };
        System.out.print("Original array	: ");
        printArray(a);

        selectionSort(a);

        System.out.print("\n\nSorted array	: ");
        printArray(a);
    }
}