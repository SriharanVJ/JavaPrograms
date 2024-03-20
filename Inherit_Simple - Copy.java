public class Inherit_Simple
{
   class animal
   {
   	static void sleep()
   	{
   		System.out.println("sleeping");
   	}
   }
   class cat extends animal
   {
   static void eat()
   	{
   		System.out.println("Eating..");
   	}
   }
  public static void main(String[] args) 
  {
    cat c= new cat();
    c.eat();
    c.sleep();	
  }

}