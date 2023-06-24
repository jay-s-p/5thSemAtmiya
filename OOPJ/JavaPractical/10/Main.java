/*
 * Voting using User Defined Exception.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter your age : ");
        int age = new Scanner(System.in).nextInt();
        try {
            validAge(age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    static void validAge(int age) throws InvalidAgeException {
        if (age < 18)
            throw new InvalidAgeException("You are not eligible to vote :(");
        System.out.println("You are eligible to vote :)");
    }
}

class InvalidAgeException extends Exception {
    InvalidAgeException(String s) {
        super(s);
    }
}