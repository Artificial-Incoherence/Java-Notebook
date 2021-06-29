import java.lang.ArithmeticException;
import java.lang.NullPointerException;
import java.util.Scanner;

public class Exception{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int n = 150;
        int x = 0;
        System.out.println("Enter the opertion: ");
        x= sc.nextInt();
        try {
            switch (x) {
                case 0:
                    int a= n/x;
                    break;
                case 1 :
                    String s = null;
                    System.out.println(s.charAt(x));
                default:
                    System.out.println("No exception.");
                    break;
            }
        }
        catch(ArithmeticException | NullPointerException e){
            System.out.println(e);
        }
        sc.close();
        
            
        
        
        
    }
}