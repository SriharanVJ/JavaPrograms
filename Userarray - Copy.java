import java.util.Scanner;
public class Userarray 
{
    public static void main(String[] args) 
    {
        int n, temp;
 int sum = 0;
        Scanner s = new Scanner(System.in);
 System.out.print("Enter no. of elements you want in array:");
n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order:");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(a[i]);
        }
         for (int i = 0; i < n; i++) {
sum = sum+a[i];
}
System.out.println("sum of the " + sum);

System.out.println("enter the index you want to change");
int i;
		int o=s.nextInt();
		System.out.println("enter the value");
		int p=s.nextInt();
		
		a[o]=p;
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
    }
}
