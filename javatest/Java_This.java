package training;

public class Java_This {

	public void display() {
		System.out.println("display");

	}

	public void display_1() {
		display();

	}

	public static void main(String[] args) {
		Java_This obj = new Java_This();
        obj.display_1();
	}

}
