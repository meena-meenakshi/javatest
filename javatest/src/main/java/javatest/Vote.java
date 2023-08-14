package javatest;

public class Vote {
	
	
	public boolean age(int x) {
		
		if(x>18)
		return true;
		else
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vote ob =new Vote();
		boolean s= ob.age(15);
		if (s==true)
			System.out.println("eligble for voting");
		else
			System.out.println("not eligible for voting");
	}

}
