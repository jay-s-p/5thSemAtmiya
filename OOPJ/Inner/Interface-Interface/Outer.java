interface OuterInterface {
	interface InnerInterface {
		void print(String s);
	}
	Outer.Inner createClass();
}

class Outer implements OuterInterface {

	class Inner implements InnerInterface {
		public void print(String s) {
			System.out.println(s);
		}
	}

	public Outer.Inner createClass() {
		return (new Outer()).new Inner();
	}

	public static void main(String args[]) {
		Outer.Inner x = (new Outer()).createClass();
		x.print("Hmm");
	}
}