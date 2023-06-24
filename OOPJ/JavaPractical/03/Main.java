/*
 * 
 * WAP to do followings using inbuilt methods in String class of Java.
 * 1. find the third character in the string "Hello World"
 * 2. find the index of character o in the string "JAVA PROGRAMMING"
 * 3. Convert the String "be honest" into Uppercase.
 * 4. Replace the character l with i in the String "Hello"
 * 
 */

class Main {
    public static void main(String[] args) {

        String str;
        // 1
        str = "Hello World";
        System.out.println(str.charAt(3)); // l

        // 2
        str = "JAVA PROGRAMMING";
        System.out.println(str.indexOf('o')); // -1

        // 3
        str = "be honest";
        System.out.println(str.toUpperCase()); // BE HONEST

        // 4
        str = "Hello";
        System.out.println(str.replaceAll("l", "i")); // Heiio
    }

}
