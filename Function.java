import java.util.*;
public class Function {
    public static int productOfTwo(int a,int b){
         int mul=a*b;
        
        
        return mul;
    }
  public static void main(String args[])  {
    //function -- returnType functionName(type arg1,type arg2){
Scanner sc= new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int mul = productOfTwo(a,b);
System.out.println( mul);//call function

  }
}
