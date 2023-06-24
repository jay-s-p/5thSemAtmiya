class A {
	String name = "ABC";
}

class B extends A {
	String name = "XYZ";

	void display() {
		System.out.println("name		: " + name);
		System.out.println("super.name	: " + super.name);
	}
}

class Main {
	public static void main(String args[]) {
		B x = new B();
		x.display();
	}
}