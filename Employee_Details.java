import java.util.Scanner;
class put
{
	
	public void details(int x)
	{
		int i;
		int[] id=new int[10];
	    char[] name=new char[10];
	    int[] salary=new int[10];
	    char[] address=new char[10];
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the data to be stored");
		System.out.println("Enter id to first stored");
		for(i=0;i<x;i++)
		{
			id[i]=d.nextInt();
		}
		System.out.println("Enter name then to stored");
		for(i=0;i<=x;i++)
		{
			name[i]=d.next().charAt(0);
		}
		System.out.println("Enter salary then to stored");
		for(i=0;i<x;i++)
		{
			salary[i]=d.nextInt();
		}
		System.out.println("Enter address then to stored");
		for(i=0;i<=x;i++)
		{
			address[i]=d.next().charAt(0);
		}
		 
	}
 
    public void display(int x)
    {
    	int i;
        System.out.println("This is to show details of stored data");
        for(i=0;i<x;i++)
        {
            System.out.println(id[i]);
        }
        for(i=0;i<x;i++)
        {
            System.out.println(name[i]);
        }
        for(i=0;i<x;i++)
        {
            System.out.println(salary[i]);
        }
        for(i=0;i<x;i++)
        {
            System.out.println(address[i]);
        } 
    }    
}
class Employee_Details
{
	public static void main(String[] args) 
	{
		put obj1=new put();
		System.out.println("You are welcome to the Employee program");
		while(true)
		{
		System.out.println("Enter your choice: 1.Get-details 2.Diasplay-details 3.exit");
		Scanner sc=new Scanner(System.in);
		int get=sc.nextInt();
		switch(get)
		{
			case 1:
			 System.out.println("Enter no of employee details to be stored");
	         int n=sc.nextInt();
			 obj1.details(n);
			case 2:
			System.out.println("Enter no of employee details to be showed");
	         int s=sc.nextInt();
			 System.out.println("Enter to get details of all employees");
             obj1.display(s);
             break;
             case 3:
              System.exit(0);
			default:
			 break;
		}
	   }
	}
}