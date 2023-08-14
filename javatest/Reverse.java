package training;

public class Reverse {
	
	public Reverse() {
		System.out.println("reverse of number");
		}

	public Reverse(int num) {
		this();
	    int rem,res=0;
		while(num!=0)
		{
		rem=num%10;
		res=(res*10)+rem;
		num=num/10;
		}
		System.out.println(res);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Reverse(123);

	}

}
