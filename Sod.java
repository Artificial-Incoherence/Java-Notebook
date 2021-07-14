
import java.util.Scanner;

 
public class Sod{
 
    
    public static int getSum(int num)
    {
        int sum = 0;
 
        while (num != 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
 
        return sum;
    }
    public static boolean isMagic(int num){
        int sum = 0;
 
        while (num != 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        sum=sum/10;
        return sum==1;
            
    }
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the digit:");
        int num=obj.nextInt();
 
        System.out.println(getSum(num));
        if (isMagic(num)){
            System.out.println("Magic Number");
        }
        else
            System.out.println("Not a magic Number");
        
        obj.close();
    }
}       
