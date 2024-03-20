import java.util.Scanner;
public class str
{
    public static void main(String[] args) 
    {
        
        String temp;
		
        Scanner vj = new Scanner(System.in);
		A obj=new A();
		B obj2=new B();
		get obj3=new get();
		obj3.get_string();
       
		
		
		System.out.println("1-firstname+lastname,2-lastname+firstname");
		int var = vj.nextInt();
		
		
		switch(var)
		{
		case 1:
				obj.merge();
				break;
		case 2:
	            obj2.merge();	
				break;
		default:
				System.out.println("enter valid number");

		}
       
	}
}
class get
{
	static String[] nameA = new String[10];
    static String[] nameB = new String[10];
	 Scanner vj = new Scanner(System.in);
	void get_string()
	{
	
        
		
       
        System.out.println("Enter  the group A names:");
        for(int i = 0; i < 10; i++)
        {
            nameA[i] = vj.nextLine();
        }
		 System.out.println("Enter  the group B names:");
        for(int i = 0; i < 10; i++)
        {
            nameB[i] = vj.nextLine();
        }
	}
	
	
	
	
}
 
class A extends get
{
	 static String nameX[] = new String[10];
	void merge()
	{
		 for(int i = 0; i < 10; i++)
        {
            nameX[i] = nameA[i]+nameB[i];
        }
		System.out.println("merged strings:");
		for(int i = 0; i < 10; i++)
        {
            
            System.out.println(nameX[i]);
        }
		
		System.out.println("1-ascending:,  2-descending :");
		int var = vj.nextInt();
		
		
		switch(var)
		{
		case 1:
				sortA();
				break;
		case 2:
	            sortAB();	
				break;
		default:
				System.out.println("enter valid number");

		}
	
		
		
	}
		void sortA()
	{
		String temp;
		 for (int i = 0; i < 10; i++) 
        {
            for (int j = i + 1; j < 10; j++) 
            {
                if (nameX[i].compareTo(nameX[j])>0) 
                {
                    temp = nameX[i];
                    nameX[i] = nameX[j];
                    nameX[j] = temp;
                }
            }
        }
        System.out.println("Sorted Order:");
        for (int i = 0; i < 10; i++) 
        {
			System.out.println("   ");
            System.out.println(nameX[i]);
        }
		
	}
	void sortAB()
	{
		String temp;
		 for (int i = 0; i < 10; i++) 
        {
            for (int j = i + 1; j < 10; j++) 
            {
                if (nameX[i].compareTo(nameX[j])<0) 
                {
                    temp = nameX[i];
                    nameX[i] = nameX[j];
                    nameX[j] = temp;
                }
            }
        }
        System.out.println("Sorted Order:");
        for (int i = 0; i < 10; i++) 
        {
			System.out.println("   ");
            System.out.println(nameX[i]);
        }
		
	}
	
}
class B extends get
{
	 static String nameY[] = new String[10];
	void merge()
	{
		 for(int i = 0; i < 10; i++)
        {
            nameY[i] = nameB[i]+nameA[i];
        }
		System.out.println("merged strings:");
		for(int i = 0; i < 10; i++)
        {
            
            System.out.println(nameY[i]);
        }
		
		System.out.println("1-ascending:,  2-descending :");
		int var = vj.nextInt();
		
		
		switch(var)
		{
		case 1:
				sortB();
				break;
		case 2:
	            sortBB();	
				break;
		default:
				System.out.println("enter valid number");

		}
		
	}
	
	void sortB()
	{
		String temp;
		 for (int i = 0; i < 10; i++) 
        {
            for (int j = i + 1; j < 10; j++) 
            {
                if (nameY[i].compareTo(nameY[j])>0) 
                {
                    temp = nameY[i];
                    nameY[i] = nameY[j];
                    nameY[j] = temp;
                }
            }
        }
        System.out.println("Sorted Order:");
        for (int i = 0; i < 10; i++) 
        {
			System.out.println("   ");
            System.out.println(nameY[i]);
        }
	}
	void sortBB()
	{
		String temp;
		 for (int i = 0; i < 10; i++) 
        {
            for (int j = i + 1; j < 10; j++) 
            {
                if (nameY[i].compareTo(nameY[j])<0) 
                {
                    temp = nameY[i];
                    nameY[i] = nameY[j];
                    nameY[j] = temp;
                }
            }
        }
        System.out.println("Sorted Order:");
        for (int i = 0; i < 10; i++) 
        {
			System.out.println("   ");
            System.out.println(nameY[i]);
        }
	}
	
}



















	   
		
		
		
        
    
