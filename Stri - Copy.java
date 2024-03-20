import java.util.Scanner;
public class Stri{
   public static void main(String []args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the fruits name");
  String select = sc.nextLine();
      if( select.equals("orange")){
	  System.out.println("i want orange");
      }
       else if(select.equals("apple")){
 System.out.println("i want apple");
   }
 else{
 System.out.println("i want mango");
} 
 /*int select=sc.nextInt();
System.out.println("select="+select);
  if(select == 1){
System.out.println("i ate mango");
}
else if(select == 2){
System.out.println("i ate apple");
}
else{
System.out.println("i ate orange");
}*/
   }
}