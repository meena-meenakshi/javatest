package training;

public class Factorial {
	
	public static int fact(int n) {
		
		int result =1;
		
		for(int i=1;i<=n;i++) {
			result=result*i;
		}
		
		return result;
		
	}
	static void display() {
		int result=fact(5);
		System.out.println("factorial is = "+result);
	}

	public static void main(String[] args) {

		display(); //int result= Factorial.fact(5);
		//System.out.println(reslt);


	}

}
