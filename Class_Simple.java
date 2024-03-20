class ClassA 
{
    public void dispA()
    {
        System.out.println("disp() method of ClassA");
    }
}
public class Class_Simple extends ClassA 
{
    public void dispB()
    {
        System.out.println("disp() method of ClassB");
    }
    public static void main(String args[])
    {
        
        Class_Simple b = new Class_Simple();
         
        b.dispA();
         
        b.dispB();
    }
}