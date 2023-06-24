class A {
	A() {
		System.out.println("A");
	}

	A(String s) {
		System.out.println(s);
	}
}

class B extends A {
	B() {
		super("Hello");
		System.out.println("B");
	}
}

class Main {
	public static void main(String args[]) {
		B x = new B();
	}
}