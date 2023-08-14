package training;

import java.util.Scanner;

class Salary_1{
public int basicpay,deduction,bonus;
public void getsalary() {
Scanner ob = new Scanner(System.in);
System.out.println("enter basic pay ");
basicpay= ob.nextInt();
System.out.println("enter deduction ");
deduction=ob.nextInt();
System.out.println("enter bonus ");
bonus= ob.nextInt();
}
}


class Salary_2 extends Salary_1
{
	public double hra,pf;
	public void calc() {
	 hra= (basicpay*5)/100;
	 pf = (basicpay*20)/100;
	
}
}
class Salary_3 extends Salary_2
{
	double totalsalary= basicpay+hra+pf+deduction+bonus;
	
	public void displaysalaryslip() {
		
		System.out.println("*****salary Slip*****\n"+"\nBasic pay = "+basicpay+"\nDeduction = "+deduction+"\nBonus = "+bonus+"\nHRA = "+hra+"\nPF = "+pf);
	}
	
}



public class Salary {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salary_3 obj = new Salary_3();
		obj.getsalary();
		obj.calc();
		obj.displaysalaryslip();

	}

	}



