class CountingSort {
    static void countSort(int arr[]) {

        int n = arr.length, max = 0;
        int output[] = new int[n];

        // find max
        for (int i = 0; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        ++max; // because array start from 0

        // declare count array
        int c[] = new int[max];

        // set all c array value to 0
        for (int i = 0; i < max; i++)
            c[i] = 0;

        // perform counting operation
        for (int i = 0; i < n; i++) {
            ++c[arr[i]];
        }

        // addition in count array
        for (int i = 1; i < max; i++) {
            c[i] += c[i - 1];
        }

        // main logic
        for (int i = 0; i < n; i++) {
            output[c[arr[i]] - 1] = arr[i];
            --c[arr[i]];
        }

        for (int i = 0; i < n; i++)
            arr[i] = output[i];
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String args[]) {
        int arr[] = { 1, 4, 1, 2, 9, 5, 2 };
        System.out.print("Original array	: ");
        printArray(arr);

        countSort(arr);

        System.out.print("\n\nSorted array	: ");
        printArray(arr);
    }
}