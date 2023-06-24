import java.util.Scanner;

class Demo {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Test t = new Test();
        System.out.print("Enter your age : ");
        try {
            t.valid(sc.nextInt());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class Test {
    void valid(int age) {
        if (age < 18)
            throw new IllegalArgumentException("You are not eligible to vote :(");
        System.out.println("You are eligible to vote :)");
    }
}