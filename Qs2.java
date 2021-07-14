interface Number{
    int findsqr(int n);


}
class A implements Number{
    public int findsqr(int n){
        
        return n*n;         
                 

    }

    
}
public class Qs2{
    public static void main(String[] args){
    
        A obj=new A();
        System.out.println(obj.findsqr(-3)); 
        System.out.println(obj.findsqr(10)); 
        
    
    
    
    }
}