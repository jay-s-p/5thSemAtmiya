package mathpack;

public class MathDemo {
    public int add(int a, int b, int... args) {
        int ans = a + b;
        for (int i : args) // for more than 2 arguments...
            ans += i;
        return ans;
    }

    public int sub(int a, int b, int... args) {
        int ans = a - b;
        for (int i : args) // for more than 2 arguments...
            ans -= i;
        return ans;
    }
}
// javac -d . MathDemo.java 