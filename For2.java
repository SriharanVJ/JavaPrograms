public class For2
{
   public static void main(String[] args)
   {    
     for(int i=11;i<20;i++)
     {
       int c=(i%2 == 0)?1:2;
       System.out.println(i);
       if(c == 1)
       {
         System.out.println("even");
       }
       else
       {
         System.out.println("odd");
       }

     }
        
   }
}