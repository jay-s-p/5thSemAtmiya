package MathPack;

public class MathDemo {
    public int add(int a, int b, int... args) {
        int ans = a + b;
        return ans;
    }

    public int sub(int a, int b, int... args) {
        int ans = a - b;
        return ans;
    }
}
// javac -d . MathDemo.java 
