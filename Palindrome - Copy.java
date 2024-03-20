import java.util.Scanner;
public class Palindrome
{
	public static void main(String[] args) 
	{
		int r,n,sum=0,temp;
		Scanner d=new Scanner(System.in);
		System.out.println("Enter no to check palindrome or not");
		n=d.nextInt();
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		if(sum == temp)
		{
			System.out.print("The given no is"+"palindrome:"+sum);
		}
		else
		{
			System.out.println("The given no is not"+"a palindrome:"+sum);
		}
	}
}