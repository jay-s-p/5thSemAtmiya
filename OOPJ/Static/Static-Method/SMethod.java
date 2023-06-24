/*
 *
 *
 * This Program is only for understanding purpose.
 * 
 * 
 */

class SMethod {

    static int staticVar = 0;
    int nonStaticVar = 0;

    static void staticMethod() {
        System.out.println(staticVar);
        // System.out.println(nonStaticVar);    // ERROR : *static method* cannot access *non-static variable*.
        // nonStaticMethod();                   // ERROR : *static method* cannot access *non-static method*
        // System.out.println(this.staticVar);  // ERROR : this keyword cannot use in static method.
    }

    void nonStaticMethod() {                    // In non-static method, static as well as non-static method can be access.
        System.out.println(staticVar);
        System.out.println(this.staticVar);     // it's just run fine, but will throw WARNING, so use it without 'this' keyword :)
        System.out.println(nonStaticVar);
        System.out.println(this.nonStaticVar);
        staticMethod();
        this.staticMethod();                    // same here it's just run fine, but will throw WARNING, so use it without 'this' keyword.
        nonStaticMethod();
        this.nonStaticMethod();
    }
}