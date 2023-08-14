package training;

public class Cat extends Animal {
	
	int a =5;
	
	void display() {
		
		System.out.println("this is a child class");
	}
	

	public static void main(String[] args) {
		
//Cat obj= new Cat();
Animal obj = new Cat();
System.out.println(obj.a);
obj.display();

	}

}
