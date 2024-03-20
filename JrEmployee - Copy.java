import java.util.Scanner;
class add
{
	int x,z;
	String y;
   public void AddEmployee()
   {
   	 Scanner sc=new Scanner(System.in);       
	  int x = sc.nextInt();
	  String j = sc.next();
	  int z = sc.nextInt();
	   System.out.println("Id:" + x );
	  System.out.println("Name:" + j );
      System.out.println("Salary:" + z ); 
       System.out.println("You requested name is now Added"); 
   }
}
class view extends add(int x,int y,int z)
{
	
  public void ViewEmployee()
  {
	    System.out.println("    1        Dhinakar.C       Rs.35,000");
	 	System.out.println("    2        Nandhakumar.S    Rs.35,000");
	 	System.out.println("    3        Karthick.R       Rs.1,00,000");
	 	System.out.println(    x  );

  }
}
class exit
{
  public void Exit()
  {
  	   System.out.println("..Thank you..");
  }
}
class JrEmployee
{	
	String j,y;
  public static void main(String args[])
  {
     add obj1 = new add();
     view obj2 = new view();
     exit obj3 = new exit();
     String y = new String(); 
	Scanner sc=new Scanner(System.in);       
	
		System.out.println("Choose:");
		System.out.println("1-AddEmployee");
		int add = sc.nextInt();
	
     switch(add)
     {
        case 1:
	           obj1.AddEmployee();
	           break;
	  }
	  System.out.println("2-ViewEmployee");
	   int view = sc.nextInt();
	 switch(view)
	       {
	    case 2:
	           obj2.ViewEmployee();
	           break; 
	       } 
	   System.out.println("3-Exit"); 
	   int exit = sc.nextInt();
	   switch(exit)
	   {
	    case 3:
	           obj3.Exit();
			    break;
        default:
	           System.out.println("Enter tha Valide Number");
      } 
  }
  }
