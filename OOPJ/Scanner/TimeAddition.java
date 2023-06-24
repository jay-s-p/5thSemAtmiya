import java.util.Scanner;

class Time {

	int sec, min, hour;
	Scanner sc = new Scanner(System.in);

	void getData() {
		System.out.print("Enter the hour    : ");
		hour = sc.nextInt();
		System.out.print("Enter the minute  : ");
		min = sc.nextInt();
		System.out.print("Enter the second  : ");
		sec = sc.nextInt();
	}

	void printData() {
		System.out.printf("Addition is : %d : %d : %d", hour, min, sec);
	}

	Time sum(Time t1, Time t2) {

		Time t3 = new Time();
		int ss, mm, hh;

		ss = t1.sec + t2.sec;
		t3.sec = ss % 60;
		ss = ss / 60;

		mm = t1.min + t2.min + ss;
		t3.min = mm % 60;
		mm = mm / 60;

		hh = t1.hour + t2.hour + mm;
		t3.hour = hh % 60;

		return t3;
	}
}

class TimeAddition {

	public static void main(String[] args) {
		Time t1 = new Time();
		Time t2 = new Time();
		Time Sum = new Time();

		t1.getData();
		t2.getData();
		Sum = t1.sum(t1, t2);
		Sum.printData();
	}

}
