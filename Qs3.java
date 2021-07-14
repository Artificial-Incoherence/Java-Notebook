public class Qs3 {
    static int findgcd(int a,int b){
        if(a<0||b<0){
            return -1;
        }
        if(b!=0){
            return findgcd(b,a%2);
        }
        else{
            return a;
        }
    }
    public static void main(String args []){
    
        System.out.println(findgcd(2,0)); 
        System.out.println(findgcd(-1,-1)); 
        System.out.println(findgcd(40,60)); 
        System.out.println(findgcd(-3,-1)); 
        
        
    
    
    
    }

    
}
