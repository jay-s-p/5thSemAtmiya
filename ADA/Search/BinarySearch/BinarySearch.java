import java.util.Scanner;

class Search {
    static Scanner sc = new Scanner(System.in);

    static int binarySearch(int arr[], int low, int high, int value) {
        while(low <= high)
        {
            int mid = low + (low - high) / 2;
            if(arr[mid]  == value)
            {

            }
        }

        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        System.out.print("\nEnter value to search : ");
        int x = sc.nextInt();

        int pos = binarySearch(arr, 0, arr.length - 1, x);

        if (pos > -1)
            System.out.printf("\n%d found at position %d", x, pos + 1);
        else
            System.out.printf("\n%d is not found!", x);
    }
}