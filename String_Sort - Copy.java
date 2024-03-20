import java.util.Arrays;
import java.util.Scanner;
 
public class String_Sort
{
     
    public static String sortString(String inputString)
    {
        
        char charArray[] = inputString.toCharArray();
         
         
        Arrays.sort(charArray);
         
         
        return new String(charArray);
    }
     
    
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter choice 1.String 2.integer ");
         int get=sc.nextInt();
         switch(get)
         {
          case 1:
            String inputString = "e2infosystem";
            
            String outputString = sortString(inputString);
            System.out.println("Input String : " + inputString);
            System.out.println("Output String : " + outputString);
            break;
          case 2:
          int[] number=new int[10];
            System.out.println("Enter numbers to sort");
            for(int i=0;i<10;i++)
            {
              number[i]=sc.nextInt();
            }
            for(int i=0;i<10;i++)
            {
              for(int j=i+1;j<10;j++)
              {
                if(number[i]<number[j])
                {
                    int temp;
                    temp=number[i];
                    number[i]=number[j];
                    number[j]=temp;
                }
              }
            }
            System.out.println("The descending order of a value is");
            for(int i=0;i<10;i++)
            {
             System.out.println(number[i]);
            }
         }
    }
}
