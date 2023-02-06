import java.util.*;
public class searchnumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int array=sc.nextInt();
        int numbers[]=new int[array];
        for(int i=0;i<array;i++){
            numbers[i]=sc.nextInt();

        }

        int x=sc.nextInt();
        for(int i=0;i<array;i++){
            if(numbers[i]==x){
                System.out.println("x is found at index: "+i);
            }
        }


    }
    
}
