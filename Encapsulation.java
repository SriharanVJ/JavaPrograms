import java.util.Scanner;
class mass
{
	public void show(int t)
	{
		System.out.print(t);
	}
}
class add1 extends mass
{
	public void addition(int x,int y)
	{
		int val;
		val=x+y;
		System.out.print("The addition is:");
		show(val);
	}
}
class sub1 extends mass
{
	public void subtraction(int x,int y)
	{
		int val;
		val=x-y;
		System.out.println("The subtraction is:");
		show(val);
	}
}
class mul1 extends mass
{
	public void multiplication(int x,int y)
	{
		int val;
		val=x*y;
		System.out.println("The multiplication is:");
		show(val);
	}
}
class div1 extends mass
{
	public void division(int x,int y)
	{
		int val;
		val=x%y;
		System.out.println("The division is:");
		show(val);
	}
}
class eg
{
	private int p,q;
	public int getP()
	{
		return p;
	}
	public void setP(int p)
	{
		this.p=p;
	}
	public int getQ()
	{
		return q;
	}
	public void setQ(int q)
	{
		this.q=q;
	}
}
class Encapsulation
{
	public static void main(String[] args) 
	{
	  add1 o1=new add1();
	  sub1 o2=new sub1();
	  mul1 o3=new mul1();
	  div1 o4=new div1();
	  eg o5=new eg();
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter two values for the operation");
	  int n=sc.nextInt();
	  int m=sc.nextInt();
	  o5.setP(n);
	  o5.setQ(m);
	  System.out.println("Choose any one: 1.add 2.sub 3.mul 4.div");
	  int get=sc.nextInt();
	  switch(get)
	  {
	  	case 1:
	  	o1.addition(o5.getP(),o5.getQ());
	  	break;
	  	case 2:
	  	o2.subtraction(o5.getP(),o5.getQ());
	  	break;
	  	case 3:
	  	o3.multiplication(o5.getP(),o5.getQ());
	  	break;
	  	case 4:
	  	o4.division(o5.getP(),o5.getQ());
	  	break;
	  	default:
	  	System.out.println("Enter valid option");
	  }
	}
}