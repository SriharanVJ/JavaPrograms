import java.util.Scanner;
public class Ternary_String
{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter fruit name");
   String fr=sc.nextLine();
   int c=fr.equals("apple")?1:fr.equals("orange")?2:fr.equals("banana")?3:4;
   System.out.println("c="+c);
 }
}