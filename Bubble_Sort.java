import java.util.Scanner;
class Bubble_Sort
{
 static void bubblesort(int[] array)
 {
 	int n=array.length;
 	for(int i=0;i<n;i++)
 	{
 		for(int j=1;j<(n-i);j++)
 		{
 			if(array[j] < array[j-1])
 			{
 				int temp;
 				temp=array[j-1];
 				array[j-1]=array[j];
 				array[j]=temp;
 			}
 		}

 	}
 } 
 public static void main(String[] args) 
 {
  int[] array=new int[10];
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter numbers to be sorted");
  for(int i=0;i<array.length;i++)
  {
    array[i]=sc.nextInt();
  }	
  try
  {
  System.out.println("The order before to sort");
  for(int i=0;i<array.length;i++)
  {
  	System.out.println(array[i]);
  }
  bubblesort(array);
  System.out.println("The order after to sort");
  for(int i=0;i<array.length;i++)
  {
  	System.out.println(array[i]);
  }
  }
  catch(ArrayIndexOutOfBoundsException a)
  {
  	System.out.println("arr "+a);
  }
  catch(Exception e)
  {
  	System.out.println(e);
  }
 }
}