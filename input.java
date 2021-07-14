
import java.util.InputMismatchException;
import java.util.Scanner;
public class input {
    public static void main (String args[]){
        int[] x = new int[10]; 
        int sum=0; 
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the number of array: ");
            int n=sc.nextInt();
            for (int i=0;i<n;i++){
                System.out.printf("Enter %d array: ",(i+1));
                x[i] = sc.nextInt();
                sum = sum+x[i];
                

            }
            System.out.println("The total sum of the array:"+sum);
        
        }
        catch(InputMismatchException e){
            System.out.println("You entered bad data");;
        }
        sc.close();
        
     }
    
}
