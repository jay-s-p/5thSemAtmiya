class RadixSort {

    static void radixSort(int arr[]) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max)
                max = i;
        }

        for (int div = 1; (max / div) > 0; div *= 10) {
            countSort(arr, div);
        }
    }

    static void countSort(int arr[], int div) {

        int n = arr.length, i;
        int c[] = new int[10], output[] = new int[n]; // declare count and output array

        // perform counting operation in count array
        for (i = 0; i < n; i++) {
            ++c[(arr[i] / div) % 10];
        }

        // addition with previous elements
        for (i = 0; i < 9; i++) {
            c[i + 1] += c[i];
        }

        // count sort logic
        for (i = n - 1; i >= 0; i--) {
            output[c[(arr[i] / div) % 10] - 1] = arr[i];
            --c[(arr[i] / div) % 10];
        }

        // copy output array to main array
        for (i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String args[]) {
        int arr[] = { 902, 802, 45, 66, 24, 75, 170 };
        System.out.print("Original array	: ");
        printArray(arr);

        radixSort(arr);

        System.out.print("\n\nSorted array	: ");
        printArray(arr);
    }
}