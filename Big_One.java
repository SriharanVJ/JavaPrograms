public class Big_One
{
	static void find(int[] n)
	{
	   int max[j]=n[0];
	   int i,j;
      for(i=1;i<n.length;i++)
      {
      	 if(n[i-1] > max[j])
      	 {
      	 	max[j]=n[i-1];
      	 }

      }
      System.out.println(max[j-1]);
	}
	public static void main(String[] args) 
	{
		int[] a={10,4,56,34,53,23,24,54};
		find(a);
	}
}