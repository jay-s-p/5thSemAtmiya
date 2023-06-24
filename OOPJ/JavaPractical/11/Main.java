/*
 * 
 * Declare an Array with two elements,
 * try to access the third element a[3] = 30/0 which throws Exception 
 * and write multiple catch block on this.
 * 
 */

class Main {
    public static void main(String[] args) {
        int arr[] = { 1, 2 };
        try {
            arr[3] = 30 / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
