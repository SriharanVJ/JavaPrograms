import java.util.Scanner;
class Selection_Sort
{
	static void selection(int[] arr)
	{
	  int i,j;
      for(i=0;i<arr.length-1;i++)
      {
      	int index=i;
      	for(j=i+1;j<arr.length;j++)
      	{
      		if(arr[j] < arr[index])
      		{
              index=j;
      		}
      	}
      	int temp=arr[index];
      	arr[index]=arr[i];
      	arr[i]=temp;
      }
	}
	public static void main(String[] args) 
	{
		int[] arr={9,12,6,3,8,4,9,10};
		System.out.println("Before Selection Sort");
		for(int i:arr)
		{  
            System.out.print(i+" ");  
        }
        selection(arr);
        System.out.println("After Selection Sort");
		for(int i:arr)
		{  
            System.out.print(i+" ");  
        }

	}
}