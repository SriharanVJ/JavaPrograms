import java.util.Scanner;
class add
{	
	int x,z;
	String y;
		public void A()
   {
   		Scanner sc = new Scanner(System.in);
   		System.out.println("ID:");
   		int x=sc.nextInt();
   		System.out.println("Name:");
   		String y=sc.next();
   		System.out.println("Salary:");
   		int z=sc.nextInt();
   		 System.out.println("Employee Id    Employee Name     Salary/month"  );
	   System.out.println(x+"		"+y+"		"+z );
	 
   }
}
   class view 
   {

	 	public void B()
	 	{
	 		 System.out.println("Employee Id    Employee Name     Salary/month"  );
	 	System.out.println("    1        Dhinakar.C       Rs.35,000");
	 	System.out.println("    2        Nandhakumar.S    Rs.35,000");
	 	System.out.println("    3        Karthick.R       Rs.35,000");
	 }
	
	}
	class exit
	{
		public void C()
		{
		System.out.println("Thank you for coming");
	}
	}
	public class Employee
	{
	public static void main(String[] args) 
	{
		add obj1=new add();
		view obj2=new view();
		exit obj3=new exit();
 		Scanner sc = new Scanner(System.in);
 		System.out.println("Choose:");
		System.out.println("1-Add"); 
		int add = sc.nextInt();
		 switch(add)
        {
        	case 1:
        	
        	obj1.A();
        	
        	break;
        }
        	System.out.println("2-View"); 
		int view = sc.nextInt();
        switch(view)
        {        
       	case 2:
        	obj2.B();
        	break;
        }
        System.out.println("3-Exit"); 
		int exit = sc.nextInt();
        switch(exit)
        {
        	case 3:
        	obj3.C();
        	break;
        	default:
        	System.out.println("enter valid number");
        }
	}
}
