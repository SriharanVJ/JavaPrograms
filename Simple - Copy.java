public class B
{
  public void disB()
  {
    System.out.println("This is drived class B");
  }
}
public class Simple extends B
{
 public void disA()
 {
 	System.out.println("This is derived class A");
 }
 public static void main(String[] args) 
 {
  A obj=new A();
  obj.disA();
  obj.disB();	
 } 

}