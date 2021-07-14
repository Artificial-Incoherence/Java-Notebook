import java.util.Scanner;

public class Arithmetic{
    
    public static void main(String args []){

        System.out.println("Enter number the number of test cases");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter the value of a:");
            int a= sc.nextInt();
            System.out.println("Enter the value of b:");
            int b= sc.nextInt();
            try{
            
                int result = a/b;
                System.out.println ("Result: "+result);
            }
            catch(ArithmeticException e){
                System.out.println("Exception caught : Division by zero");
                
    
            }
        sc.close();
        

            
        }

        
        

    
        

    
    
    
    }
    
}