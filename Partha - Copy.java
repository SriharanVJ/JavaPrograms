import java.util.Scanner;
public class Fruit
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
      else
      {
      System.out.println("i want orange");
      }
   }
}