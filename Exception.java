import java.lang.ArithmeticException;
import java.lang.NullPointerException;
import java.util.Scanner;

public class Exception{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int n = 150;
        int a = 0;
        System.out.println("Enter Your data: ");
        a= sc.nextInt();
        try {
            switch (a) {
                case 0:
                    int b=n/a;
                    break;
                case 1 :
                    String st = null;
                    System.out.println(st.charAt(a));
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