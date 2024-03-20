import java.util.Scanner;
public class Object
{
	public static void main(String[] args) 
	{
	   int [][] strinM = new int[5][10];
	  int i,j;
	  Scanner n=new Scanner(System.in);
	  for(i=0;i<3;i++)
	  {
	  	for(j=0;j<3;j++)
	  	{
            strinM[i][j]=n.nextInt();
	  	}
	  }	
	  for(i=0;i<3;i++)
	  {
	  	for(j=0;j<3;j++)
	  	{
           System.out.println(strinM);
	  	}
	  }	

	}

}