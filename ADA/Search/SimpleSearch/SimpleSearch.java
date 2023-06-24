import java.util.Scanner;

class Search {
    static Scanner sc = new Scanner(System.in);

    static int search(int arr[], int value) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == value)
                return i;

        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 5, 4, 1, 3 };

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        System.out.print("\nEnter value to search : ");
        int x = sc.nextInt();

        int pos = search(arr, x);

        if (pos > -1)
            System.out.printf("\n%d found at position %d", x, pos + 1);
        else
            System.out.printf("\n%d is not found!", x);
    }
}