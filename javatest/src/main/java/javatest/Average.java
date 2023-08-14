package javatest;

public class Average {
	
	void avg(int x,int y,int z)
	{
		int average = (x+y+z)/3;
		System.out.println("average of 3 integers ="+ average);
	}
	void avg(double d,double e,double f)
	{
		double average = (d+e+f)/3;
		System.out.println("average of 3 float ="+ average);
	}
	
 /*	public static int avg(int x,int y,int z)
	{
		int average = (x+y+z)/3;
		return average;
		
	}
	public static double avg(double x,double y,double z) {
		double average= (x+y+z)/3;
		return average;
	}
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Average ob = new Average();
		ob.avg(2, 3, 4);
		ob.avg(1.2,1.3,1.5);
		//System.out.println("average of 3 integers ="+avg(1,2,3));
		//System.out.println("average of 3 floats= "+avg(1.5,2.5,3.5));

	}

}
