import java.util.Scanner;
import java.lang.Math;


class Prime_number{

    
    static boolean isPrime(int num)
   {

        if (num <= 1)
            return false;
        else if (num == 2)
            return true;
        else if (num % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(num); i += 2)
        {
            if (num % i == 0)
                return false;
        }
        return true;
    }
    public static int sumoftheprimedigits(int num){
        int sum=0;
        while (num != 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;

    }
    

    public static void main(String args[]){

        int sum=0;
        System.out.println("Enter the number to chck prime or not:");
        Scanner scan= new Scanner(System.in);
        int num=scan.nextInt();
        if (isPrime(num)){
            System.out.println("True");
            System.out.println("Sum of the Prime Digits will be:");
            System.out.println(sumoftheprimedigits(num));
        }
        else{
            System.out.println("False");

        }
        scan.close();

    }
}