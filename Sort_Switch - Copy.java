import java.util.Scanner;
import java.util.Arrays;
class get
{
	Scanner sc=new Scanner(System.in);
	 static String[] name1=new String[3];
	 static String[] name2=new String[3];
	public void get_value()
	{
	  for(int i=0;i<3;i++)
	  {
          name1[i]=sc.nextLine();
	  }
	  for(int i=0;i<3;i++)
	  {
          name2[i]=sc.nextLine();
	  }
	}

}
class add extends get
{
	static String[] name3=new String[3];
	  
     public void add_value()
     {
        for(int i=0;i<3;i++)
        {
        	name3[i]=name1[i]+name2[i];
        }
        for(int i=0;i<3;i++)
        {
        	System.out.println(name3[i]);
        }  
        sort_value();      
     }
      void sort_value()
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Choose one 1.ascending 2.descending");
        int net=sc.nextInt();
        switch(net)
        {
        	case 1:
        	 ascend();
        	 break;
        	default:
        	 break;
        }

	}
	void ascend()
	{
		String temp;
		for(int i=0;i<3;i++)
            {
              for(int j=i+1;j<3;j++)
              {
                if(name3[i].compareTo(name3[j]) > 0)
                {
                    
                    temp=name3[i];
                    name3[i]=name3[j];
                    name3[j]=temp;
                }
              }
            }
         System.out.println("Sorted Order:");
        for (int i = 0; i < 3; i++) 
        {
			System.out.println("   ");
            System.out.println(name3[i]);
        }
	}

}

class Sort_Switch
{
	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  get obj=new get();
	  add obj2=new add();
	  
	  
      System.out.println("Enter the choice to done 1.get 2.add 3.sort ");
      int get=sc.nextInt();
      switch(get)
      {
      	case 1:
          System.out.println("This is for get values of array");
           obj.get_value();
      	case 2:
      	   System.out.println("This is for add of two array");
      	   obj2.add_value();
      	  
      	
      }
     
      
	}

}