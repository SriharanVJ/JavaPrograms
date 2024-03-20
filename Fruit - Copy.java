import java.util.Scanner;
public class fruit {
   public static void main(String []args) {
    
    Scanner a=new Scanner(System.in); 
     System.out.println("enter the fruit names");
     /*String ab = a.nextLine();
 System.out.println(ab);

    if(ab.equals("apple"))
    {
        System.out.println(" I EATS APPLE");
    }
   else if(ab=="orange")
   {
      System.out.println("I EATS ORANGE");
   }
  else
  {
     System.out.println("I EATS OTHER FRUITS");
   }*/
    /*float ab=a.nextFloat();
    System.out.println("ab="+ab);
  if(ab==1.5)
   {
   System.out.println(" I EATS APPLE");
   }
  else if(ab==2.3)
  {
   System.out.println("I EATS ORANGE");
  }
 else
  {
    System.out.println("I EATS OTHER FRUITS");
  }*/
 String ab= a.nextLine();
   int q=ab.equals("apple")?1:ab.equals("ORANGE")?2:ab.equals("graps")?3:4;
  System.out.println("q="+q);
  
   }
}