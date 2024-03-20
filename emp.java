import java.util.Scanner;
public class emp
{

   public static void main(String args[])
   {
     
	  Scanner vj=new Scanner(System.in);
	  get obj=new get();
	 
	  System.out.println("Choose:");
	while(true)
	{	   
	System.out.println("1-Add Employee,2-View Employee details,3-exit:");
		int var = vj.nextInt();
     switch(var)
     {
        case 1:
				obj.add();
				break;
		case 2:
	            obj.view();	
				break;
		case 3:
		       System.exit(0);
	           break;		
	  }
	}
   }
} 
class get extends emp
 {
	 Scanner vj=new Scanner(System.in);
	 
	 char[] name=new char[10];
	 int[] id=new int[10];
	 float[] sal=new float[10];
	  
	 void add()
	 {
		 System.out.println("how many employee you want to add:");
		 int j = vj.nextInt();
		
		 for(int i=0;i<j;i++)
		  {
		    System.out.println("Enter Employee name:");
		    name[i] = vj.next().charAt(0);
			System.out.println("Enter Employee ID:");
			id[i] = vj.nextInt();
			System.out.println("Enter Employee Salary:");
			sal[i] = vj.nextFloat();
	      }
	 } 
	 void view()
	 {
		  System.out.println("how many employee you added before:");
		  int j = vj.nextInt();
		  
		  for(int i=0;i<j;i++)
		  {
		   System.out.println("name :"+name[i]);
		   System.out.println("id:"+id[i]);
		   System.out.println("salary:"+sal[i]);
		  }
	 }
	
	 
}

	
	

        
