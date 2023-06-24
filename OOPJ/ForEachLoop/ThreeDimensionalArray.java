class ThreeDimensionalArray {
    public static void main(String[] args) {
        int array[][][] = { { { 1, 2, 3 }, { 4 }, { 5, 6 } }, { { 7 }, { 8, 9 } }, { { 10, 11, 12 } } };
        for (int x[][] : array) {
            for (int y[] : x) {
                for (int z : y) {
                    System.out.print(z + " ");
                }
                System.out.println();
            }
            System.out.println("-------");
        }
    }
}