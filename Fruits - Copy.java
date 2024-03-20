import java.util.Scanner;
public class Fruits
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the fruits name");
    String select = sc.nextLine();
      if( select.equals("apple"))
      {
	  System.out.println("i want apple");
      }
      else if(select.equals("orange"))
      {
          System.out.println("i want orange");
      }
      else if(select.equals("banana"))
      {
          System.out.println("i want banana");
      } 
   }
}