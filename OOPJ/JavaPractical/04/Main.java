/* 
 * 4. Create a package "mathpack" having class MathDemo 
 * with method add() and sub() to find addition and subtraction 
 * Create another program and import aboves.
 */

import mathpack.MathDemo;

class Main {
    public static void main(String[] args) {
        MathDemo m = new MathDemo();
        System.out.println("1 + 2 + 3 = " + m.add(1, 2, 3)); // 1 + 2 + 3 = 6
        System.out.println("123 + 321 = " + m.add(123, 321)); // 123 + 321 = 444
        System.out.println("321 - 123 = " + m.sub(321, 123)); // 321 - 123 = 198
        System.out.println("3 - 2 - 1 = " + m.sub(3, 2, 1)); // 3 - 2 - 1 = 0
    }
}
