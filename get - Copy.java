import java.util.Scanner;
public class Get
{ 
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in); 
  System.out.println("Enter ur first no");
  int firstNumber = sc.nextInt();
  System.out.println("Enter ur second no");
  int secondNumber = sc.nextInt();
  int s=firstNumber+secondNumber;
  System.out.println(s);
 }
}