/* 
 * 4. Create a package "MathPack" having class MathDemo 
 * with method add() and sub() to find addition and subtraction.
 * Create another program and import package and invoke methods.
 */

import MathPack.MathDemo;

class Main {
    public static void main(String[] args) {
        MathDemo m = new MathDemo();
        System.out.println("1 + 2 = " + m.add(1, 2));
        System.out.println("4 - 3 = " + m.add(4, 3));
    }
}
