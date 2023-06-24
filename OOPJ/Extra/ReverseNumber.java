import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int reversed = 0, temp = num;
        while (temp != 0) {
            reversed = reversed * 10 + (temp % 10);
            temp /= 10;
        }

        System.out.println("Reversed number : " + reversed);
    }
}
