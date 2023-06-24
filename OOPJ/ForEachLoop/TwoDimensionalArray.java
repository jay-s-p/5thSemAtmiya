class TwoDimensionalArray {
    public static void main(String[] args) {
        int array[][] = { { 1, 2, 3 }, { 4, 5 }, { 6 }, { 7, 8, 9 } };
        for (int x[] : array) {
            for (int y : x)
            {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}