class Outer {
	
	static class InnerStatic {
		String name;

		void print(String s) {
			System.out.println(s);
		}
	}

	public static void main(String args[]) {
		InnerStatic x = new InnerStatic();
		x.print("Hello");
	}
}