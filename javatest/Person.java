package training;

public class Person {
	
	static String name;
	static int age;
	
	public static void setName(String s)
	{
	name =s;	
	}
	public static void setAge(int a)
	{
	age =a;	
	}
	public static String getName()
	{
	return name;
	}
	public static int getAge()
	{
	return age;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Person p = new Person();
		setName("meena");
		String nm=getName();
		setAge(26);
		int ag=getAge();
		System.out.println("name:"+ nm+"   age:"+ag);

	}

}
