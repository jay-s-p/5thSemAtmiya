class BubbleSort {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean flag = false;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
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

        bubbleSort(arr);

        System.out.print("\n\nSorted array	: ");
        printArray(arr);
    }
}