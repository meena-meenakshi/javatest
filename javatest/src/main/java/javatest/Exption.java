package javatest;
//*************************Exception handling with try{} catch(){}*********************************
public class Exption {

	public static void main(String[] args) {
		
		//String s=null;
		try
		{
			//int variable =5/0;	
			String s=null;
			s.length();
		}
		/*catch(ArithmeticException e) 
		{
			System.out.println(e);
		}*/
		catch(NullPointerException n) {
			
			System.out.println(n);
			
		}
		System.out.println("code executed");

	}

    //System.out.println(s.length());
	}

		
