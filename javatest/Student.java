package training;


public class Student {

	int mark1;
	int mark2;
	int mark3;
	int total;
    
    public Student(int m1,int m2,int m3) {
    	  mark1 = m1;
    	  mark2=m2;
    	  mark3=m3;
    	
    }
  public  int totalmark() {
	  total= mark1+mark2+mark3;
	  
	return total;
    	
    }
  
   public Student(int ttl) {
	 int t= ttl/3;
      if(t>=80)
      {
          System.out.println("A");
      }
      else if(t>=60 && t<80)
      {
         System.out.println("B");
      } 
      else if(t>=40 && t<60)
      {
          System.out.println("C");
      }
      else
      {
          System.out.println("D");
      }
	
	  
	  
  }
    
	public static void main(String[] args) {
		Student s1 =new Student(10,20,30);
		Student s2 = new Student(50,50,20);
		int totals1= s1.totalmark();
		int totals2= s2.totalmark();
		System.out.println("The grade of student1 is ");
		Student grade1 =new Student(totals1);
		System.out.println("The grade of student2 is ");
		Student grade2 =new Student(totals2);
	}

}
