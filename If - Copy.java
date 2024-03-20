import java.util.Scanner;
public class If
{
 public static void main(String args[])
 {
  int a=5,b=10,c=20;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the no");
  int no=sc.nextInt();
  if(no == a)
  {
    System.out.println("The no is a");
  }
  else if(no == b)
  {
    System.out.println("The no is b");
  }
  else if(no == c)
  {
    System.out.println("The no is c");
  }
  else
  {
    System.out.println("No num is same");
  }  
 }
}