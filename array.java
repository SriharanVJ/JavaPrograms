import java.util.Scanner;
public class array{

   public static void main(String args[]){
     
	 Scanner s=new Scanner(System.in);

        

        

        int arr[]=new int[10];
		int i,j,temp,sum=0;

        System.out.println("enter elements");

        for( i=0;i<10;i++){
            arr[i]=s.nextInt();

        }
		 for(int i=0; i<10;i++){
			
			System.out.println( arr[i]);
		} 
		/* for(i=0;i<10;i++)
		{
			for(j=i+1;j<10;j++)
			{
				if(arr[i]<arr[j])
				{
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			
			}
			
			
		}
		System.out.println( "sorted order:");
		for(i=0;i<10;i++)
		{
			System.out.println(arr[i]);
		}
		for(i=0;i<10;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("sum of array is :"+ sum);

        System.out.println("enter the index you want to change");
		int x=s.nextInt();
		System.out.println("enter the value");
		int n=s.nextInt();
		
		arr[x]=n;
		for(i=0;i<10;i++)
		{
			System.out.println(arr[i]);
		} */


    
   }
}