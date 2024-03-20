public class Second_Large{  
static int two(int[] a)
{    
 for(int i=0;i<a.length;i++)   
 {  
   for(int j=i+1;j<a.length;j++)   
   {  
                if(a[i]> a[j])   
                {  
                    int temp=a[i];  
                    a[i]=a[j];  
                    a[j]=temp;  
                }  
    }  
  }  
  for(int i=0;i<a.length;i++)
  {
    System.out.println(a[i]);
  }   
   return a[a.length-2];  
  
}  
public static void main(String args[]){  
int m[]={10,4,56,34,53,23,24,54,92};  
 System.out.println("Second big:"+two(m));  
 
}}  