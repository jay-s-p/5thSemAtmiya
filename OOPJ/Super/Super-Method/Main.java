class A {
	void print() {
		System.out.println("A");
	}
}

class B extends A {
	void print() {
		System.out.println("B");
		super.print();
	}
}

class Main {
	public static void main(String args[]) {
		B x = new B();
		x.print();
	}
}