package training;

class Pearson{

String name;
 int no;

Pearson(String name,int no)
{
this.name=name;
this.no=no;

}

public void display()
{

System.out.println("name= "+name+"roll no="+no);

}

public static void main(String[]args)
{
Pearson s1 =new Pearson("meenaksi",10);
Pearson s2 = new Pearson("meena",20);
s1.display();
s2.display();

String s = "Sachin";
s= "Sachin Tendulkar";
System.out.println(s);
}
}


