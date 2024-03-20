import java.util.Scanner;
class A
{
   public void display(int x)
   {
      System.out.println(x);
	  
   }
}
class add extends A
{
   public void addition(int x, int y)
   {
	   int ans;
	   ans=x+y;
	   System.out.println("addition ans is:");
      
	  display(ans);
   }
}
class sub extends A
{
  public void subtraction(int x, int y)
  {
     int ans;
	   ans=x-y;
	   System.out.println("subtraction ans is:");
     
	  display(ans);
	
  }
}
class mul extends A
{
  public void multiplication(int x, int y)
  {
     int ans;
	   ans=x*y;
	   System.out.println("multiplication ans is:");
      
	  display(ans);
	
  }
}
class div extends A
{
  public void division(int x, int y)
  {
     int ans;
	   ans=x/y;
	   System.out.println("division ans is:");
      
	  display(ans);
	
  }
}
class arithmetic
{
	
  public static void main(String args[])
  {
     add obj1 = new add();
     sub obj2 = new sub();
     mul obj3 = new mul();
     div obj4 = new div();
	 Scanner vj=new Scanner(System.in);
		System.out.println("enter two value:");
		int a = vj.nextInt();
		int b = vj.nextInt();
		System.out.println("Choose:");
		System.out.println("1-addition,2-Subtraction,3-multiplication,4-division:");
		int var = vj.nextInt();
		
		
     switch(var)
     {
        case 1:
	           obj1.addition(a,b);
			    break;
	    case 2:
	           obj2.subtraction(a,b);
			    break;
	    case 3:
	           obj3.multiplication(a,b);
			    break;
	    case 4:
	           obj4.division(a,b);
			    break;
        default:
	           System.out.println("enter valid num ");
      }
		
		
		
		
		
		
     
    
	 
  }
}