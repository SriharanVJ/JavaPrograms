import MyPackage.*;
public class Sum{

     public static void main(String []args){
        int a=10;
        int b=10;
        int sum=add(a,b);
        System.out.println(sum);
     }
    private static int add(int a, int b){
        return a+b;
    }
}