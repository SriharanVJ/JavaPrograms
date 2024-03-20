import java.util.Scanner;
class div
{
 static void divid(int a,int b) 
 {
  try
  {
  System.out.println(a/b);
  }
  catch(ArithmeticException d)
  {
   throw d;
  } 
}
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  try
  {
   System.out.println("enter value");
   int a=sc.nextInt();
   int b=sc.nextInt();
   if(a>10 || b>10)
   {
     throw new InvalidInput("Plz enter less 10");
   }
   divid(a,b);  
  }
  catch(ArithmeticException a)
  {
   System.out.println(a);
  }
  catch(InputMismatchException im)
  {
   System.out.println(im);
  }
  catch(Exception a)
  {
   System.out.println(a);
  } 
 }
}