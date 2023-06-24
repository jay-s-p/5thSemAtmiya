import java.util.Scanner;

class Complex {
    int a, b;
    Scanner sc = new Scanner(System.in);

    void getData() {
        System.out.print("Enter complex number : ");
        a = sc.nextInt();
        b = sc.nextInt();
    }

    void print() {
        System.out.println(a + " + " + b + "i");
    }

    Complex add(Complex x) {
        Complex sum = new Complex();
        sum.a = a + x.a;
        sum.b = b + x.b;
        return sum;
    }
}

class ComplexAddition {
    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex();

        c1.getData();
        c2.getData();

        Complex sum = c1.add(c2);
        System.out.print("Addition is ");
        sum.print();
    }
}
