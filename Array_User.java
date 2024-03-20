import java.util.Scanner;
public class Array_User
{

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j,temp,sum=0;
		int arr[]=new int[6];
		System.out.println("Enter the values for indexes");
		for(i=0;i<6;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Show the values in indexes");
		/*for(i=0;i<6;i++)
		{
			System.out.println(arr[i]); 
		} */
		System.out.println("The Ascending order of value");
		for(i=0;i<6;i++)
		{
			for(j=i+1;j<6;j++)
			{
				if(arr[i] > arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}	
			}
		}
		System.out.println("The Sorted Array is");
		for(i=0;i<6;i++)
		{
			System.out.println(arr[i]);
		}
	    System.out.println("The Addition of Array");
	    for(i=0;i<6;i++)
	    {
	    	sum=sum+arr[i];
	    }
	    System.out.println("The Additon of Array is " + sum);
	    System.out.println("Enter the value for change index");
	    int s=sc.nextInt();
	    System.out.println("Enter the index for change value");
        int n=sc.nextInt();
        arr[s]=n;
        for(i=0;i<6;i++)
        {
        	System.out.println(arr[i]);
        }
	} 

}