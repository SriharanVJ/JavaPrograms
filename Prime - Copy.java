import java.util.Scanner;
public class Prime
{
	public static void main(String[] args)
	{
		int flag=0,m=0,i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no for check prime or not");
		int n=s.nextInt();
		m=n/2;
		if(n==0||n==1)
		{
			System.out.println("The given no is not a prime number : "+ n);
		}
		else
		{
			for(i=2;i<=m;i++)
			{
				if(n%2==0)
				{
					System.out.println("The given no is not a prime :" +n);
					flag=1;
					break;
				}
				 
			}
		
			if(flag == 0)
		    {
					System.out.println("The given no is prime :" +n);
			}
		
        }
		
	}
}