import java.util.Scanner;
public class Nested_If
{
 public static void main(String args[])
 {
  int a;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a value");
  int c=sc.nextInt();
  if(c == 2)
  {
   if(c%2 == 0)
   { 
    System.out.println("a is even");
   } 
  }
 }
}