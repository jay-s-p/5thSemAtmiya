// WAP to find length of a string without using built-in function.

class StringLength {

    public static void main(String[] args) {

        String str = "This is a String.";
        int length = 0;
        try {
            while (true) {
                str.charAt(length++);
            }
        } catch (Exception e) {
        }
        System.out.println("String length : " + length);
    }
}